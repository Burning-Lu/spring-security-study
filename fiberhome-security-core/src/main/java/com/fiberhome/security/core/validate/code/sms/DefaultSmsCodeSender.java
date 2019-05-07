package com.fiberhome.security.core.validate.code.sms;

/**
 * @author Lu Liang liang
 * @date 2019/5/6  10:39
 */
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机"+mobile+"发送验证码 "+code);
    }
}
