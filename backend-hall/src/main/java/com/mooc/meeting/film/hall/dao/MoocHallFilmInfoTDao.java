package com.mooc.meeting.film.hall.dao;

import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
public interface MoocHallFilmInfoTDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocHallFilmInfoT queryById(Integer uuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocHallFilmInfoT> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 对象列表
     */
    List<MoocHallFilmInfoT> queryAll(MoocHallFilmInfoT moocHallFilmInfoT);

    /**
     * 新增数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 影响行数
     */
    int insert(MoocHallFilmInfoT moocHallFilmInfoT);

    /**
     * 修改数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 影响行数
     */
    int update(MoocHallFilmInfoT moocHallFilmInfoT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 影响行数
     */
    int deleteById(Integer uuid);

}