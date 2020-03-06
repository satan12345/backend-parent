package com.mooc.meeting.film.backendfilm.service.impl;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmInfoT;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmInfoTDao;
import com.mooc.meeting.film.backendfilm.service.MoocFilmInfoTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影片主表(MoocFilmInfoT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-04 17:01:36
 */
@Service("moocFilmInfoTService")
public class MoocFilmInfoTServiceImpl implements MoocFilmInfoTService {
    @Resource
    private MoocFilmInfoTDao moocFilmInfoTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocFilmInfoT queryById(Integer uuid) {
        return null;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocFilmInfoT> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmInfoT insert(MoocFilmInfoT moocFilmInfoT) {
       return null;
    }

    /**
     * 修改数据
     *
     * @param moocFilmInfoT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmInfoT update(MoocFilmInfoT moocFilmInfoT) {
      return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return false;
    }
}