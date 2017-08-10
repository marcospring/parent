package com.csyy.redis.jedis.factory;/**
 * Created by Administrator on 2015/12/30 0030.
 */


import com.csyy.redis.api.MulitiRedisSession;
import com.csyy.redis.api.RedisSession;
import com.csyy.redis.exception.RedisException;
import com.csyy.redis.factory.RedisSessionFactory;

/**
 * @ClassName: JedisClusterSessionFactory
 * @Description:TODO
 * @author: zhangk
 * @date: 2015/12/30 0030
 */
public class JedisClusterSessionFactory implements RedisSessionFactory {
    public RedisSession getSession() {
        return null;
    }

    @Override
    public MulitiRedisSession getMulitiSession() throws RedisException {
        return null;
    }
}
