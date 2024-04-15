package com.kh.chap01_thread.thread;

// 1. Thread 클래스 상속시키기 
public class Thread1 extends Thread {

	// 2. run 메서드 오버라이딩
	// run() : 실제 작업이 수행되는 코드. 스레드 실행시 호출되는 코드
	@Override
	public void run() {
		// 작업시킬 코드 작성

		for (int i = 1; i <= 100; i++) {
			System.out.println(super.getName() + " [" + i + "]");
			// getName() : 스레드의 이름 반환, 이름 미지정시 Thread- 0, Thread-1 순서대로 이름이 붙음
		}
	}

}
