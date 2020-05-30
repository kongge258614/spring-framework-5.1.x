package com.lkker.transaction;

import com.lkker.transaction.config.TransactionConfig;
import com.lkker.transaction.service.BussniessService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTransaction {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(TransactionConfig.class);
		BussniessService bean = (BussniessService) atx.getBean("bussniessServiceImpl");
		bean.getStorage("1001");
	}
}
