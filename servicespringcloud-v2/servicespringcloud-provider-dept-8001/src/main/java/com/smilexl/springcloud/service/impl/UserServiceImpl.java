package com.smilexl.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smilexl.springcloud.dao.UserDao;
import com.smilexl.springcloud.entities.User;
import com.smilexl.springcloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;


	@Override
	public User findById(Integer id) {
		
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

}
