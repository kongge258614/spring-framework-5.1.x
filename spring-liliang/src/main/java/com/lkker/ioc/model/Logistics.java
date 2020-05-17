package com.lkker.ioc.model;

public class Logistics {

	private String id;

	private String materialName;

	public Logistics() {

		System.out.println("料型......................");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
}
