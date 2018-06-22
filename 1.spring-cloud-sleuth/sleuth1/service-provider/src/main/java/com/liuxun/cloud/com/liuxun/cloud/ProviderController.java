package com.liuxun.cloud.com.liuxun.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping("/provider")
    public Object provider(){
        return "consumer-provider port:8762";
    }
}
