package com.smilexl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smilexl.springcloud.entities.User;
import com.smilexl.springcloud.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;


	// 根据id查询
	@GetMapping("/user/{id}")
	@CrossOrigin(origins="*", maxAge=3600)
	public User findById(@PathVariable("id") Integer id) {
		return userService.findById(id);
	}

	// 查询全部
	@GetMapping("/user/list")
	@CrossOrigin(origins="*", maxAge=3600)
	public List<User> findAll() {
		return userService.findAll();
	}

}
