package com.mooc.meeting.film.hall.service.impl;

import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import com.mooc.meeting.film.hall.dao.MoocHallFilmInfoTDao;
import com.mooc.meeting.film.hall.service.MoocHallFilmInfoTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
@Service("moocHallFilmInfoTService")
public class MoocHallFilmInfoTServiceImpl implements MoocHallFilmInfoTService {
    @Resource
    private MoocHallFilmInfoTDao moocHallFilmInfoTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocHallFilmInfoT queryById(Integer uuid) {
        return this.moocHallFilmInfoTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocHallFilmInfoT> queryAllByLimit(int offset, int limit) {
        return this.moocHallFilmInfoTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocHallFilmInfoT insert(MoocHallFilmInfoT moocHallFilmInfoT) {
        this.moocHallFilmInfoTDao.insert(moocHallFilmInfoT);
        return moocHallFilmInfoT;
    }

    /**
     * 修改数据
     *
     * @param moocHallFilmInfoT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocHallFilmInfoT update(MoocHallFilmInfoT moocHallFilmInfoT) {
        this.moocHallFilmInfoTDao.update(moocHallFilmInfoT);
        return this.queryById(moocHallFilmInfoT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocHallFilmInfoTDao.deleteById(uuid) > 0;
    }
}