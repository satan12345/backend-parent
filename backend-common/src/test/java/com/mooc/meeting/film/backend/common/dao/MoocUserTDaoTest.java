package com.mooc.meeting.film.backend.common.dao;

import com.mooc.meeting.film.backend.common.BackendCommonApplicationTests;
import com.mooc.meeting.film.backend.common.entity.MoocUserT;
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
public class MoocUserTDaoTest extends BackendCommonApplicationTests {

    @Resource
    MoocUserTDao moocUserTDao;


    @Test
    public void testQueryById() {

        MoocUserT moocUserT = moocUserTDao.queryById(2);
        log.info("查询到的结果为:{}", moocUserT);
    }

    @Test
    public void test1() {
        BaseResponseVo<String> baseResponseVo = new BaseResponseVo<>();
        baseResponseVo.setCode(0);
        baseResponseVo.setData("成功数据");
        baseResponseVo.setMsg("成功");
        System.out.println("baseResponseVo = " + baseResponseVo);


    }
}
