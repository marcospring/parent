package com.csyy.sms.impl;

import com.csyy.common.StringDefaultValue;
import com.csyy.sms.api.Message;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangkui on 2016/12/7.
 */
public class ShotMessage implements Message{
    private String template;
    private List<String> param;
    /**
     * 设置消息模板
     */
   public void setTemplate(String template){
        this.template = template;
    }

    /**
     * 设置消息参数
     */
   public void setParam(List<String> param){
        this.param = param;
    }

    @Override
    public String getMessage() {
        if(StringDefaultValue.isEmpty(template))
            throw new RuntimeException("template can not be null!");
        return MessageFormat.format(template,param.toArray());
    }

    @Override
    public String toString() {
        return getMessage();
    }

}
