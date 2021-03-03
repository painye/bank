package com.yp.bank.euraka;
/**
 * @author pan
 * @date 2021/3/3 11:57
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : com.yp.bank.euraka.EurakaApplication
 * @Description : 类描述
 * @author pan
 * @date 2021/3/3 11:57
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakaApplication.class, args);
    }
}
