package com.smilexl.springcloud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.smilexl.springcloud.entities.User;

@Mapper
public interface UserDao {
	

	//根据id查询
	public User findById(Integer id);

	//查询全部
	public List<User> findAll();
	
}
