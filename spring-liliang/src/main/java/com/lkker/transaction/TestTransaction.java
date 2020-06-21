package com.lkker.transaction;

import com.lkker.transaction.config.TransactionConfig;
import com.lkker.transaction.entity.Order;
import com.lkker.transaction.entity.Storage;
import com.lkker.transaction.service.BussniessService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class TestTransaction {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(TransactionConfig.class);
		BussniessService bean = (BussniessService) atx.getBean("bussniessServiceImpl");


		Order order = new Order();
		order.setId("LX1001");
		order.setCommoditycodeid("1002");
		order.setPurchasequantity(1);
		order.setCommodityPrice(new BigDecimal("4999"));
		bean.createOrder(order);

//		bean.deduct("1001",1);


	}
}
