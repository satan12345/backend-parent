package com.mooc.meeting.film.backendfilm.controller;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmActorT;
import com.mooc.meeting.film.backendfilm.service.MoocFilmActorTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 影片与演员映射表(MoocFilmActorT)表控制层
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
@RestController
@RequestMapping("moocFilmActorT")
public class MoocFilmActorTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocFilmActorTService moocFilmActorTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocFilmActorT selectOne(Integer id) {
        return this.moocFilmActorTService.queryById(id);
    }

}