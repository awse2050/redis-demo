package com.example.redisdemo.presentation;

import com.example.redisdemo.service.RedisSampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RedisSampleController {

    private final RedisSampleService redisSampleService;

    @PostMapping("/getRedisStringValue")
    public void getRedisStringValue(String key) {
        redisSampleService.getRedisStringValue(key);
    }

    @PostMapping("/setRedisStringValue")
    public void setRedisStringValue(String key, String value) {
        redisSampleService.setRedisStringValue(key, value);
    }


}
