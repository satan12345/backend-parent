package com.mooc.meeting.film.backendcinema.service.impl;

import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import com.mooc.meeting.film.backendcinema.dao.MoocCinemaTDao;
import com.mooc.meeting.film.backendcinema.service.MoocCinemaTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 影院信息表(MoocCinemaT)表服务实现类
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
@Service("moocCinemaTService")
public class MoocCinemaTServiceImpl implements MoocCinemaTService {
    @Resource
    private MoocCinemaTDao moocCinemaTDao;


}