package com.lkker.service;

import com.lkker.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserInfo getUserInfo(String userId){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(userId);
		userInfo.setName("liliang");
		userInfo.setAge(18);

		return userInfo;
	}
}
