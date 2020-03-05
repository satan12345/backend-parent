package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmInfoT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影片主表(MoocFilmInfoT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-04 17:01:36
 */
public interface MoocFilmInfoTDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmInfoT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmInfoT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocFilmInfoT 实例对象
     * @return 对象列表
     */
    List<MoocFilmInfoT> queryAll(MoocFilmInfoT moocFilmInfoT);

    /**
     * 新增数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 影响行数
     */
    int insert(MoocFilmInfoT moocFilmInfoT);

    /**
     * 修改数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 影响行数
     */
    int update(MoocFilmInfoT moocFilmInfoT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}