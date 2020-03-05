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

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocFilmT 实例对象
     * @return 实例对象
     */
    MoocFilmT insert(MoocFilmT moocFilmT);

    /**
     * 修改数据
     *
     * @param moocFilmT 实例对象
     * @return 实例对象
     */
    MoocFilmT update(MoocFilmT moocFilmT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

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