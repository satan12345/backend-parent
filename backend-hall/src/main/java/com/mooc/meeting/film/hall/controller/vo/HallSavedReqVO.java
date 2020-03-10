package com.mooc.meeting.film.hall.controller.vo;

import lombok.Data;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.hall.controller.vo
 * @description :
 **/
@Data
public class HallSavedReqVO {

    private String cinemaId;
    private String filmId;
    private String hallTypeId;
    private String beginTime;
    private String endTime;
    private String filmPrice;
    private String hallName;


}
