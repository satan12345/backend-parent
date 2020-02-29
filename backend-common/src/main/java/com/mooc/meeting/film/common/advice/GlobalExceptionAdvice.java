package com.mooc.meeting.film.common.advice;


import com.mooc.meeting.film.utils.exception.CommonServiceException;
import com.mooc.meeting.film.utils.vo.BaseResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {


    @ExceptionHandler(value = CommonServiceException.class)
    public BaseResponseVo<String> handlerSaveProcessDataBaseException(HttpServletRequest req,
                                                                      CommonServiceException ex) {
        BaseResponseVo<String> response = BaseResponseVo.serviceException(ex);
        String requestURI = req.getRequestURI();
        log.error("发生自定义异常 requestURI={}  code={},CommonServiceException :",requestURI,ex.getCode(), ex);
        return response;
    }



    @ExceptionHandler(value = RuntimeException.class)
    public BaseResponseVo<String> handlerGlobalException(HttpServletRequest req,
                                                         RuntimeException ex) {
        String requestURI = req.getRequestURI();
        Map<String, String[]> parameterMap = req.getParameterMap();
        CommonServiceException commonServiceException=new CommonServiceException(-1,"系统出现未知错误");
        BaseResponseVo<String> response = BaseResponseVo.serviceException(commonServiceException);
        log.error("程序调用发生异常 requestURI={} param={} e=", requestURI,parameterMap, ex);
        return response;
    }
}
