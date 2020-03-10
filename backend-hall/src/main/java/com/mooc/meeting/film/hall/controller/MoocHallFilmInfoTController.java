package com.mooc.meeting.film.hall.controller;

import com.mooc.meeting.film.hall.entity.MoocHallFilmInfoT;
import com.mooc.meeting.film.hall.service.MoocHallFilmInfoTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)表控制层
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
@RestController
@RequestMapping("moocHallFilmInfoT")
public class MoocHallFilmInfoTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocHallFilmInfoTService moocHallFilmInfoTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocHallFilmInfoT selectOne(Integer id) {
        return this.moocHallFilmInfoTService.queryById(id);
    }

}