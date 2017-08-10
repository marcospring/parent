package com.csyy.sms.api;

import java.util.List;

/**
 * Created by zhangkui on 2016/12/7.
 * 短信息
 * 初始化调用setTemplate方法设置模板，模板内容包括所有的消息模板
 * buildContent方法根据消息编号和传入参数构造短信消息内容
 */
public interface MessageBuilder {
    /**
     * 初始化调用setTemplate方法设置模板，模板内容包括所有的消息模板
     * @param path 模板路径
     */
    void readTemplate(String path);

    /**
     * buildContent方法根据消息编号和传入参数构造短信消息内容
     * @param messageNo
     * @param param
     * @return
     */
    Message buildMessage(String messageNo, List<String> param);

    /**
     * 根据消息编号
     * @param messageNo
     * @return
     */
    Message buildMessage(String messageNo);
}
