package com.lkker.transaction.service;

import com.lkker.transaction.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author liliang
 * @Date 2020/5/29 10:59
 * @Description
 **/
@Service
public class BussniessServiceImpl implements BussniessService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 创建订单
	 * @param order
	 */
	@Transactional
	@Override
	public void createOrder(Order order) {
		String sql ="insert into `order` (id,commoditycodeid,purchasequantity,commodityPrice) VALUES (?,?,?,?)";
		int result = jdbcTemplate.update(sql, order.getId(), order.getCommoditycodeid(), order.getPurchasequantity(), order.getCommodityPrice());
		System.out.println("result:"+result);

//		BussniessService b = (BussniessService) AopContext.currentProxy();
//
//		b.deduct(order.getCommoditycodeid(),order.getPurchasequantity());
		deduct(order.getCommoditycodeid(),order.getPurchasequantity());

		System.out.println("deduct............");

	}

	/**
	 * 减库存
	 * @param commoditycodeid
	 * @param count
	 */
	@Transactional
	@Override
	public void deduct(String commoditycodeid, int count) {
		String sql = "UPDATE `storage` SET count = count-? WHERE  id= ?;";
		int result = jdbcTemplate.update(sql, count, commoditycodeid);
		System.out.println("result:"+result);
	}
}
