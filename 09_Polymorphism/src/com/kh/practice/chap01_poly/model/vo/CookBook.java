package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

	private boolean coupon;

	public CookBook() {

	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		// TODO Auto-generated constructor stub
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	public String toString() {
		return "Cook" + super.toString();
	}

}
