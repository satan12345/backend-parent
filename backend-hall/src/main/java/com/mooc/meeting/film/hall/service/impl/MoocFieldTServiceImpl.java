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


}