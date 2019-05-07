package com.fiberhome.security.browser.support;

/**
 * @author Lu Liang liang
 * @date 2019/4/24  12:46
 */
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
