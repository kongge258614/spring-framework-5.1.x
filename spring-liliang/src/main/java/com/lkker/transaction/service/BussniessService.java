package com.lkker.transaction.service;

import com.lkker.transaction.entity.Order;
import com.lkker.transaction.entity.Storage;

import java.math.BigDecimal;

/**
 * @Author liliang
 * @Date 2020/5/29 10:52
 * @Description
 **/
public interface BussniessService {


	// 创建订单
	void createOrder(Order order);

	// 根据商品id和购买数量扣除商品库存
	void deduct(String commoditycodeid,int count);

}
