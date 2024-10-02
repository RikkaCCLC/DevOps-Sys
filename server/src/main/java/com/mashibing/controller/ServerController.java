package com.mashibing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjw
 * @description
 */
@RestController
public class ServerController {

    @GetMapping("/test")
    public String test(){
        return "Server!!!!";
    }
}
