package com.mooc.meeting.film.utils.vo;

import com.mooc.meeting.film.utils.exception.CommonServiceException;

/**
 * @param
 * @author jipeng
 * @date 2020-02-29 15:47
 */
public abstract class BaseRequestVO {
    /**
     * 公共参数验证方法
     */
    public abstract void checkParam() throws CommonServiceException;
}

