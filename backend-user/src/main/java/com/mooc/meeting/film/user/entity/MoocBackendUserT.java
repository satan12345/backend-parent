package com.mooc.meeting.film.user.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 后台用户表(MoocBackendUserT)实体类
 *
 * @author makejava
 * @since 2020-02-29 15:30:52
 */
@Data
@Table(name = "mooc_backend_user_t")
public class MoocBackendUserT implements Serializable {
    private static final long serialVersionUID = 673775299725912780L;
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
    * 用户手机号
    */
    @Column(name = "user_phone")
    private String userPhone;



}