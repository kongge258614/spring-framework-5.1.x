package com.lkker.transaction.entity;

/**
 * @Author liliang
 * @Date 2020/5/29 10:42
 * @Description
 **/
public class Storage {

	// 商品id
	private String id;

	// 商品名称
	private String name;

	// 商品数量
	private int count;

	public Storage() {
	}

	public Storage(String id, String name, int count) {
		this.id = id;
		this.name = name;
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Storage{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", count=" + count +
				'}';
	}
}
