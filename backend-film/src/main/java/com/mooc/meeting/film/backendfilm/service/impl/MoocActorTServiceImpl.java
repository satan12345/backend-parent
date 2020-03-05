package com.mooc.meeting.film.backendfilm.service.impl;

import com.mooc.meeting.film.backendfilm.entity.MoocActorT;
import com.mooc.meeting.film.backendfilm.dao.MoocActorTDao;
import com.mooc.meeting.film.backendfilm.service.MoocActorTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 演员表(MoocActorT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-04 17:05:25
 */
@Service("moocActorTService")
public class MoocActorTServiceImpl implements MoocActorTService {
    @Resource
    private MoocActorTDao moocActorTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocActorT queryById(Integer uuid) {
        return this.moocActorTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocActorT> queryAllByLimit(int offset, int limit) {
        return this.moocActorTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocActorT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocActorT insert(MoocActorT moocActorT) {
        this.moocActorTDao.insert(moocActorT);
        return moocActorT;
    }

    /**
     * 修改数据
     *
     * @param moocActorT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocActorT update(MoocActorT moocActorT) {
        this.moocActorTDao.update(moocActorT);
        return this.queryById(moocActorT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocActorTDao.deleteById(uuid) > 0;
    }
}