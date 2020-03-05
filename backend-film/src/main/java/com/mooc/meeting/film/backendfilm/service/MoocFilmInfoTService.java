package com.mooc.meeting.film.backendfilm.service;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmInfoT;
import java.util.List;

/**
 * 影片主表(MoocFilmInfoT)表服务接口
 *
 * @author makejava
 * @since 2020-03-04 17:01:36
 */
public interface MoocFilmInfoTService {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmInfoT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmInfoT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 实例对象
     */
    MoocFilmInfoT insert(MoocFilmInfoT moocFilmInfoT);

    /**
     * 修改数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 实例对象
     */
    MoocFilmInfoT update(MoocFilmInfoT moocFilmInfoT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

}