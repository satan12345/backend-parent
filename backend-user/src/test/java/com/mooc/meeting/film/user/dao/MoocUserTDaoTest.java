package com.mooc.meeting.film.user.dao;

import com.mooc.meeting.film.user.BackendUserApplication;
import com.mooc.meeting.film.user.BackendUserApplicationTests;
import com.mooc.meeting.film.user.entity.MoocBackendUserT;
import com.mooc.meeting.film.user.entity.MoocUserT;
import com.mooc.meeting.film.utils.util.MD5Util;
import com.mooc.meeting.film.utils.vo.BaseResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;


/**
 * @author jipeng
 * @date 2020-02-28 16:14
 * @description
 */
@Slf4j
public class MoocUserTDaoTest extends BackendUserApplicationTests {

    @Resource
    MoocUserTDao moocUserTDao;
    @Resource
    MoocBackendUserTDao moocBackendUserTDao;


    @Test
    public void testQueryById() {

        MoocUserT moocUserT = moocUserTDao.queryById(2);
        log.info("查询到的结果为:{}", moocUserT);
    }

    @Test
    public void test1() {
        BaseResponseVo<String> baseResponseVo =  BaseResponseVo.success();
        baseResponseVo.setCode(0);
        baseResponseVo.setData("成功数据");
        baseResponseVo.setMsg("成功");
        System.out.println("baseResponseVo = " + baseResponseVo);


    }

    @Test
    public void testAddUser(){
        MoocBackendUserT moocBackendUserT=new MoocBackendUserT();

        moocBackendUserT.setUserName("kakaxi");
        moocBackendUserT.setUserPwd(MD5Util.encrypt("123"));
        moocBackendUserT.setUserPhone("88888888888");

        int insert = moocBackendUserTDao.insert(moocBackendUserT);
        log.info("插入的结果为: {}",insert);
    }
}
