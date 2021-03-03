package com.yp.bank.fegin;
/**
 * @author pan
 * @date 2021/3/3 21:24
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : com.yp.bank.fegin.FeginApp
 * @Description : 类描述
 * @author pan
 * @date 2021/3/3 21:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeginApp {
    public static void main(String[] args) {
        SpringApplication.run(FeginApp.class, args);
    }
}
