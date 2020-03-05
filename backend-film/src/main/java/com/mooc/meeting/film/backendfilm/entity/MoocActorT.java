package com.mooc.meeting.film.backendfilm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 演员表(MoocActorT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:05:25
 */
@Data
@Table(name = "mooc_actor_t")
public class MoocActorT implements Serializable {
    private static final long serialVersionUID = -58108616957397738L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 演员名称
    */
    @Column(name = "actor_name")
    private String actorName;
    /**
    * 演员图片位置
    */
    @Column(name = "actor_img")
    private String actorImg;




}