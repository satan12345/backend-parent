package com.mooc.meeting.film.hall.service;

import com.mooc.meeting.film.hall.controller.vo.HallSavedReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsReqVO;
import com.mooc.meeting.film.hall.controller.vo.HallsRespVO;
import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表服务接口
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
public interface MoocHallFilmInfoTService {


    List<HallsRespVO> describeHalls(HallsReqVO hallsReqVO);

    /**
     * 新增播放厅
     * @param hallSavedReqVO
     */
    void saveHall(HallSavedReqVO hallSavedReqVO);
}