package cn.lxgandlz.service;

/**
 * Created by lxg on 2016/11/5.
 */
public interface RedisService {

    public String set(String key, String value);

    public String set(String key, String value, Integer time);

    public String get(String key);

    public Boolean exists(String key);

    public String type(String key);

    public Long expire(String key, int seconds);

    public Long expireAt(String key, long unixTime);

    public Long ttl(String key);

    public boolean setbit(String key, long offset, boolean value);

    public boolean getbit(String key, long offset);

    public long setRange(String key, long offset, String value);

    public String getRange(String key, long startOffset, long endOffset);



}
