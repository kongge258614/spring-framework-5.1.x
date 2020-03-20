package com.lkker.ioc.service.impl;

import com.lkker.ioc.service.LogisticsService;
import com.lkker.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2019/9/2 17:10
 * @Description
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private LogisticsService logisticsService;

	@Override
	public void save() {

		System.out.println("user save.............");
	}
}
