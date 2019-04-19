package com.smilexl.springcloud.entities;


import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial") //压制警告
@NoArgsConstructor  //无参构造方法
@Data  // setter、getter 方法
@Accessors(chain=true) //链式结构
public class Dept implements Serializable{  //必须实现序列化

	private Long deptno;     //主键
	private String dname;// 部门名称
	private String db_source; //来自哪个数据库
	
}
