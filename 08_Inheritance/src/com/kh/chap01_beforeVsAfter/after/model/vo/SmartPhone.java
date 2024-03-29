package com.kh.chap01_beforeVsAfter.after.model.vo;

public class SmartPhone extends Product {

	private String mobileAgency;

	public SmartPhone() {

	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public String toString() {
		return super.toString() + ", mobileAgency : " + mobileAgency;
	}

}
