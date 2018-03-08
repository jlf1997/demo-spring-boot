package com.github.jlf1997.demo_springboot.vo;

import com.github.jlf1997.demo_springboot.model.User;
import com.github.jlf1997.spring_boot_sdk.vo_translation.DefaultModeAndViewlTranslation;


public class UserAndShopVo extends User{

	
	private String test;
	
	

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	
	public static class UserVoTranslation extends DefaultModeAndViewlTranslation<User,UserAndShopVo>{
		@Override
		public User viewToModel(UserAndShopVo view, Class<User> classM)
				throws InstantiationException, IllegalAccessException {
			User user = super.viewToModel(view, classM);
			return user;
			
		}

		@Override
		public UserAndShopVo modelToView(User model, Class<UserAndShopVo> classV)
				throws InstantiationException, IllegalAccessException {
			UserAndShopVo view = super.modelToView(model, classV);
			view.setTest("test123");
//			view.setCreTime(null);			
			return view;
			
		}
	}

	
	
	
	
	
	
}
