package com.kh.chap03_class.model.vo;

public class Person {

	// 필드부
	// 사이트의 회원 저장정보 예시
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	// 각 필드에 대입시키고자 하는 값을 전달받아 각 필드에 대입시켜주는 setter 메서드
	// setter 표기법 : set+필드명(camelCase)
	// 매개변수명은 관례상 필드명과 동일하게 간다. (달라도 상관 없음)

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 각 필드값을 돌려주는 getter 메서드
	// getter 표기법: get+필드명(camelCase)
	// 반환명은 반환시키고자 하는 값의 자료형에 맞춰서 작성할것

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	// 모든 필드값을 하나의 문자열로 합쳐서 반환해주는 메서드 작성
	// 문자열 형태 : id+", "+pwd+", "+name+", "

	public String toString() {
		return id + ", " + pwd + ", " + name + ", " + age + ", " + gender + ", " + phone + ", " + email;
	}

}
