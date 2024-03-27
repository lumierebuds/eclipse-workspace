package com.kh.chap02_encapsulation.model.vo;

public class Student {

	// 필드부

	// 필드 == 멤버변수 == 인스턴스 변수
	// 접근제한자 [예약어] 자료명 필드명;
	private String name;
	private int age;
	private double height;

	// 생성자부

	// 메서드부 (setter/getter)

	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드명([매개변수]){
	 * 
	 * }
	 * 
	 */

	// setter메서드
	// 각 필드에 대입하고자 하는 값을 매개변수를 통해 전달받아, 필드에 대입시켜주려는 기능의 메서드
	// 이 때, setter 메서드에는 외부 클래스에서 접근이 가능해야 하기 때문에 public 접근제한자를 사용함.

	public void setName(String name) {
		this.name = name; // this? 현재 객체의 주소값을 저장하고 있는 변수, 이 변수를 통해 현재 객체의 멤버변수에 접근한다.
		/*
		 * 매개변수: 현재 메서드를 호출할때 전달되는 값을 받아주기 위한 '변수' 
		 *
		 * 필드 name = 매개변수 name; 
		 * 이때, this 키워드가 없으면 {} 중괄호 내부에선 해당 영역에서 만들어진 변수가 
		 * 접근 우선순위가 높기 때문에 name = name으로 호출시 항상 매개변수 name을 
		 * 가리키게 된다. 
		 */
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// getter 메서드
	// 필드의 데이터를 반환해주는 기능의 메서드
	// setter 메서드와 마찬가지로 외부 클래스에서 접근이 가능해야 되서 public 접근제한자를 사용한다.

	public String getName() {
		// 반환형을 void가 아닌 다른 자료형으로 주면
		// 반드시 해당 자료형에 대한 값을 반환하도록 한다.
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	// 모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드
	public String toString() {
		return name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm입니다.";
	}

}
