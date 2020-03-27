package com.lkker.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.liliang.model.UserInfo;
import org.springframework.liliang.service.LkkerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LkkerController {

	@Autowired
	private LkkerService lkkerService;

	@RequestMapping(name = "/userinfo/{id}",method = RequestMethod.GET)
	public UserInfo getUserInfo(@PathVariable String id){
		UserInfo userInfo = lkkerService.getUserInfo(id);
		return userInfo;
	}
}
