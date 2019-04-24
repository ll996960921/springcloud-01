package com.smilexl.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.smilexl.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component //交给spring
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		
		return new DeptClientService() {

			@Override
			public Boolean addDept(Dept dept) {

				return null;
			}

			@Override
			public Dept findById(Long id) {
				
				return  new Dept().setDeptno(id)
						    .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
	                        .setDb_source("no this database in MySQL");
			}

			@Override
			public List<Dept> findAll() {
				
				return null;
			}
			
		};
	}
}
