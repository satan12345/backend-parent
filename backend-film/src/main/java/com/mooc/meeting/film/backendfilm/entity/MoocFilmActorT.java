package com.mooc.meeting.film.backendfilm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 影片与演员映射表(MoocFilmActorT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
@Table(name = "mooc_film_actor_t")
@Data
public class MoocFilmActorT implements Serializable {
    private static final long serialVersionUID = -25402686035876226L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 影片编号,对应mooc_film_t
    */
    @Column(name = "film_id")
    private Integer filmId;
    /**
    * 演员编号,对应mooc_actor_t
    */
    @Column(name = "actor_id")
    private Integer actorId;
    /**
    * 角色名称
    */
    @Column(name = "role_name")
    private String roleName;




}