package com.lkker.ioc.service.impl;

import com.lkker.ioc.service.LogisticsService;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2019/9/2 17:12
 * @Description
 **/
@Service
public class LogisticsServiceImpl implements LogisticsService {

	@Override
	public void save() {
		System.out.println("logistics save............");
	}
}
