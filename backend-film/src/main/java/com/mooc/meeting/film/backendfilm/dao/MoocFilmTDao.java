package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;
import com.mooc.meeting.film.common.config.MyMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影片主表(MoocFilmT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-04 17:00:21
 */
public interface MoocFilmTDao extends MyMapper<MoocFilmT> {

  

    List<DescribeFilmsRespVO> describeFilms(int skip, Integer pageSize);

    /**
     * 查询电影信息
     * @param filmId
     * @return
     */
    DescribeFilmRespVO describeFilmById(@Param("filmId")String filmId);
}