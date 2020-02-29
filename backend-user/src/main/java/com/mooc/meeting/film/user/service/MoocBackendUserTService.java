package com.mooc.meeting.film.user.service;

import com.mooc.meeting.film.user.entity.MoocBackendUserT;
import com.mooc.meeting.film.utils.exception.CommonServiceException;

import java.util.List;

/**
 * 后台用户表(MoocBackendUserT)表服务接口
 *
 * @author makejava
 * @since 2020-02-29 15:30:52
 */
public interface MoocBackendUserTService {

    /**
     *
     * @param username
     * @param password
     * @throws CommonServiceException
     */
    String checkUser(String username, String password) throws CommonServiceException;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    MoocBackendUserT queryById(Integer uuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MoocBackendUserT> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param moocBackendUserT 实例对象
     * @return 实例对象
     */
    MoocBackendUserT insert(MoocBackendUserT moocBackendUserT);

    /**
     * 修改数据
     *
     * @param moocBackendUserT 实例对象
     * @return 实例对象
     */
    MoocBackendUserT update(MoocBackendUserT moocBackendUserT);

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uuid);


}