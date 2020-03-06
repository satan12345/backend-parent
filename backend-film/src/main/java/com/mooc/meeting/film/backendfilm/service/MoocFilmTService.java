package com.mooc.meeting.film.backendfilm.service;

import com.mooc.meeting.film.backendfilm.controller.vo.FilmSavedReqVO;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;

import java.util.List;

/**
 * 影片主表(MoocFilmT)表服务接口
 *
 * @author makejava
 * @since 2020-03-04 17:00:21
 */
public interface MoocFilmTService {



    List<DescribeActorsRespVO> describeActors(Integer pageNo, Integer pageSize);

    List<DescribeFilmsRespVO> describeFilms(Integer pageNo, Integer pageSize);

    /**
     * 根据id查询
     * @param filmId
     * @return
     */
    DescribeFilmRespVO describeFilmById(String filmId);

    /**
     * 保存电影
     * @param filmSavedReqVO
     * @return
     */
    Integer saveFilm(FilmSavedReqVO filmSavedReqVO);
}