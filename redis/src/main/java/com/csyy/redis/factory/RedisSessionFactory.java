package com.csyy.redis.factory;/**
 * Created by Administrator on 2015/12/30 0030.
 */


import com.csyy.redis.api.MulitiRedisSession;
import com.csyy.redis.api.RedisSession;
import com.csyy.redis.exception.RedisException;

/**
 * @ClassName: RedisSessionFactory
 * @Description:TODO
 * @author: zhangk
 * @date: 2015/12/30 0030
 */
public interface RedisSessionFactory {
	/**
	 * 获取默认（选取DB0库）的redis会话
	 * @return
	 * @throws RedisException
	 */
	RedisSession getSession() throws RedisException;

	/**
	 * 可选取DB库的redis会话
	 * @return
	 * @throws RedisException
	 */
	MulitiRedisSession getMulitiSession() throws RedisException;
}
