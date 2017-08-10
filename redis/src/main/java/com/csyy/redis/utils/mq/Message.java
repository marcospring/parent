package com.csyy.redis.utils.mq;

import java.io.Serializable;

/**
 * Created by zhangbin on 2016/9/23.
 */
public class Message implements Serializable{

    private String chanel;

    private int i;

    private String msg;

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
