package com.mooc.meeting.film.backendfilm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 影片主表(MoocFilmInfoT)实体类
 *
 * @author makejava
 * @since 2020-03-04 17:01:36
 */
@Table(name="mooc_film_info_t")
@Data
public class MoocFilmInfoT implements Serializable {
    private static final long serialVersionUID = 138550109077585565L;
    /**
    * 主键编号
    */
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Integer uuid;
    /**
    * 影片编号
    */
    @Column(name = "film_id")
    private String filmId;
    /**
    * 影片英文名称
    */
    @Column(name = "film_en_name")
    private String filmEnName;
    /**
    * 影片评分
    */
    @Column(name = "film_score")
    private String filmScore;
    /**
    * 评分人数,以万为单位
    */
    @Column(name = "film_score_num")
    private Integer filmScoreNum;
    /**
    * 播放时长，以分钟为单位，不足取整
    */
    @Column(name = "film_length")
    private Integer filmLength;
    /**
    * 影片介绍
    */
    @Column(name = "biography")
    private String biography;
    /**
    * 导演编号
    */
    @Column(name = "director_id")
    private Integer directorId;
    /**
    * 影片图片集地址,多个图片以逗号分隔
    */
    @Column(name = "film_imgs")
    private String filmImgs;



}