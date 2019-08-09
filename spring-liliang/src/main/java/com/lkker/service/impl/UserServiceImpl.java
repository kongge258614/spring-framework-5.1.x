package com.lkker.service.impl;

import com.lkker.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2019/8/9 22:59
 * @Description
 **/

@Service
public class UserServiceImpl implements UserService {
	@Override
	public void save() {
		System.out.println("save user..........");
	}
}
