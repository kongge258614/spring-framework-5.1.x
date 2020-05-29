package com.lkker.transaction.service;

import com.lkker.transaction.entity.Order;
import com.lkker.transaction.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author liliang
 * @Date 2020/5/29 10:59
 * @Description
 **/
@Service
public class BussniessServiceImpl implements BussniessService {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public Storage getStorage(String id) {
		return null;
	}

	@Override
	public void createOrder(Order order) {

	}

	@Override
	public void deduct(String commoditycodeid, int count) {

	}

	@Override
	public Order getOrder(String id) {
		return null;
	}
}
