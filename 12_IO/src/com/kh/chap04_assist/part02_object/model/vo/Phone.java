package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

/*
 * 직렬화(serialization) 
 * - 객체의 상태를 그대로 저장하거나, 복원하는 방식을 직렬화, 역직렬화라고 부름.
 *   객체의 데이터를 Byte[] 로 변환하여 입/출력매체에 저장 -> 직렬화
 *   저장된 Byte[] 데이터를 다시 현재 프로그램으로 입력 -> 역직렬화 
 * - 직렬화를 위해서는 Serializable 인터페이스를 구현해야 함.   
 * 
 * - Serializable는 구현코드는 없고 직렬화를 "허용"하겠다는 의미로 사용.
 */

// Serializable : 객체단위 출력을 허용하도록 implements 시킨 인터페이스 
public class Phone implements Serializable {
	private String name;

	// 가격정보를 입/출력시 전송하지 못하게 하려면 ? 예약어(transient)
	private transient int price;

	public Phone() {

	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}

}
