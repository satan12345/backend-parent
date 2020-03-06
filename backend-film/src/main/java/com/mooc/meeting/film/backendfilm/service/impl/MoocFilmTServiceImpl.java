package com.mooc.meeting.film.backendfilm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mooc.meeting.film.backendfilm.controller.vo.FilmSavedReqVO;
import com.mooc.meeting.film.backendfilm.dao.MoocActorTDao;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmActorTDao;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmInfoTDao;
import com.mooc.meeting.film.backendfilm.entity.MoocActorT;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmInfoT;
import com.mooc.meeting.film.backendfilm.entity.MoocFilmT;
import com.mooc.meeting.film.backendfilm.dao.MoocFilmTDao;
import com.mooc.meeting.film.backendfilm.service.MoocFilmTService;
import com.mooc.meeting.film.backendfilm.vo.DescribeActorsRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmRespVO;
import com.mooc.meeting.film.backendfilm.vo.DescribeFilmsRespVO;
import com.mooc.meeting.film.utils.util.ToolUtils;
import org.apache.commons.configuration.beanutils.BeanHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<DescribeActorsRespVO> describeActors(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<MoocActorT> list = moocActorTDao.select(null);
        PageInfo<MoocActorT> pageInfo = new PageInfo<>(list);
        List<MoocActorT> list1 = pageInfo.getList();
        List<DescribeActorsRespVO> resultList = new ArrayList<>();
        BeanUtils.copyProperties(list1, resultList);
        return resultList;
    }

    /**
     * 影片列表查询
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<DescribeFilmsRespVO> describeFilms(Integer pageNo, Integer pageSize) {
        int skip = (pageNo - 1) * pageSize;
        return moocFilmTDao.describeFilms(skip, pageSize);
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
        return moocFilmTDao.describeFilmById(filmId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer saveFilm(FilmSavedReqVO reqVO) {

        // 保存电影主表
        MoocFilmT film = new MoocFilmT();
        film.setFilmName(reqVO.getFilmName());
        film.setFilmType(ToolUtils.str2Int(reqVO.getFilmTypeId()));
        film.setImgAddress(reqVO.getMainImgAddress());
        film.setFilmScore(reqVO.getFilmScore());
        film.setFilmPresalenum(ToolUtils.str2Int(reqVO.getPreSaleNum()));
        film.setFilmBoxOffice(ToolUtils.str2Int(reqVO.getBoxOffice()));
        film.setFilmSource(ToolUtils.str2Int(reqVO.getFilmSourceId()));
        film.setFilmCats(reqVO.getFilmCatIds());
        film.setFilmArea(ToolUtils.str2Int(reqVO.getAreaId()));
        film.setFilmDate(ToolUtils.str2Int(reqVO.getDateId()));
        film.setFilmTime(ToolUtils.str2LocalDateTime(reqVO.getFilmTime() + " 00:00:00"));
        film.setFilmStatus(ToolUtils.str2Int(reqVO.getFilmStatus()));

        moocFilmTDao.insert(film);
        // 保存电影子表
        MoocFilmInfoT filmInfo = new MoocFilmInfoT();

        filmInfo.setFilmId(film.getUuid() + "");
        filmInfo.setFilmEnName(reqVO.getFilmEnName());
        filmInfo.setFilmScore(reqVO.getFilmScore());
        filmInfo.setFilmScoreNum(ToolUtils.str2Int(reqVO.getFilmScorers()));
        filmInfo.setFilmLength(ToolUtils.str2Int(reqVO.getFilmLength()));
        filmInfo.setBiography(reqVO.getBiography());
        filmInfo.setDirectorId(ToolUtils.str2Int(reqVO.getDirectorId()));
        filmInfo.setFilmImgs(reqVO.getFilmImgs());


        moocFilmInfoTDao.insert(filmInfo);

        String[] actorId = reqVO.getActIds().split("#");
        String[] roleNames = reqVO.getRoleNames().split("#");
//        if (actorId.length != roleNames.length) {
//            throw new CommonServiceException(500, "演员和角色名数量不匹配");
//        }

        for (int i = 0; i < actorId.length; i++) {
            // 保存演员映射表
            MoocFilmActorT filmActor = new MoocFilmActorT();
            filmActor.setFilmId(film.getUuid());
            filmActor.setActorId(ToolUtils.str2Int(actorId[i]));
            filmActor.setRoleName(roleNames[i]);
            moocFilmActorTDao.insert(filmActor);
        }
        return film.getUuid();

    }
}