package com.smilexl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.smilexl.springcloud"})
@ComponentScan("com.smilexl.springcloud")
public class DeptConsumer_Feign_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_Feign_App.class, args);
	}

}
