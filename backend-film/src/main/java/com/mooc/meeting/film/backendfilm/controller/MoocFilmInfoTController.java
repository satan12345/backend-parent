package com.mooc.meeting.film.backendfilm.controller;

import com.mooc.meeting.film.backendfilm.entity.MoocFilmInfoT;
import com.mooc.meeting.film.backendfilm.service.MoocFilmInfoTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 影片主表(MoocFilmInfoT)表控制层
 *
 * @author makejava
 * @since 2020-03-04 17:01:36
 */
@RestController
@RequestMapping("moocFilmInfoT")
public class MoocFilmInfoTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocFilmInfoTService moocFilmInfoTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocFilmInfoT selectOne(Integer id) {
        return this.moocFilmInfoTService.queryById(id);
    }

}