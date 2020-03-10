package com.mooc.meeting.film.hall.service;

import com.mooc.meeting.film.hall.entity.MoocFieldT;
import java.util.List;

/**
 * 放映场次表(MoocFieldT)表服务接口
 *
 * @author makejava
 * @since 2020-03-06 19:29:08
 */
public interface MoocFieldTService {

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocFieldT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MoocFieldT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocFieldT 实例对象
     * @return 实例对象
     */
    MoocFieldT insert(MoocFieldT moocFieldT);

    /**
     * 修改数据
     *
     * @param moocFieldT 实例对象
     * @return 实例对象
     */
    MoocFieldT update(MoocFieldT moocFieldT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);

}