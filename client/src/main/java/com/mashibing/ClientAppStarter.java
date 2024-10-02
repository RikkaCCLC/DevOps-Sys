package com.mashibing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zjw
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientAppStarter {

    public static void main(String[] args) {
        SpringApplication.run(ClientAppStarter.class,args);
    }


}
