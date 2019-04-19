package com.smilexl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.smilexl.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	
	/**
	 * RestTemplate提供了多种便捷访问远程Http服务的方法
	  *   是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
	  *   使用restTemplate访问restful接口非常的简单粗暴无脑。
	 *	(url, requestMap, ResponseBean.class)这三个参数分别代表 
	 *	REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	
//	private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://SERVICESPRINGCLOUD-DEPT";  //改为微服务名字

	@Autowired
	private RestTemplate restTemplate;

	// 添加
	@GetMapping("/consumer/dept/add")
	public Boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	// 根据id查询
	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	// 根据id查询
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}

}
