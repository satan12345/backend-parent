package com.mooc.meeting.film.user.service.impl;

import com.mooc.meeting.film.user.dao.MoocBackendUserTDao;
import com.mooc.meeting.film.user.entity.MoocBackendUserT;
import com.mooc.meeting.film.user.service.MoocBackendUserTService;
import com.mooc.meeting.film.utils.exception.CommonServiceException;
import com.mooc.meeting.film.utils.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户表(MoocBackendUserT)表服务实现类
 *
 * @author makejava
 * @since 2020-02-29 15:30:52
 */
@Service("moocBackendUserTService")
public class MoocBackendUserTServiceImpl implements MoocBackendUserTService {
    @Resource
    private MoocBackendUserTDao moocBackendUserTDao;

    @Override
    public String checkUser(String username,String password) throws CommonServiceException{
        //根据用户名获取用户信息
        MoocBackendUserT moocBackendUserT=new MoocBackendUserT();
        moocBackendUserT.setUserName(username);
        List<MoocBackendUserT> list = moocBackendUserTDao.select(moocBackendUserT);
        if (CollectionUtils.isEmpty(list)) {
            throw new CommonServiceException(-10,"用户不存在");
        }
        // 验证密码是否正确
        boolean checkResult = StringUtils.equalsIgnoreCase(list.get(0).getUserPwd(), MD5Util.encrypt(password));
        if (!checkResult) {
            throw new CommonServiceException(-20,"密码错误");
        }
        return list.get(0).getUuid().toString();
    }
    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public MoocBackendUserT queryById(Integer uuid) {
        return this.moocBackendUserTDao.queryById(uuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MoocBackendUserT> queryAllByLimit(int offset, int limit) {
        return this.moocBackendUserTDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param moocBackendUserT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocBackendUserT insert(MoocBackendUserT moocBackendUserT) {
        this.moocBackendUserTDao.insert(moocBackendUserT);
        return moocBackendUserT;
    }

    /**
     * 修改数据
     *
     * @param moocBackendUserT 实例对象
     * @return 实例对象
     */
    @Override
    public MoocBackendUserT update(MoocBackendUserT moocBackendUserT) {
        this.moocBackendUserTDao.update(moocBackendUserT);
        return this.queryById(moocBackendUserT.getUuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uuid) {
        return this.moocBackendUserTDao.deleteById(uuid) > 0;
    }
}