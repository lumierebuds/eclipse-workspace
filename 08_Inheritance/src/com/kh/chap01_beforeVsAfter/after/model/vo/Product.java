package com.kh.chap01_beforeVsAfter.after.model.vo;

public class Product {

	/*
	 * 세 클래스에서 공통적으로 기술했던 요소들을 추출해서 단 한번만 정의해둔 클래스. 
	 * : 부모클래스 
	 */

	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;

	public Product() {

	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + "]";
	}

}
