package com.mooc.meeting.film.backendfilm.service;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import java.util.List;

/**
 * 影片与演员映射表(MoocFilmActorT)表服务接口
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
public interface MoocFilmActorTService {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFilmActorT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFilmActorT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocFilmActorT 实例对象
     * @return 实例对象
     */
    MoocFilmActorT insert(MoocFilmActorT moocFilmActorT);

    /**
     * 修改数据
     *
     * @param moocFilmActorT 实例对象
     * @return 实例对象
     */
    MoocFilmActorT update(MoocFilmActorT moocFilmActorT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

}