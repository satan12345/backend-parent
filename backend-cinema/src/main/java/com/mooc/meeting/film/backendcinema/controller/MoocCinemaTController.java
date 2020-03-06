package com.mooc.meeting.film.backendcinema.controller;

import com.mooc.meeting.film.backendcinema.entity.MoocCinemaT;
import com.mooc.meeting.film.backendcinema.service.MoocCinemaTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 影院信息表(MoocCinemaT)表控制层
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
@RestController
@RequestMapping("moocCinemaT")
public class MoocCinemaTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocCinemaTService moocCinemaTService;


}