package com.mooc.meeting.film.backendfilm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * 影片主表(MoocFilmT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:00:21
 */
@Data
@Table(name = "mooc_film_t")
public class MoocFilmT implements Serializable {
    private static final long serialVersionUID = -19019038010035975L;
    /**
    * 主键编号
    */
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 影片名称
    */
    @Column(name = "film_name")
    private String filmName;
    /**
    * 片源类型: 0-2D,1-3D,2-3DIMAX,4-无
    */
    @Column(name = "film_type")
    private Integer filmType;
    /**
    * 影片主图地址
    */
    @Column(name = "img_address")
    private String imgAddress;
    /**
    * 影片评分
    */
    @Column(name = "film_score")
    private String filmScore;
    /**
    * 影片预售数量
    */
    @Column(name = "film_preSaleNum")
    private Integer filmPresalenum;
    /**
    * 影片票房：每日更新，以万为单位
    */
    @Column(name = "film_box_office")
    private Integer filmBoxOffice;
    /**
    * 影片片源，参照片源字典表
    */
    @Column(name = "film_source")
    private Integer filmSource;
    /**
    * 影片分类，参照分类表,多个分类以#分割
    */
    @Column(name = "film_cats")
    private String filmCats;
    /**
    * 影片区域，参照区域表
    */
    @Column(name = "film_area")
    private Integer filmArea;
    /**
    * 影片上映年代，参照年代表
    */
    @Column(name = "film_date")
    private Integer filmDate;
    /**
    * 影片上映时间
    */
    @Column(name = "film_time")
    private Date filmTime;
    /**
    * 影片状态,1-正在热映，2-即将上映，3-经典影片
    */
    @Column(name = "film_status")
    private Integer filmStatus;




}