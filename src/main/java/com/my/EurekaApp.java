package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dumin on 6/29/17.
 */

@Configuration
@EnableAutoConfiguration
@RestController
@RequestMapping("/")
@SpringBootApplication
@EnableEurekaServer
@PropertySource("classpath:eureka-server.properties")
public class EurekaApp {

    @RequestMapping(method = RequestMethod.GET)
    public String getStatus() {
        return "Hallow eureka";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }

}
