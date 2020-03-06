package com.mooc.meeting.film.backendcinema.controller;

import com.mooc.meeting.film.backendcinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meeting.film.backendcinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import com.mooc.meeting.film.backendcinema.service.MoocCinemaTService;
import com.mooc.meeting.film.common.annotation.UseResponseAdvice;
import com.mooc.meeting.film.utils.vo.BaseResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影院信息表(MoocCinemaT)表控制层
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
@RestController
@UseResponseAdvice
@RequestMapping("moocCinemaT")
@Slf4j
public class MoocCinemaTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocCinemaTService moocCinemaTService;

    @RequestMapping(value = "/cinema/add",method = RequestMethod.POST)
    public void saveCinema(@RequestBody CinemaSavedReqVO cinemaSavedReqVO)  {

//        // 数据验证
//        cinemaSavedReqVO.checkParam();

        moocCinemaTService.saveCinema(cinemaSavedReqVO);

//        return BaseResponseVO.success();
    }

    @RequestMapping(value = "describeCinemas",method = RequestMethod.GET)
    public List<DescribeCinemasRespVO> describeCinemas(Integer pageSize,Integer pageNo){

        List<DescribeCinemasRespVO> describeCinemasRespVOIPage =
                moocCinemaTService.describeCinemas(pageNo, pageSize);

//        if(basePageVO.getNowPage()>10000){
//            throw new CommonServiceException(400,"nowPage太大了，不支持此处理");
////            try {
////                Thread.sleep(2000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        }
            return describeCinemasRespVOIPage;
        // TODO 调用封装的分页返回方法


    }

}