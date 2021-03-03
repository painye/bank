package com.yp.bank.counter;
/**
 * @author pan
 * @date 2021/3/2 14:11
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.bank.counter.Application
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 14:11
 */

@SpringBootApplication
@EnableEurekaClient
public class CounterApplication {
    public static void main(String[] args) {
        SpringApplication.run(CounterApplication.class);
    }
}
