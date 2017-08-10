package com.csyy.core.datasource.impl.cache;

import com.csyy.core.datasource.api.CacheReadAndWriteDataSessionFactory;
import com.csyy.core.datasource.impl.common.DefaultReadAndWriteDataSessionFactory;
import com.csyy.core.datasource.session.CacheDataSession;
import com.csyy.redis.factory.RedisSessionFactory;

/**
 * 默认的带有缓存功能的读写分离CacheDataSession工厂,用于获取带有缓存功能的数据库访问会话
 * Created by zhangkui on 16/5/5.
 */
public class DefaultCacheReadAndWriteDataSessionFactory extends DefaultReadAndWriteDataSessionFactory implements CacheReadAndWriteDataSessionFactory {

    private RedisSessionFactory redisSessionFactory;

    private CacheDataSession cacheReadDataSession;
    private CacheDataSession cacheWriteDataSession;

    public String getSystemKey() {
        return systemKey;
    }

    public void setSystemKey(String systemKey) {
        this.systemKey = systemKey;
    }

    private String systemKey;

    @Override
    public CacheDataSession getCacheReadDataSession() {
        if (cacheReadDataSession != null)
            return cacheReadDataSession;
        cacheReadDataSession = new DefaultCacheDataSession(systemKey, getSupport().getSqlSessionFacotry
                (getReadDataSource()),
                redisSessionFactory);
        return cacheReadDataSession;
    }

    @Override
    public CacheDataSession getCacheWriteDataSession() {
        if (cacheWriteDataSession != null)
            return cacheWriteDataSession;
        cacheWriteDataSession = new DefaultCacheDataSession(systemKey, getSupport().getSqlSessionFacotry
                (getWriteDataSource()), redisSessionFactory);
        return cacheWriteDataSession;
    }

    @Override
    public RedisSessionFactory getRedisSessionFactory() {
        return redisSessionFactory;
    }

    public void setRedisSessionFactory(RedisSessionFactory redisSessionFactory) {
        this.redisSessionFactory = redisSessionFactory;
    }
}
