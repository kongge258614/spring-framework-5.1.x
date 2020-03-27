package com.lkker.mvc.service;

import org.springframework.liliang.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class LkkerService {

	public UserInfo getUserInfo(String id){

		UserInfo userInfo = new UserInfo();

		userInfo.setId(id);
		userInfo.setName("可乐Vicky");
		userInfo.setAge(23);

		return userInfo;
	}
}
