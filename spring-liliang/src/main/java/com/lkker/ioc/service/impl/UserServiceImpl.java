package com.lkker.ioc.service.impl;

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

//	@Autowired
	private LogisticsServiceImpl logisticsService;

	@Override
	public void save() {

		// Spring如何解决循环依赖

		System.out.println("user save.............");
		logisticsService.save();
		System.out.println("UserService调用logisticsService............");
	}

	public LogisticsServiceImpl getLogisticsService() {
		return logisticsService;
	}

	public void setLogisticsService(LogisticsServiceImpl logisticsService) {
		this.logisticsService = logisticsService;
	}
}
