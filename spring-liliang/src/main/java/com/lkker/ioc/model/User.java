package com.lkker.ioc.model;

/**
 * @Author liliang
 * @Date 2019/8/9 21:54
 * @Description
 **/

public class User {

	private String id;

	private String name;

	private int age;

	private String phoneNumber;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
