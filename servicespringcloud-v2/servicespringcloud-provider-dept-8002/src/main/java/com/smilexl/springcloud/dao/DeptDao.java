package com.smilexl.springcloud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.smilexl.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	
	//添加
	public boolean addDept(Dept dept);

	//根据id查询
	public Dept findById(Long id);

	//查询全部
	public List<Dept> findAll();
	
}
