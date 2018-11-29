package com.zzz.demo.springfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignApplication.class, args);
	}
}
