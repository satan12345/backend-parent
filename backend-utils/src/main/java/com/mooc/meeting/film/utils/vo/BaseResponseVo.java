package com.mooc.meeting.film.utils.vo;

import com.mooc.meeting.film.utils.exception.CommonServiceException;
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

    private BaseResponseVo(){

    }

    /**
     * 成功但是无参数
     */
    public static BaseResponseVo success(){
        BaseResponseVo baseResponseVo=new BaseResponseVo();
        baseResponseVo.setCode(200);
        baseResponseVo.setMsg("操作成功");
        return baseResponseVo;
    }
    /**
     * 成功但是无参数
     */
    public static<T> BaseResponseVo<T> success(T data){
        BaseResponseVo baseResponseVo=new BaseResponseVo();
        baseResponseVo.setCode(200);
        baseResponseVo.setMsg("操作成功");
        baseResponseVo.setData(data);
        return baseResponseVo;
    }

    /**
     * 业务出现异常
     * @param exception
     * @param <T>
     * @return
     */
    public static<T> BaseResponseVo<T> serviceException(CommonServiceException exception){
        BaseResponseVo baseResponseVo=new BaseResponseVo();
        baseResponseVo.setCode(exception.getCode());
        baseResponseVo.setMsg(exception.getMessage());
        return  baseResponseVo;
    }



}

