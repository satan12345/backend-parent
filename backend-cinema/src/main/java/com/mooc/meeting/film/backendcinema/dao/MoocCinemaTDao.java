package com.mooc.meeting.film.backendcinema.dao;

import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import com.mooc.meeting.film.common.config.MyMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影院信息表(MoocCinemaT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
public interface MoocCinemaTDao extends MyMapper<MoocCinemaT> {


}