package com.mooc.meeting.film.user.controller;

import com.mooc.meeting.film.common.annotation.UseResponseAdvice;
import com.mooc.meeting.film.user.entity.MoocBackendUserT;
import com.mooc.meeting.film.user.service.MoocBackendUserTService;
import com.mooc.meeting.film.user.vo.LoginReqVo;
import com.mooc.meeting.film.utils.exception.CommonServiceException;
import com.mooc.meeting.film.utils.util.JwtTokenUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 后台用户表(MoocBackendUserT)表控制层
 *
 * @author makejava
 * @since 2020-02-29 15:30:52
 */
@RestController
@RequestMapping("user")
@UseResponseAdvice
public class MoocBackendUserTController {
    /**
     * 服务对象
     */
    @Resource
    private MoocBackendUserTService moocBackendUserTService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MoocBackendUserT selectOne(Integer id) {
        return this.moocBackendUserTService.queryById(id);
    }

    @PostMapping(value = "login")
    @UseResponseAdvice
    public Map<String,Object> login(LoginReqVo loginReqVo) throws CommonServiceException {
        //数据校验
        loginReqVo.checkParam();
        //randomKey token
        Map<String,Object> result=new HashMap<>();
        String userId = moocBackendUserTService.checkUser(loginReqVo.getUsername(), loginReqVo.getPassword());
        JwtTokenUtil jwtTokenUtil=new JwtTokenUtil();
        String randomKey = jwtTokenUtil.getRandomKey();
        String token = jwtTokenUtil.generateToken(userId, randomKey);
        result.put("randomKey",randomKey);
        result.put("token",token);
        return result;
    }

}