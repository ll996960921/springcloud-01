package com.smilexl.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration   //配置类，类似spring里面的applicationContext.xml
public class ConfigBean {

	/**
	 * RestTemplate提供了多种便捷访问远程Http服务的方法
	  *     是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
	  *    使用restTemplate访问restful接口非常的简单粗暴无脑。
	 *	(url, requestMap, ResponseBean.class)这三个参数分别代表 
	 *	REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	@Bean //注入bean
	@LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端,负载均衡的工具。 开启负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	
}


//相对于，<bean id="restTemplate" class="com.smilexl.springcloud.cfgbean.RestTemplate">