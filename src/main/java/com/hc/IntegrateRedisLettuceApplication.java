package com.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//Springboot的启动器main方法上需要加上@EnableCaching开启缓存，使用了@Cacheable注解后，缓存的值将被存入redis数据库中
//缓存名可以为RedisConfig中自定义的缓存名，键生成器为RedisConig中自定义的键生成器，也可以自己自定义缓存key名
@EnableCaching //启用缓存
@SpringBootApplication
public class IntegrateRedisLettuceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrateRedisLettuceApplication.class, args);
    }

}
