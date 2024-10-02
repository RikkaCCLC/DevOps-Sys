package com.mashibing.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zjw
 * @description
 */
@FeignClient("server")
public interface ServerFeign {

    @GetMapping("/test")
    String test();
}
