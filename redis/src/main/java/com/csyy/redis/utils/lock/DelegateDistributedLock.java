package com.csyy.redis.utils.lock;

import com.csyy.redis.api.RedisSession;
import com.csyy.redis.exception.DistributedLockException;
import com.csyy.redis.exception.RedisException;
import com.csyy.redis.factory.RedisSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangkui on 16/8/30.
 */
public class DelegateDistributedLock implements DistributedLock {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private RedisSessionFactory factory;


    @Override
    public void lock(String uniqueKey) throws DistributedLockException, RedisException {
        lock(uniqueKey, DEFAULT_SINGLE_EXPIRE_TIME);
    }

    @Override
    public void lock(String uniqueKey, int lockTime) {
        RedisSession session = null;
        try {
            session = factory.getSession();
//            do {
            logger.debug("lock key: " + uniqueKey);
            Long i = session.setnx(uniqueKey, uniqueKey);
            if (i == 1) {
                session.expire(uniqueKey, lockTime);
                logger.debug("get lock, key: " + uniqueKey + " , expire in " + lockTime + " seconds.");
                return;
            } else {
                String desc = session.getData(uniqueKey);
                logger.debug("key: " + uniqueKey + " locked by another business：" + desc);
                throw new RuntimeException("key: " + uniqueKey + " locked by another business：" + desc);
            }
//                Thread.sleep(300);
//            } while (true);
        } catch (RedisException e) {
            throw e;
        } catch (Exception e) {
            throw new DistributedLockException(e);
        }
    }

    @Override
    public boolean tryLock(String uniqueKey) throws DistributedLockException, RedisException {
        return tryLock(uniqueKey, 0L, null);
    }

    @Override
    public boolean tryLock(String uniqueKey, long timeout, TimeUnit unit) throws DistributedLockException, RedisException {
        RedisSession session = null;
        try {
            session = factory.getSession();
            long nano = System.nanoTime();
            do {
                logger.debug("try lock key: " + uniqueKey);
                Long i = session.setnx(uniqueKey, uniqueKey);
                if (i == SUCCESS) {
                    session.expire(uniqueKey, DEFAULT_SINGLE_EXPIRE_TIME);
                    logger.debug("get lock, key: " + uniqueKey + " , expire in " + DEFAULT_SINGLE_EXPIRE_TIME + " seconds.");
                    return Boolean.TRUE;
                } else { // 存在锁
                    String desc = session.getData(uniqueKey);
                    logger.debug("key: " + uniqueKey + " locked by another business：" + desc);
                }
                if (timeout == 0) {
                    break;
                }
                Thread.sleep(300);
            } while ((System.nanoTime() - nano) < unit.toNanos(timeout));
            return Boolean.FALSE;
        } catch (RedisException e) {
            throw e;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new DistributedLockException(e);
        }
    }

    @Override
    public void unLock(String uniqueKey) throws DistributedLockException, RedisException {
        try {
            factory.getSession().delete(uniqueKey);
        } catch (RedisException e) {
            throw e;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            throw new DistributedLockException(e);
        }
    }

    public RedisSessionFactory getFactory() throws DistributedLockException, RedisException {
        return factory;
    }

    public void setFactory(RedisSessionFactory factory) throws DistributedLockException, RedisException {
        this.factory = factory;
    }
}
