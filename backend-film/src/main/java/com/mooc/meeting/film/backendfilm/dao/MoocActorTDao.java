package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocActorT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 演员表(MoocActorT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-04 17:05:25
 */
public interface MoocActorTDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocActorT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocActorT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocActorT 实例对象
     * @return 对象列表
     */
    List<MoocActorT> queryAll(MoocActorT moocActorT);

    /**
     * 新增数据
     *
     * @param moocActorT 实例对象
     * @return 影响行数
     */
    int insert(MoocActorT moocActorT);

    /**
     * 修改数据
     *
     * @param moocActorT 实例对象
     * @return 影响行数
     */
    int update(MoocActorT moocActorT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}