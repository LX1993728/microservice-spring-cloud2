package com.liuxun.cloud.feign;

import com.liuxun.cloud.entity.User;
import com.liuxun.config.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "microservice-provider-user",fallback = HystrixClientFallback.class,configuration = FeignConfiguration.class)
public interface UserFeignClient {
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}

