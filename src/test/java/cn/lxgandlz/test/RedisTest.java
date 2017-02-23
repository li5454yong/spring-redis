package cn.lxgandlz.test;

import cn.lxgandlz.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lxg
 * on 2017/2/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class RedisTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void demo(){
        redisService.set("test","12346");

        System.out.println(redisService.get("test"));
    }
}
