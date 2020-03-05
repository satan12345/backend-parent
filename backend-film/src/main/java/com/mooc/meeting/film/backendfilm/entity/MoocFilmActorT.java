package com.mooc.meeting.film.backendfilm.entity;

import java.io.Serializable;

/**
 * 影片与演员映射表(MoocFilmActorT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:02:10
 */
public class MoocFilmActorT implements Serializable {
    private static final long serialVersionUID = -25402686035876226L;
    /**
    * 主键编号
    */
    private Integer uuid;
    /**
    * 影片编号,对应mooc_film_t
    */
    private Integer filmId;
    /**
    * 演员编号,对应mooc_actor_t
    */
    private Integer actorId;
    /**
    * 角色名称
    */
    private String roleName;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}