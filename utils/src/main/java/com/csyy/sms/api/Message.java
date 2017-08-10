package com.csyy.sms.api;

import java.util.List;

/**
 * Created by zhangkui on 2016/12/7.
 * 消息
 */
public interface Message {
    /**
     * 设置消息模板
     */
    void setTemplate(String template);

    /**
     * 设置消息参数
     */
    void setParam(List<String> param);

    /**
     * 获得消息内容
     * @return
     */
    String getMessage();
}
