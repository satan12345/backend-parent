package com.mooc.meeting.film.backendfilm.dao;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
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

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocFilmT 实例对象
     * @return 对象列表
     */
    List<MoocFilmT> queryAll(MoocFilmT moocFilmT);

    /**
     * 新增数据
     *
     * @param moocFilmT 实例对象
     * @return 影响行数
     */
    int insert(MoocFilmT moocFilmT);

    /**
     * 修改数据
     *
     * @param moocFilmT 实例对象
     * @return 影响行数
     */
    int update(MoocFilmT moocFilmT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}