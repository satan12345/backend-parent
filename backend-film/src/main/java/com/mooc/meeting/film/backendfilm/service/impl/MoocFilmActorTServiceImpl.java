package com.mooc.meeting.film.backendfilm.service.impl;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmActorTDao;
import com.mooc.meeting.film.backendfilm.service.MoocFilmActorTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影片与演员映射表(MoocFilmActorT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
@Service("moocFilmActorTService")
public class MoocFilmActorTServiceImpl implements MoocFilmActorTService {
    @Resource
    private MoocFilmActorTDao moocFilmActorTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocFilmActorT queryById(Integer uuid) {
        return this.moocFilmActorTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocFilmActorT> queryAllByLimit(int offset, int limit) {
        return this.moocFilmActorTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocFilmActorT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmActorT insert(MoocFilmActorT moocFilmActorT) {
        this.moocFilmActorTDao.insert(moocFilmActorT);
        return moocFilmActorT;
    }

    /**
     * 修改数据
     *
     * @param moocFilmActorT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmActorT update(MoocFilmActorT moocFilmActorT) {
        this.moocFilmActorTDao.update(moocFilmActorT);
        return this.queryById(moocFilmActorT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocFilmActorTDao.deleteById(uuid) > 0;
    }
}