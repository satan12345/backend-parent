package com.mooc.meeting.film.backendcinema.service.impl;

import com.mooc.meeting.film.backendcinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meeting.film.backendcinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import com.mooc.meeting.film.backendcinema.dao.MoocCinemaTDao;
import com.mooc.meeting.film.backendcinema.service.MoocCinemaTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影院信息表(MoocCinemaT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
@Service("moocCinemaTService")
public class MoocCinemaTServiceImpl implements MoocCinemaTService {
    @Resource
    private MoocCinemaTDao moocCinemaTDao;


    @Override
    public void saveCinema(CinemaSavedReqVO cinemaSavedReqVO) {
        MoocCinemaT cinema = new MoocCinemaT();

        // TODO 填写具体参数
        cinema.setCinemaName("");
        cinema.setCinemaPhone("");
        cinema.setBrandId(0);
        cinema.setAreaId(0);
        cinema.setHallIds("");
        cinema.setImgAddress("");
        cinema.setCinemaAddress("");
        cinema.setMinimumPrice(0);

        // TODO 记得把实体对象进行保存
    }

    @Override
    public List<DescribeCinemasRespVO> describeCinemas(Integer pageNo, Integer pageSize) {
        return null;
    }
}