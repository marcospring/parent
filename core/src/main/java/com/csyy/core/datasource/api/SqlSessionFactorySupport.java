package com.csyy.core.datasource.api;
import org.apache.ibatis.session.SqlSessionFactory;
/**
 * Created by zhangkui on 16/4/27.
 */
public interface SqlSessionFactorySupport {
    SqlSessionFactory getSqlSessionFacotry(String seed);
}
