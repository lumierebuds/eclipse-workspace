package com.kh.chap02_objectArray.model.vo;

public class Phone {

	// 이름, 시리즈, 브랜드명, 가격
	private String name;
	private String series;
	private String brand;
	private int price;

	public Phone() {

	}

	public Phone(String name, String series, String brand, int price) {
		super();
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", series=" + series + ", brand=" + brand + ", price=" + price + "]";
	}

}
