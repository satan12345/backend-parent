package com.mooc.meeting.film.hall.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * 影厅电影信息表(MoocHallFilmInfoT)实体类
 *
 * @author makejava
 * @since 2020-03-06 19:28:45
 */
public class MoocHallFilmInfoT implements Serializable {
    private static final long serialVersionUID = 251442306532712533L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 电影编号
    */
    private Integer filmId;
    /**
    * 电影名称
    */
    private String filmName;
    /**
    * 电影时长
    */
    private String filmLength;
    /**
    * 电影类型
    */
    private String filmCats;
    /**
    * 电影语言
    */
    private String filmLanguage;
    /**
    * 演员列表
    */
    private String actors;
    /**
    * 图片地址
    */
    private String imgAddress;


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

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public String getFilmCats() {
        return filmCats;
    }

    public void setFilmCats(String filmCats) {
        this.filmCats = filmCats;
    }

    public String getFilmLanguage() {
        return filmLanguage;
    }

    public void setFilmLanguage(String filmLanguage) {
        this.filmLanguage = filmLanguage;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

}