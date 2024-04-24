package com.kh.chap01_constant.model.vo;

public class Dress {
	private String name;
	private int dressColor;

	public Dress() {

	}

	public Dress(String name, int dressColor) {
		super();
		this.name = name;
		this.dressColor = dressColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDressColor() {
		return dressColor;
	}

	public void setDressColor(int dressColor) {
		this.dressColor = dressColor;
	}

	@Override
	public String toString() {
		return "Dress [name=" + name + ", dressColor=" + dressColor + "]";
	}


}
