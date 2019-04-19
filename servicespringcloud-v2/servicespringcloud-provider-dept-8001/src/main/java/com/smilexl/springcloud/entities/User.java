package com.smilexl.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
public class User  implements Serializable{
	
	private Integer id;
	private String lastName;
	private String email;

}
