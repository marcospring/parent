package com.csyy.sms.api;

import java.util.List;

/**
 * Created by zhangkui on 2016/12/7.
 * 模板短信发送器
 */
public interface TemplateSMSSender extends SMSSender {
    /**
     * 根据
     *
     * @param messageNo   消息编号
     * @param telephoneNo
     */
    void sendTemplateMessage(String messageNo, List<String> param, String... telephoneNo);

    /**
     * 设置模板构造器，用于加载模板构造器
     *
     * @param builder
     */
    void messageBuilder(MessageBuilder builder);

}
