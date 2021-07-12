package com.example.redisdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisSampleService {

    private final StringRedisTemplate stringRedisTemplate;

    public void getRedisStringValue(String key) {

        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();

        System.out.println("Redis Key : " + key);
        System.out.println("Redis Value by Key : " + stringStringValueOperations.get(key));
    }

    public void setRedisStringValue(String key, String value) {

        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();

        stringStringValueOperations.set(key, value);

        System.out.println("Redis Key : " + key);
        System.out.println("Redis Value by Key : " + stringStringValueOperations.get(key));

    }
}
