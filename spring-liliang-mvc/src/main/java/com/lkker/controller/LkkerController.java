package com.lkker.controller;

import com.lkker.model.UserInfo;
import com.lkker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LkkerController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userinfo/{userId}",method = RequestMethod.GET)
	public UserInfo UserInfo(@PathVariable("userId") String userId){
		UserInfo userInfo = userService.getUserInfo(userId);
		return userInfo;
	}

}
