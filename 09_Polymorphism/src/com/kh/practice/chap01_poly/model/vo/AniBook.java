package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {

	private int accessAge;

	public AniBook() {

	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		// TODO Auto-generated constructor stub
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	public String toString() {
		return "Ani" + super.toString();
	}
}
