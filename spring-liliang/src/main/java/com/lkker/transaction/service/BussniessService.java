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

	// 根据商品id查看商品库存
	Storage getStorage(String id);

	// 创建订单
	void createOrder(Order order);

	// 根据商品id和购买数量扣除商品库存
	void deduct(String commoditycodeid,int count);

	// 根据订单id查询订单
	Order getOrder(String id);

	// 购买 商品名称，购买数量，商品单价
	void purchase(String name, int purchasequantity, BigDecimal commodityPrice);

}
