package com.mooc.meeting.film.hall.service.impl;

import com.mooc.meeting.film.hall.entity.MoocFieldT;
import com.mooc.meeting.film.hall.dao.MoocFieldTDao;
import com.mooc.meeting.film.hall.service.MoocFieldTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 放映场次表(MoocFieldT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 19:29:08
 */
@Service("moocFieldTService")
public class MoocFieldTServiceImpl implements MoocFieldTService {
    @Resource
    private MoocFieldTDao moocFieldTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocFieldT queryById(Integer uuid) {
        return this.moocFieldTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocFieldT> queryAllByLimit(int offset, int limit) {
        return this.moocFieldTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocFieldT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFieldT insert(MoocFieldT moocFieldT) {
        this.moocFieldTDao.insert(moocFieldT);
        return moocFieldT;
    }

    /**
     * 修改数据
     *
     * @param moocFieldT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFieldT update(MoocFieldT moocFieldT) {
        this.moocFieldTDao.update(moocFieldT);
        return this.queryById(moocFieldT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocFieldTDao.deleteById(uuid) > 0;
    }
}