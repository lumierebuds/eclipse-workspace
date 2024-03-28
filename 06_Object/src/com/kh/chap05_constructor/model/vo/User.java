package com.kh.chap05_constructor.model.vo;

public class User {

	// 필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;

	/*
	 * 생성자 
	 * [표기법] 
	 * 접근제한자 클래스명 ([매개변수]){
	 *		// 생성자를 통해서 객체 생성시 실행하고자 하는 코드 
	 *	} 
	 *
	 * 생성자를 작성하는 목적 
	 * 
	 * 1. 객체를 생성해주기 위한 목적 
	 * 2. 객체 생성뿐만 아니라 전달받은 매개변수로 필드에 값을 초기화할 목적 
	 * 
	 * 생성자 작성시 주의사항
	 * 
	 * 1. 반드시 클래스명과 동일해야함 (대/소문자 완벽히 동일하게)
	 * 2. 반환형이 존재하지 않는다. 즉 메서드가 아니다.
	 * 3. 여러개의 생성자를 작성할 수 있지만, 매개변수가 중복되면 안된다.
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면, 기본생성자를 JVM이 자동으로 만들어주지 않는다. 
	 *  
	 * 
	 */

	// 기본생성자(매개변수 없는 생성자)

	public User() {

		// 객체 생성만을 목적으로 할때 사용
		// 기본 생성자 작성을 생략하는 경우 - JVM이 자동으로 만들어줘서 에러가 안남
		// 단, 매개변수가 있는 생성자가 있을경우 기본 생성자도 만들어줘야한다.

		System.out.println("User 기본 생성자");

	}

	// 매개변수 3개가 있는 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	// 매개변수 5개가 있는 생성자, 모든 필드의 값을 초기화할 수 있다.

	public User(String userId, String userPwd, String userName, int age, char gender) {

		// this.userId = userId;
		// this.userPwd = userPwd;
		// this.userName = userName;

		/*
		 * 중복되는 동일한 초기화코드가 다른 생성자에 존재하는 경우
		 * this 생성자 호출가능
		 * 단, 반드시 생성자 내부 첫줄에 기술 
		 */
		this(userId, userPwd, userName); // 매개변수 3개의 생성자를 호출하도록 한다.
		this.age = age;
		this.gender = gender;
	}

	// 메서드부
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return userId + ", " + userPwd + ", " + userName + ", " + age + ", " + gender;
	}
}
