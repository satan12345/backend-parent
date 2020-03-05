package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影片与演员映射表(MoocFilmActorT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
public interface MoocFilmActorTDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmActorT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmActorT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocFilmActorT 实例对象
     * @return 对象列表
     */
    List<MoocFilmActorT> queryAll(MoocFilmActorT moocFilmActorT);

    /**
     * 新增数据
     *
     * @param moocFilmActorT 实例对象
     * @return 影响行数
     */
    int insert(MoocFilmActorT moocFilmActorT);

    /**
     * 修改数据
     *
     * @param moocFilmActorT 实例对象
     * @return 影响行数
     */
    int update(MoocFilmActorT moocFilmActorT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}