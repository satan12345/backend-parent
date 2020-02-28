package com.mooc.meeting.film.backend.common.service;

import com.mooc.meeting.film.backend.common.entity.MoocUserT;
import java.util.List;

/**
 * 用户表(MoocUserT)表服务接口
 *
 * @author makejava
 * @since 2020-02-28 16:04:31
 */
public interface MoocUserTService {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocUserT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocUserT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocUserT 实例对象
     * @return 实例对象
     */
    MoocUserT insert(MoocUserT moocUserT);

    /**
     * 修改数据
     *
     * @param moocUserT 实例对象
     * @return 实例对象
     */
    MoocUserT update(MoocUserT moocUserT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

}