package com.fiberhome.security.core.validate.code;

import com.fiberhome.security.core.properties.SecurityProperties;
import com.fiberhome.security.core.validate.code.image.ImageCodeGenerator;
import com.fiberhome.security.core.validate.code.sms.DefaultSmsCodeSender;
import com.fiberhome.security.core.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lu Liang liang
 * @date 2019/5/6  9:51
 */
@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    private SecurityProperties securityProperties;


    /**
     *
     * @return
     * ConditionalOnMissingBean spring上下文不存在imageCodeGenerator，才使用这个默认的实现
     */
    @Bean
    @ConditionalOnMissingBean(name ="imageValidateCodeGenerator")
    public ValidateCodeGenerator imageValidateCodeGenerator(){
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setSecurityProperties(securityProperties);
        return codeGenerator;
    }

    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class)
    public SmsCodeSender smsCodeSender(){
        return new DefaultSmsCodeSender();
    }
}
