package com.mooc.meeting.film.hall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mooc.meeting.film.hall.controller.vo.HallSavedReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsRespVO;
import com.mooc.meeting.film.hall.dao.MoocFieldTDao;
import com.mooc.meeting.film.hall.entity.MoocFieldT;
import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import com.mooc.meeting.film.hall.dao.MoocHallFilmInfoTDao;
import com.mooc.meeting.film.hall.service.MoocHallFilmInfoTService;
import com.mooc.meeting.film.utils.util.ToolUtils;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
@Service("moocHallFilmInfoTService")
public class MoocHallFilmInfoTServiceImpl implements MoocHallFilmInfoTService {
    @Resource
    private MoocHallFilmInfoTDao moocHallFilmInfoTDao;

    @Resource
    MoocFieldTDao moocFieldTDao;
    @Autowired
    private LoadBalancerClient eurekaClient;
    @Resource
    RestTemplate restTemplate;

    /**
     * 查询影厅列表
     * @param hallsReqVO
     * @return
     */
    @Override
    public List<HallsRespVO> describeHalls(HallsReqVO hallsReqVO) {
//        MoocFieldT moocFieldT=new MoocFieldT();
//        moocFieldT.setCinemaId(Integer.valueOf(hallsReqVO.getCinemaId()));
//        moocFieldTDao.select(moocFieldT);
        List<HallsRespVO> result=moocFieldTDao.describeHalls(hallsReqVO.getCinemaId());
        return result;
    }

    /**
     * 保存影厅信息
     * @param reqVO
     */
    @Override
    public void saveHall(HallSavedReqVO reqVO) {
        // 播放厅的列表数据
        MoocFieldT field = new MoocFieldT();

        field.setCinemaId(ToolUtils.str2Int(reqVO.getCinemaId()));
        field.setFilmId(ToolUtils.str2Int(reqVO.getFilmId()));
        field.setBeginTime(reqVO.getBeginTime());
        field.setEndTime(reqVO.getEndTime());
        field.setHallId(ToolUtils.str2Int(reqVO.getHallTypeId()));
        field.setHallName(reqVO.getHallName());
        field.setPrice(ToolUtils.str2Int(reqVO.getFilmPrice()));

        moocFieldTDao.insert(field);
        // 播放厅对应的影片数据， 影片冗余数据， 缓存里有一份
        MoocHallFilmInfoT hallFilmInfo = describeFilmInfo(reqVO.getFilmId());

        moocHallFilmInfoTDao.insert(hallFilmInfo);

    }

    // 播放厅对应的影片数据， 影片冗余数据， 缓存里有一份
    private MoocHallFilmInfoT describeFilmInfo(String filmId) {
        // GET REGISTER
        ServiceInstance choose = eurekaClient.choose("film-service");
        // 组织调用参数
        String hostname = choose.getHost();
        int port = choose.getPort();

        String uri = "/films/"+filmId;

        String url = "http://"+hostname+":"+port + uri;

        // 通过restTemplate调用影片服务
        JSONObject baseResponseVO = restTemplate.getForObject(url, JSONObject.class);

        // 解析返回值
        JSONObject dataJson = baseResponseVO.getJSONObject("data");

        // 组织参数
        MoocHallFilmInfoT hallFilmInfo = new MoocHallFilmInfoT();

//        "filmId":"1",
//        "filmName":"我不是药神",
//        "filmLength":"132",
//        "filmCats":"喜剧,剧情",
//        "actors":"程勇,曹斌,吕受益,刘思慧",
//        "imgAddress":"films/238e2dc36beae55a71cabfc14069fe78236351.jpg",

        hallFilmInfo.setFilmId(dataJson.getIntValue("filmId"));
        hallFilmInfo.setFilmName(dataJson.getString("filmName"));
        hallFilmInfo.setFilmLength(dataJson.getString("filmLength"));
        hallFilmInfo.setFilmCats(dataJson.getString("filmCats"));
        hallFilmInfo.setActors(dataJson.getString("actors"));
        hallFilmInfo.setImgAddress(dataJson.getString("imgAddress"));

        return hallFilmInfo;
    }

//    // 播放厅对应的影片数据， 影片冗余数据， 缓存里有一份
//    private MoocHallFilmInfoT describeFilmInfo(String filmId) {
//        // 解析返回值
//        BaseResponseVO<DescribeFilmRespVO> baseResponseVO = filmFeignApi.describeFilmById(filmId);
//        DescribeFilmRespVO filmResult = baseResponseVO.getData();
//        if(filmResult ==null || ToolUtils.strIsNull(filmResult.getFilmId())){
//            throw new CommonServiceException(404,"抱歉，未能找到对应的电影信息，filmId : "+filmId);
//        }
//
//        // 组织参数
//        MoocHallFilmInfoT hallFilmInfo = new MoocHallFilmInfoT();
//
//        hallFilmInfo.setFilmId(ToolUtils.str2Int(filmResult.getFilmId()));
//        hallFilmInfo.setFilmName(filmResult.getFilmName());
//        hallFilmInfo.setFilmLength(filmResult.getFilmLength());
//        hallFilmInfo.setFilmCats(filmResult.getFilmCats());
//        hallFilmInfo.setActors(filmResult.getActors());
//        hallFilmInfo.setImgAddress(filmResult.getImgAddress());
//
//        return hallFilmInfo;
//    }
}