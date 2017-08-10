package com.csyy.sms.impl;

/**
 * Created by zhangkui on 2016/12/7.
 */
public class MessageTemplate {
    private String code;
    private String template;

    public MessageTemplate(String code, String template) {
        this.code = code;
        this.template = template;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
