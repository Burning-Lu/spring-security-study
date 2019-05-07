package com.fiberhome.security.core.properties;

/**
 * @author Lu Liang liang
 * @date 2019/5/5  16:45
 */
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 60;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }
}
