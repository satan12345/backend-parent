package com.mooc.meeting.film.hall.entity;

import java.io.Serializable;

/**
 * 放映场次表(MoocFieldT)实体类
 *
 * @author makejava
 * @since 2020-03-06 19:29:08
 */
public class MoocFieldT implements Serializable {
    private static final long serialVersionUID = 888142219282437784L;
    /**
    * 主键编号
    */
    private Integer uuid;
    /**
    * 影院编号
    */
    private Integer cinemaId;
    /**
    * 电影编号
    */
    private Integer filmId;
    /**
    * 开始时间
    */
    private String beginTime;
    /**
    * 结束时间
    */
    private String endTime;
    /**
    * 放映厅类型编号
    */
    private Integer hallId;
    /**
    * 放映厅名称
    */
    private String hallName;
    /**
    * 票价
    */
    private Integer price;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}