package com.mooc.meeting.film.user.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(MoocUserT)实体类
 *
 * @author makejava
 * @since 2020-02-28 16:04:31
 */
@Data
@Table(name = "mooc_user_t")
public class MoocUserT implements Serializable {
    private static final long serialVersionUID = 864436706535578319L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 用户账号
    */
    @Column(name = "user_name")
    private String userName;
    /**
    * 用户密码
    */
    @Column(name = "user_pwd")
    private String userPwd;
    /**
    * 用户昵称
    */
    @Column(name = "nick_name")
    private String nickName;
    /**
    * 用户性别 0-男，1-女
    */
    @Column(name = "user_sex")
    private Integer userSex;
    /**
    * 出生日期
    */
    @Column(name = "birthday")
    private String birthday;
    /**
    * 用户邮箱
    */
    @Column(name = "email")
    private String email;
    /**
    * 用户手机号
    */
    @Column(name = "user_phone")
    private String userPhone;
    /**
    * 用户住址
    */
    @Column(name = "address")
    private String address;
    /**
    * 头像URL
    */
    @Column(name = "head_url")
    private String headUrl;
    /**
    * 个人介绍
    */
    @Column(name = "biography")
    private String biography;
    /**
    * 生活状态 0-单身，1-热恋中，2-已婚，3-为人父母
    */
    @Column(name = "life_status")
    private Integer lifeState;
    /**
    * 创建时间
    */
    @Column(name = "begin_time")
    private Date beginTime;
    /**
    * 修改时间
    */
    @Column(name = "update_time")
    private Date updateTime;




}