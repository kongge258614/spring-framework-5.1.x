package com.lkker.ioc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2019/9/2 17:12
 * @Description
 **/
@Service
public class LogisticsService {
	@Autowired
	private UserService userService;

//	public UserService getUserService() {
//		return userService;
//	}
//
//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}

	public void save() {
		userService.save();
		System.out.println("logistics save............");
	}
}
