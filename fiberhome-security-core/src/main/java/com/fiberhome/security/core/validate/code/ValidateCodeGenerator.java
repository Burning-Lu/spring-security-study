package com.fiberhome.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author Lu Liang liang
 * @date 2019/5/6  9:44
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
