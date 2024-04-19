package com.kh.chap01_innerClass.part04_annonymous;

public class OuterClass4 {

	/*
	 * 4) 익명 내부 클래스 
	 *  - 이름이 없는 외부클래스로 지역변수처럼 사용되는 내부 클래스
	 *  - 지역 내부 클래스에서 불필요한 코드작성부분을 간결화한 사용방법 
	 *  - class 선언과 객체 생성을 합쳐서 표현함. 
	 *  - 메서드의 반환값으로나, 매개변수 및 변수에 대입할 값으로써 활용된다.  
	 */

	public Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "실행중");
		}
	};

	public Runnable getRunnable(String threadName) {

		// 생성자를 통해서 익명 내부 클래스를 반환해준다.
		// 지역변수처럼 사용한다.
		// new 구현하고자하는 자료형 + 익명클래스생성자 + 내부 코드
		return new Runnable() { // 메서드의 반환형으로 익명내부클래스 추가함.

			@Override
			public void run() {
				// threadName = "지역내부쓰레드"; // 지역내부클래스이기 때문에 똑같이 상수값으로 취급.
				System.out.println(threadName);
			}
		};
	}

}
