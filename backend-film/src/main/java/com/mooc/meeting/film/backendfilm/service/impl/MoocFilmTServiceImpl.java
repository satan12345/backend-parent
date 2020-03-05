package com.mooc.meeting.film.backendfilm.service.impl;

import com.mooc.meeting.film.backendfilm.controller.vo.FilmSavedReqVO;
import com.mooc.meeting.film.backendfilm.dao.MoocActorTDao;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmTDao;
import com.mooc.meeting.film.backendfilm.service.MoocFilmTService;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影片主表(MoocFilmT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-04 17:00:22
 */
@Service("moocFilmTService")
public class MoocFilmTServiceImpl implements MoocFilmTService {
    @Resource
    private MoocFilmTDao moocFilmTDao;
    @Resource
    MoocActorTDao moocActorTDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocFilmT queryById(Integer uuid) {
        return this.moocFilmTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocFilmT> queryAllByLimit(int offset, int limit) {
        return this.moocFilmTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocFilmT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmT insert(MoocFilmT moocFilmT) {
        this.moocFilmTDao.insert(moocFilmT);
        return moocFilmT;
    }

    /**
     * 修改数据
     *
     * @param moocFilmT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocFilmT update(MoocFilmT moocFilmT) {
        this.moocFilmTDao.update(moocFilmT);
        return this.queryById(moocFilmT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocFilmTDao.deleteById(uuid) > 0;
    }

    @Override
    public List<DescribeActorsRespVO> describeActors(Integer pageNo, Integer pageSize) {
        return null;
    }

    @Override
    public List<DescribeFilmsRespVO> describeFilms(Integer pageNo, Integer pageSize) {
        return null;
    }

    @Override
    public DescribeFilmRespVO describeFilmById(String filmId) {
        return null;
    }

    @Override
    public Integer saveFilm(FilmSavedReqVO filmSavedReqVO) {
        return null;
    }
}