package com.smilexl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@EnableZuulProxy
@SpringBootApplication
public class Zuul_9527_StartSpringCloudApp {

	public static void main(String[] args) {
		
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
	
}
