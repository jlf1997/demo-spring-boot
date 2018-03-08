package com.github.jlf1997.demo_springboot.controller;

import java.beans.PropertyDescriptor;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.jlf1997.demo_springboot.model.User;
import com.github.jlf1997.demo_springboot.service.UserService;
import com.github.jlf1997.demo_springboot.vo.UserAndShopVo;
import com.github.jlf1997.demo_springboot.vo.UserAndShopVo.UserVoTranslation;
import com.github.jlf1997.spring_boot_sdk.oper.DBFinder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Api(description="用户相关操作",tags= {"user"})
@RequestMapping("user")
@RestController
public class TestController {

	@Autowired
	private UserService userService;
	
	
	
	@ApiOperation(value = "查询所有用户", notes = "查询所有，不分页"			
			)	  
	@RequestMapping(value="findUser",method=RequestMethod.GET)	
	public List<UserAndShopVo> findAll(@ApiParam(name = "id",value="用户id") @RequestParam(required=false) Long id) {
		User u = new User();
		u.setId(id);
//		u.setName("t");
		u.setAge(2);
		
		List<User> list = userService.findAgeLe(u);

		UserVoTranslation e = new UserVoTranslation();
		List<UserAndShopVo> rr = null;
		try {
			rr = e.modelListToViewList(list,UserAndShopVo.class);
		} catch (InstantiationException | IllegalAccessException e1) {		
			e1.printStackTrace();
		}	
		
		return rr;
	}
	
	@ApiOperation(value = "新增用户", notes = "")
	@RequestMapping(value="save",method=RequestMethod.GET)
	public void save() {
		User user = new User();
//		user.age =10;
//		user.name = "name";
		user.setAge(10);
		user.setName("tname");
		userService.save(user);
	}
	
	@RequestMapping(value="delete/{userid}",method=RequestMethod.DELETE)
	public void delUser(@PathVariable Long userid) {
		User t = new User();
		t.setId(userid);
		userService.delete(t);
	}
}
