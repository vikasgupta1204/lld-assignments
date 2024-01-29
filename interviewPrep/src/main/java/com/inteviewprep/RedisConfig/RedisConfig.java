package com.inteviewprep.RedisConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
/*
@Bean
RedisConnectionFactory redisConnectionFactory(){
    RedisConnectionFactory redisConnectionFactory=new LettuceConnectionFactory();
    return redisConnectionFactory;
}
@Bean
public RedisTemplate<String,Object> redisTemplate(){
    RedisTemplate<String,Object> template=new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory());
    return template;
}
*/
}
