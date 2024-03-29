package com.kh.chap01_beforeVsAfter.after.model.vo;

public class Tv extends Product {

	private int inch;

	public Tv() {

	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public String toString() {
		return super.toString() + ", inch : " + inch;
	}
}
