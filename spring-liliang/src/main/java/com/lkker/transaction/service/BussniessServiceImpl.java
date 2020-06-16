package com.lkker.transaction.service;

import com.lkker.transaction.entity.Order;
import com.lkker.transaction.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Map;

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
	public Storage getStorage(String name) {
		String sql = "SELECT * FROM `storage` WHERE name = ?; ";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, name);

		Storage storage = new Storage();
		storage.setId((String) map.get("id"));
		storage.setName((String) map.get("name"));
		storage.setCount((Integer) map.get("count"));
		return storage;
	}

	@Transactional
	@Override
	public void createOrder(Order order) {
		String sql ="insert into `order` (id,commoditycodeid,purchasequantity,commodityPrice) VALUES (?,?,?,?)";
		int result = jdbcTemplate.update(sql, order.getId(), order.getCommoditycodeid(), order.getPurchasequantity(), order.getCommodityPrice());
		System.out.println("result:"+result);

	}

	@Transactional
	@Override
	public void deduct(String commoditycodeid, int count) {
		String sql = "UPDATE `storage` SET count = count-? WHERE  id= ?;";
		int result = jdbcTemplate.update(sql, count, commoditycodeid);
		System.out.println("result:"+result);
	}

	@Override
	public Order getOrder(String id) {
		return null;
	}

	@Override
	public void purchase(String name, int purchasequantity, BigDecimal commodityPrice) {

		// 根据商品名称，查询出商品id
		Storage storage = getStorage(name);

		// 根据商品id，采购单价，采购数量创建订单表

		// 减库存

	}
}
