package com.lkker.ioc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2019/9/2 17:10
 * @Description
 **/
@Service
public class UserService {

	@Autowired
	private LogisticsService logisticsService;

	public void save() {

		// Spring如何解决循环依赖

		System.out.println("user save.............");
		logisticsService.save();
		System.out.println("UserService调用logisticsService............");
	}

}
