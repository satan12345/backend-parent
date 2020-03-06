package com.mooc.meeting.film.backendcinema.service;

import com.mooc.meeting.film.backendcinema.controller.vo.CinemaSavedReqVO;
import com.mooc.meeting.film.backendcinema.controller.vo.DescribeCinemasRespVO;
import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import java.util.List;

/**
 * 影院信息表(MoocCinemaT)表服务接口
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
public interface MoocCinemaTService {


    void saveCinema(CinemaSavedReqVO cinemaSavedReqVO);

    List<DescribeCinemasRespVO> describeCinemas(Integer pageNo, Integer pageSize);
}