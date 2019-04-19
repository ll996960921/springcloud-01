package com.smilexl.springcloud.service;

import java.util.List;

import com.smilexl.springcloud.entities.User;



public interface UserService {
	
	//根据id查询
	public User findById(Integer id);

	//查询全部
	public List<User> findAll();

}
