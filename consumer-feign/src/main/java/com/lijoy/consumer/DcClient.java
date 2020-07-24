package com.lijoy.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eurekaClient-1")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}