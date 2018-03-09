package com.github.jlf1997.demo_springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.github.jlf1997.spring_boot_sdk.model.BaseModel;
import com.github.jlf1997.spring_boot_sdk.oper.DBFinder;
import com.github.jlf1997.spring_boot_sdk.oper.Oper;
import com.google.gson.annotations.Expose;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
@ApiModel(value="User",description="用户信息")
public class User extends BaseModel{

	
	@Id
	@GeneratedValue
	private  Long id;
	
	@ApiModelProperty(value = "名称", example = "张三")
	@DBFinder(opType=Oper.LIKE)
	private String name;
	 
	@ApiModelProperty(value = "年龄", example = "20")
	@DBFinder(opType=Oper.BETWEEN)
	private Integer age;
	 
	@ApiModelProperty(value = "日期", example = "2013-04-15 12:24:14")
	private Date time;
	
	@Expose(serialize=false)
	@ApiModelProperty(hidden=true)
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
