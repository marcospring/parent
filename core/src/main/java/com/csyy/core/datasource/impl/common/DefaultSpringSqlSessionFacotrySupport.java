package com.csyy.core.datasource.impl.common;

import com.csyy.core.datasource.api.AbstractSpringSqlSessionFactorySupport;
import com.csyy.core.utils.PropertiesUtils;

/**
 * Created by zhangkui on 16/4/28.
 */
public class DefaultSpringSqlSessionFacotrySupport extends AbstractSpringSqlSessionFactorySupport{
    @Override
    protected String getFactoryName(String factoryName) {
        return PropertiesUtils.getString(factoryName, "sqlSessionFactory");
    }
}
