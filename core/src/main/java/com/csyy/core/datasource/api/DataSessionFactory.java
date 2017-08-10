package com.csyy.core.datasource.api;

import com.csyy.core.datasource.session.DataSession;

/**
 * Created by zhangkui on 16/4/27.
 */
public interface DataSessionFactory {
    DataSession getDaoByDataSourceName(String dataSourceName);
}
