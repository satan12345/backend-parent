package com.mooc.meeting.film.backend.common.service.impl;

import com.mooc.meeting.film.backend.common.entity.MoocUserT;
import com.mooc.meeting.film.backend.common.dao.MoocUserTDao;
import com.mooc.meeting.film.backend.common.service.MoocUserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(MoocUserT)表服务实现类
 *
 * @author makejava
 * @since 2020-02-28 16:04:31
 */
@Service("moocUserTService")
public class MoocUserTServiceImpl implements MoocUserTService {
    @Resource
    private MoocUserTDao moocUserTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocUserT queryById(Integer uuid) {
        return this.moocUserTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocUserT> queryAllByLimit(int offset, int limit) {
        return this.moocUserTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocUserT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocUserT insert(MoocUserT moocUserT) {
        this.moocUserTDao.insert(moocUserT);
        return moocUserT;
    }

    /**
     * 修改数据
     *
     * @param moocUserT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocUserT update(MoocUserT moocUserT) {
        this.moocUserTDao.update(moocUserT);
        return this.queryById(moocUserT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocUserTDao.deleteById(uuid) > 0;
    }
}