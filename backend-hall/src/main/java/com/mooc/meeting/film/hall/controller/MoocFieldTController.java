package com.mooc.meeting.film.hall.controller;

import com.mooc.meeting.film.hall.entity.MoocFieldT;
import com.mooc.meeting.film.hall.service.MoocFieldTService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 放映场次表(MoocFieldT)表控制层
 *
 * @author makejava
 * @since 2020-03-06 19:29:08
 */
@RestController
@RequestMapping("moocFieldT")
public class MoocFieldTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocFieldTService moocFieldTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocFieldT selectOne(Integer id) {
        return this.moocFieldTService.queryById(id);
    }

}