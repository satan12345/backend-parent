package com.mooc.meeting.film.user.dao;


import com.mooc.meeting.film.backend.common.config.MyMapper;
import com.mooc.meeting.film.user.entity.MoocUserT;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户表(MoocUserT)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-28 16:04:31
 */

public interface MoocUserTDao extends MyMapper<MoocUserT> {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocUserT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocUserT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocUserT 实例对象
     * @return 对象列表
     */
    List<MoocUserT> queryAll(MoocUserT moocUserT);

    /**
     * 新增数据
     *
     * @param moocUserT 实例对象
     * @return 影响行数
     */
    int insert(MoocUserT moocUserT);

    /**
     * 修改数据
     *
     * @param moocUserT 实例对象
     * @return 影响行数
     */
    int update(MoocUserT moocUserT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}