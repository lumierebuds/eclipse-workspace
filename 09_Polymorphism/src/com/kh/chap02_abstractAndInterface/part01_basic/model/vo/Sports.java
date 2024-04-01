package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
	private int people; // 스포츠를 참여하는 선수

	public Sports() {

	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	/*
	 * 몸통부가 존재하지 않는 미완성 메서드 == 추상 메서드
	 * 몸통부가 없는 미완성 메서드 정의시 abstract 키워드를 써야한다.
	 * 
	 * 그리고, 미완성 메서드가 하나라도 포함되는 순간, 포함된 클래스는 
	 * 미완성클래스(추상클래스)로 만들어줘야 한다. 
	 * 
	 */

	// 추상 메서드
	public abstract void rule();

	public void enterPlayer() {
		System.out.println(people + "명의 선수들이 입장합니다.");
	}

	public void startGame() {
		System.out.println("경기 시작");
	}

	public void endGame() {
		System.out.println("경기 종료");
	}

	// 템플릿 메서드
	// 규칙설명 -> 선수 입장 -> 경기 시작 -> 경기 종료

	final public void start() {
		// 1) 규칙설명 -> 경기 규칙은 스포츠 종목마다 다르므로 추상 메서드로 만듬.
		rule();

		// 2) 선수 입장.
		enterPlayer();

		// 3) 4) 경기 시작/종료
		startGame();
		endGame();
	}

}
