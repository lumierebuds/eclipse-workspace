package com.kh.chap02_override.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * 오버라이딩 
	 * 
	 *  - 상속받고 있는 부모 클래스의 메서드를 자식 클래스에서 재정의(Override) 하는것
	 *  - 부모가 제공하고 있는 메서드를 자식이 일부 고쳐서 사용하겠다. 라는 의미
	 *  - 실행시 자식 메서드가 "우선권"을 가짐 
	 * 
	 * 오버라이딩 성립 조건
	 * 
	 * - 부모 메서드의 메서드명과 동일
	 * - 매개변수의 자료형, 개수, 순서가 완벽히 동일해야한다.
	 * - 반환형도 동일해야함
	 * - 접근 제한자는 부모보다 같거나, 공유범위가 커야한다. 
	 * 
	 * 
	 */

	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

}
