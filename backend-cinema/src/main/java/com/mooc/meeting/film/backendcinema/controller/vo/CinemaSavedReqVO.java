package com.mooc.meeting.film.backendcinema.controller.vo;

import lombok.Data;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.cinema.controller.vo
 * @description :
 **/
@Data
public class CinemaSavedReqVO{

    private String brandId;
    private String areaId;
    private String hallTypeIds;
    private String cinemaName;
    private String cinemaAddress;
    private String cinemaTele;
    private String cinemaImgAddress;
    private String cinemaPrice;


}
