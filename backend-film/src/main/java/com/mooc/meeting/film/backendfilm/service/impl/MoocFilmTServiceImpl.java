package com.mooc.meeting.film.backendfilm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.meeting.film.backendfilm.controller.vo.FilmSavedReqVO;
import com.mooc.meeting.film.backendfilm.dao.MoocActorTDao;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmActorTDao;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmInfoTDao;
import com.mooc.meeting.film.backendfilm.entity.MoocActorT;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmTDao;
import com.mooc.meeting.film.backendfilm.service.MoocFilmTService;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;
import org.apache.commons.configuration.beanutils.BeanHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @Resource
    MoocFilmInfoTDao moocFilmInfoTDao;

    @Resource
    MoocFilmActorTDao moocFilmActorTDao;

    /**
     * 查询演员列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<DescribeActorsRespVO> describeActors(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<MoocActorT> list = moocActorTDao.select(null);
        PageInfo<MoocActorT> pageInfo=new PageInfo<>(list);
        List<MoocActorT> list1 = pageInfo.getList();
        List<DescribeActorsRespVO> resultList=new ArrayList<>();
        BeanUtils.copyProperties(list1,resultList);
        return resultList;
    }

    /**
     * 影片列表查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<DescribeFilmsRespVO> describeFilms(Integer pageNo, Integer pageSize) {
        int skip=(pageNo-1)*pageSize;
        return moocFilmTDao.describeFilms(skip,pageSize);
//        PageHelper.startPage(pageNo,pageSize);
//        List<MoocFilmT> select = moocFilmTDao.select(null);
//        PageInfo<MoocFilmT> of = PageInfo.of(select);
//        List<MoocFilmT> tempList = of.getList();
//        List<DescribeFilmsRespVO> result=new ArrayList<>();
//        BeanUtils.copyProperties(tempList,result);
//        return result;

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