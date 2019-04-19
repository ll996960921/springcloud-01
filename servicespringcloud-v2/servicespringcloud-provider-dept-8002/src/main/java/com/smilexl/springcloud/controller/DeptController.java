package com.smilexl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smilexl.springcloud.entities.Dept;
//import com.smilexl.springcloud.entities.Dept;
import com.smilexl.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	// 添加
	@PostMapping("/dept/add")
	public Boolean addDept(Dept dept) {
		
		return deptService.addDept(dept);
	}

	// 根据id查询
	@GetMapping("/dept/get/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}

	// 查询全部
	@GetMapping("/dept/list")
	public List<Dept> findAll() {
		return deptService.findAll();
	}

}
