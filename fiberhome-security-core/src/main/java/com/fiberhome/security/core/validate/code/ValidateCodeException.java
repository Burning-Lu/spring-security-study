package com.fiberhome.security.core.validate.code;


import org.springframework.security.core.AuthenticationException;

/**
 * @author Lu Liang liang
 * @date 2019/5/5  15:05
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
