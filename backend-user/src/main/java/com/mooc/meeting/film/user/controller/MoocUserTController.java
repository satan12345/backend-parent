package com.mooc.meeting.film.user.controller;


import com.mooc.meeting.film.user.entity.MoocUserT;
import com.mooc.meeting.film.user.service.MoocUserTService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户表(MoocUserT)表控制层
 *
 * @author makejava
 * @since 2020-02-28 16:04:31
 */
@RestController
@RequestMapping("moocUserT")
public class MoocUserTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocUserTService moocUserTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocUserT selectOne(Integer id) {
        return this.moocUserTService.queryById(id);
    }

}