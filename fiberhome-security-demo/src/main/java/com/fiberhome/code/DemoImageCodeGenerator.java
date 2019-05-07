package com.fiberhome.code;

import com.fiberhome.security.core.validate.code.image.ImageCode;
import com.fiberhome.security.core.validate.code.ValidateCodeGenerator;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author Lu Liang liang
 * @date 2019/5/6  9:59
 * 以增量的方式来适应变化
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("★★★★★★★★★★★★更高级的图形验证码生成代码★★★★★★★★★★★★★");
        return null;
    }
}
