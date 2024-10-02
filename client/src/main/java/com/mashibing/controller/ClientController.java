package com.mashibing.controller;

import com.mashibing.feign.ServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjw
 * @description
 */
@RestController
public class ClientController {

    @Autowired
    private ServerFeign serverFeign;

    @GetMapping("/test")
    public String test(){
        String result = serverFeign.test();
        return "client --------->" + result;
        // client ---------> Server!!!!
    }

}
