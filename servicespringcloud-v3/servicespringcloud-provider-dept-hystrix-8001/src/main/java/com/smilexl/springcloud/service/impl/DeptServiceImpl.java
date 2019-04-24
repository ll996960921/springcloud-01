package com.smilexl.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smilexl.springcloud.dao.DeptDao;
import com.smilexl.springcloud.entities.Dept;
import com.smilexl.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean addDept(Dept dept) {
		
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		
		return deptDao.findAll();
	}

}
