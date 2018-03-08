package com.github.jlf1997.demo_springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.github.jlf1997.spring_boot_sdk.model.BaseModel;

import io.swagger.annotations.ApiModel;

@Entity
@Table
@ApiModel(value="Shop",description="商店信息")
public class Shop  extends BaseModel{

	private String shopName;
	
	@Id
	@GeneratedValue
	private Long id;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
