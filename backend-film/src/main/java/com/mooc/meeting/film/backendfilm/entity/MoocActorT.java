package com.mooc.meeting.film.backendfilm.entity;

import java.io.Serializable;

/**
 * 演员表(MoocActorT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:05:25
 */
public class MoocActorT implements Serializable {
    private static final long serialVersionUID = -58108616957397738L;
    /**
    * 主键编号
    */
    private Integer uuid;
    /**
    * 演员名称
    */
    private String actorName;
    /**
    * 演员图片位置
    */
    private String actorImg;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorImg() {
        return actorImg;
    }

    public void setActorImg(String actorImg) {
        this.actorImg = actorImg;
    }

}