package com.mooc.meeting.film.backendcinema.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 影院信息表(MoocCinemaT)实体类
 *
 * @author makejava
 * @since 2020-03-06 16:58:43
 */
@Data
@Table(name = "mooc_cinema_t")
public class MoocCinemaT implements Serializable {
    private static final long serialVersionUID = -32279324064809753L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 影院名称
    */
    @Column(name = "cinema_name")
    private String cinemaName;
    /**
    * 影院电话
    */
    @Column(name = "cinema_phone")
    private String cinemaPhone;
    /**
    * 品牌编号
    */
    @Column(name = "brand_id")
    private Integer brandId;
    /**
    * 地域编号
    */
    @Column(name = "area_id")
    private Integer areaId;
    /**
    * 包含的影厅类型,以#作为分割
    */
    @Column(name = "hall_ids")
    private String hallIds;
    /**
    * 影院图片地址
    */
    @Column(name = "img_address")
    private String imgAddress;
    /**
    * 影院地址
    */
    @Column(name = "cinema_address")
    private String cinemaAddress;
    /**
    * 最低票价
    */
    @Column(name = "minimum_price")
    private Integer minimumPrice;




}