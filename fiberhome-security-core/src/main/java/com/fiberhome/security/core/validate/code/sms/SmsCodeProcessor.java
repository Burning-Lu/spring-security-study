package com.fiberhome.security.core.validate.code.sms;

import com.fiberhome.security.core.validate.code.ValidateCode;
import com.fiberhome.security.core.validate.code.impl.AbstractValidateCodeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author Lu Liang liang
 * @date 2019/5/6  14:16
 */
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor  extends AbstractValidateCodeProcessor<ValidateCode> {

    @Autowired
    private SmsCodeSender smsCodeSender;

    @Override
    protected void send(ServletWebRequest request, ValidateCode validateCode) throws ServletRequestBindingException {
        String mobile = ServletRequestUtils.getRequiredStringParameter(request.getRequest(), "mobile");
        smsCodeSender.send(mobile,validateCode.getCode());
    }
}
