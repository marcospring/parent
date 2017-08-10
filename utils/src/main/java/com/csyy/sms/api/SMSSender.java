package com.csyy.sms.api;

import java.util.Map;

/**
 * Created by zhangkui on 2016/12/7.
 * 短信发送器
 */
public interface SMSSender {
    /**
     * 设置短信提供商参数
     * @param param
     */
    void providerConfig(Map<String, Object> param);

    /**
     * 设置短信发送URL
     * @param url
     */
    void sendUrl(String url);

    /**
     * 设置余额查询url
     * @param url
     */
    void balanceUrl(String url);
    /**
     * 多手机号发送方法
     *
     * @param content   发送内容
     * @param telephone 多手机号
     */
    void send(String content, String... telephone);

    /**
     * 发送内容参数名
     * @param contentParamName
     */
    void contentParamName(String contentParamName);

    /**
     *
     * @param phoneParamName
     */
    void phoneParamName(String phoneParamName);


    /**
     * 获取余额
     * @return
     */
    String getBalance();
}