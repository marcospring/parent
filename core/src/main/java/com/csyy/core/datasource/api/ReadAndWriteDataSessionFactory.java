package com.csyy.core.datasource.api;

import com.csyy.core.datasource.session.DataSession;

/**
 * Created by zhangkui on 16/4/27.
 */
public interface ReadAndWriteDataSessionFactory extends DataSessionFactory{

    /**
     * 获取读库数据访问session
     * @return
     * DataSession
     *
     */
    DataSession getReadDataSession();

    /**
     * 获取写库数据访问session
     * @return
     * DataSession
     *
     */
    DataSession getWriteDataSession();
}
