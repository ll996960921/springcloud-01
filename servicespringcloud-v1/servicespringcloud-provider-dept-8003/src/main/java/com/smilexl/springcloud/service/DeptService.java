package com.smilexl.springcloud.service;

import java.util.List;

import com.smilexl.springcloud.entities.Dept;


public interface DeptService {
	
	//添加
	public boolean addDept(Dept dept);

	//根据id查询
	public Dept findById(Long id);

	//查询全部
	public List<Dept> findAll();

}
