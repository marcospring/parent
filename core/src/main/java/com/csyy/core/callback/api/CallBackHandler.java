package com.csyy.core.callback.api;

import com.csyy.core.apisupport.BaseService;

import java.util.Map;

/**
 * Created by zhangkui on 16/5/20.
 */
public interface CallBackHandler {

    Map<String,Object> handle(Map<String,Object> param, BaseService service);
}
