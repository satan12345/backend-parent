package com.mooc.meeting.film.hall.service;

import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表服务接口
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
public interface MoocHallFilmInfoTService {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocHallFilmInfoT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocHallFilmInfoT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 实例对象
     */
    MoocHallFilmInfoT insert(MoocHallFilmInfoT moocHallFilmInfoT);

    /**
     * 修改数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 实例对象
     */
    MoocHallFilmInfoT update(MoocHallFilmInfoT moocHallFilmInfoT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

}