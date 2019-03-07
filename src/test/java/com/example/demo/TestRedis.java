/*
package com.example.demo;

import com.example.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    */
/*@Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("a", "232");
        //Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }*//*


@Test
    public void testObj() throws Exception {
        boolean exist = redisTemplate.hasKey("aaa");
        boolean exist1 = stringRedisTemplate.hasKey("aaa");
        System.out.println("exist存在"+exist);
        System.out.println("exist1存在"+exist1);
        User user = new User("qq","aa@126.com", "aa", "aa123456","123");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set("comccq", user);
        operations.set("comneo", user,1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists = redisTemplate.hasKey("comneo");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }

}
*/
