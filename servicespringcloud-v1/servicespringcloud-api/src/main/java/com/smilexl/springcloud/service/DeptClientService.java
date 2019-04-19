package com.smilexl.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smilexl.springcloud.entities.Dept;

@FeignClient(value="SERVICESPRINGCLOUD-DEPT")
public interface DeptClientService {
	// 添加
	@GetMapping("/dept/add")
	public Boolean addDept(Dept dept);
	// 根据id查询
	@GetMapping("/dept/get/{id}")
	public Dept findById(@PathVariable("id") Long id);

	// 根据id查询
	@GetMapping("/dept/list")
	public List<Dept> findAll();
}
