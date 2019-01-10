package org.morality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Plat_Service_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Plat_Service_8001.class);
    }
}
