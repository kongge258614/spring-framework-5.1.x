package com.lkker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LkkerController {

	@RequestMapping(value = "/userinfo",method = RequestMethod.GET)
	public String UserInfo(){
		System.out.println("---------userinfo-----------");
		return "hello";
	}
}
