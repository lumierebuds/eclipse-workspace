package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {

	private String babyBirth; // 출산, 입양, 없음

	public Mother() {
		super();
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
		Basic.humanism();

	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String toString() {
		return super.toString() + ", babyBirth : " + babyBirth;
	}

	@Override
	public void eat() {
		// 엄마가 밥 먹으면?
		// 기존의 몸무게 + 10
		setWeight(getWeight() + 10);

		// 건강도 증가
		setHealth(getHealth() + 5);

	}

	@Override
	public void sleep() {

		setHealth(getHealth() + 10);
		setWeight(getWeight() - 5);

	}

	public void run() {
		setHealth(getHealth() + 20);
		setWeight(getWeight() - 10);
	}

	@Override
	public void breating() {
		System.out.println("엄마숨쉬기");
	}

}
