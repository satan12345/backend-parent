package com.mooc.meeting.film.utils.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @param
 * @author jipeng
 * @date 2020-02-29 10:37
 */
@Data

public class BaseResponseVo<T> {
    private int code;
    private T data;
    private String msg;
}

