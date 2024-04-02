package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Person {
	private String name;
	private double weight; // 몸무게
	private int health; // 건강도

	public Person() {

	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String toString() {
		return "name : " + name + ", weight : " + weight + ", health : " + health;
	}

//	public abstract void eat();
//
//	public abstract void sleep();

}
