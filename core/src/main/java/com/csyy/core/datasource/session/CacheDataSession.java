package com.csyy.core.datasource.session;

import com.csyy.redis.api.RedisSession;

/**
 * Created by zhangkui on 16/5/5.
 */
public interface CacheDataSession extends DataSession{
    RedisSession getRedisSession();
}
