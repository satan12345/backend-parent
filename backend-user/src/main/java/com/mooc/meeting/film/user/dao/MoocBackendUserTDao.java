package com.mooc.meeting.film.user.dao;

import com.mooc.meeting.film.common.config.MyMapper;
import com.mooc.meeting.film.user.entity.MoocBackendUserT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 后台用户表(MoocBackendUserT)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-29 15:30:52
 */
public interface MoocBackendUserTDao extends MyMapper<MoocBackendUserT> {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocBackendUserT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocBackendUserT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocBackendUserT 实例对象
     * @return 对象列表
     */
    List<MoocBackendUserT> queryAll(MoocBackendUserT moocBackendUserT);

    /**
     * 新增数据
     *
     * @param moocBackendUserT 实例对象
     * @return 影响行数
     */
    int insert(MoocBackendUserT moocBackendUserT);

    /**
     * 修改数据
     *
     * @param moocBackendUserT 实例对象
     * @return 影响行数
     */
    int update(MoocBackendUserT moocBackendUserT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}