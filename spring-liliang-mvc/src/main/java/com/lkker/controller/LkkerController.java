package com.lkker.controller;

import com.lkker.model.UserInfo;
import com.lkker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LkkerController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userinfo",method = RequestMethod.GET)
	public UserInfo UserInfo(){
		UserInfo userInfo = userService.getUserInfo();
		return userInfo;
	}
}
