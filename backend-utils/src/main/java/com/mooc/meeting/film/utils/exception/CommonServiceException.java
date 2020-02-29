package com.mooc.meeting.film.utils.exception;

import lombok.Data;

/**
 * @param
 * @author jipeng
 * @date 2020-02-29 15:49
 */
@Data
public class CommonServiceException extends Exception {

    private Integer code;
    private String message;

    public CommonServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

