package com.mooc.meeting.film.user.vo;

import com.mooc.meeting.film.utils.exception.CommonServiceException;
import com.mooc.meeting.film.utils.vo.BaseRequestVO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @param
 * @author jipeng
 * @date 2020-02-29 15:44
 */
@Data
public class LoginReqVo  extends BaseRequestVO {
    private String username;
    private String password;


    @Override
    public void checkParam() throws CommonServiceException {
        if (StringUtils.isBlank(username)||StringUtils.isBlank(password)) {
            throw new CommonServiceException(404,"用户名或者密码不能为空");
        }
    }
}

