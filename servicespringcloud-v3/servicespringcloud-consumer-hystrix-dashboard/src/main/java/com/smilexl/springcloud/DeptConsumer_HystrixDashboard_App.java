package com.smilexl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;



@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class DeptConsumer_HystrixDashboard_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_HystrixDashboard_App.class, args);
	}

}
