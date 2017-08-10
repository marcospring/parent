package com.csyy.redis.utils.mq;

/**
 * Created by zhangbin on 2016/9/26.
 */
@FunctionalInterface
public interface Handler {

    /**
     * 处理消息
     * @param msg
     */
    void handle(Message msg);
}
