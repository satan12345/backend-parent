package com.mooc.meeting.film.hall.controller;

import com.mooc.meeting.film.common.annotation.UseResponseAdvice;
import com.mooc.meeting.film.hall.controller.vo.HallSavedReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsRespVO;
import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import com.mooc.meeting.film.hall.service.MoocHallFilmInfoTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表控制层
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
@RestController
@RequestMapping("/hall")
@UseResponseAdvice
public class MoocHallFilmInfoTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocHallFilmInfoTService moocHallFilmInfoTService;

    /**
     * 获取影院全部播放厅接口
     * @param hallsReqVO
     * @return
     */
    @RequestMapping(value = "/describeHalls", method = RequestMethod.GET)
    public List<HallsRespVO> describeHalls(HallsReqVO hallsReqVO) {


        List<HallsRespVO> list = moocHallFilmInfoTService.describeHalls(hallsReqVO);
        return list;
//        Map<String, Object> halls = descrbePageResult(page, "halls");
//
//        return BaseResponseVO.success(halls);


    }

    @RequestMapping(value = "/hall:add",method = RequestMethod.POST)
    public void saveHall(@RequestBody HallSavedReqVO hallSavedReqVO) {

        //hallSavedReqVO.checkParam();

        moocHallFilmInfoTService.saveHall(hallSavedReqVO);

        //return BaseResponseVO.success();
    }



}