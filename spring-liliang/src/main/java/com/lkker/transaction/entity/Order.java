package com.lkker.transaction.entity;

import java.math.BigDecimal;

/**
 * @Author liliang
 * @Date 2020/5/29 10:47
 * @Description
 **/
public class Order {

	// 订单id
	private String id;

	// 商品id
	private String commoditycodeid;

	// 购买数量
	private int purchasequantity;

	// 商品单价
	private BigDecimal commodityPrice;

	public Order() {
	}

	public Order(String id, String commoditycodeid, int purchasequantity, BigDecimal commodityPrice) {
		this.id = id;
		this.commoditycodeid = commoditycodeid;
		this.purchasequantity = purchasequantity;
		this.commodityPrice = commodityPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommoditycodeid() {
		return commoditycodeid;
	}

	public void setCommoditycodeid(String commoditycodeid) {
		this.commoditycodeid = commoditycodeid;
	}

	public int getPurchasequantity() {
		return purchasequantity;
	}

	public void setPurchasequantity(int purchasequantity) {
		this.purchasequantity = purchasequantity;
	}

	public BigDecimal getCommodityPrice() {
		return commodityPrice;
	}

	public void setCommodityPrice(BigDecimal commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
}
