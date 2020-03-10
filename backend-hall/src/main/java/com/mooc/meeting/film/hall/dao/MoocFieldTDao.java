package com.mooc.meeting.film.hall.dao;

import com.mooc.meeting.film.common.config.MyMapper;
import com.mooc.meeting.film.hall.controller.vo.HallsRespVO;
import com.mooc.meeting.film.hall.entity.MoocFieldT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 放映场次表(MoocFieldT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-06 19:29:08
 */
public interface MoocFieldTDao extends MyMapper<MoocFieldT> {

    /**
     * 影厅列表查询
     * @param cinemaId
     * @return
     */
    List<HallsRespVO> describeHalls(@Param("cinemaId") String cinemaId);
}