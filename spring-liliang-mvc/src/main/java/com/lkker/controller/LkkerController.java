package com.lkker.controller;

import com.lkker.model.UserInfo;
import com.lkker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LkkerController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userinfo/{userId}",method = RequestMethod.GET)
	public UserInfo UserInfo(@PathVariable("userId") String userId){
		UserInfo userInfo = userService.getUserInfo(userId);
		return userInfo;
	}

	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public UserInfo addUser(@RequestBody UserInfo userInfo){
		UserInfo user = userInfo;
		return user;
	}

}
