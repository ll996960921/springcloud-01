package com.smilexl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smilexl.springcloud.entities.Dept;
import com.smilexl.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service;
	
	// 添加
	@PostMapping("/consumer/dept/add")
	public Boolean addDept(Dept dept) {
		
		return service.addDept(dept);
	}

	// 根据id查询
	@GetMapping("/consumer/dept/get/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	// 查询全部
	@GetMapping("/consumer/dept/list")
	public List<Dept> findAll() {
		return service.findAll();
	}
	
}
