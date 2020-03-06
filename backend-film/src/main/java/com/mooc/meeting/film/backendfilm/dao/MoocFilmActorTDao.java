package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import com.mooc.meeting.film.common.config.MyMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影片与演员映射表(MoocFilmActorT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
public interface MoocFilmActorTDao extends MyMapper<MoocFilmActorT> {


}