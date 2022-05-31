package com.rui.application;

import com.rui.redis.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * description:
 * date: 2022/5/31 16:10
 *
 * @author rui
 */
public class CacheServiceImpl implements CacheService{
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
