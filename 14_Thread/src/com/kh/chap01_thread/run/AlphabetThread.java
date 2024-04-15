package com.kh.chap01_thread.run;

public class AlphabetThread {

	public static void main(String[] args) {

		/*
		 * [실습문제] 
		 * 알파벳 A~Z까지 출력하는 스레드 생성
		 * 알파벳 a~z까지 출력하는 스레드 생성
		 * 각 스레드 생성후 main 스레드에서 실행. 
		 * 출력 예시: 
		 * [대문자쓰레드 시작]
		 * [소문자쓰레드 시작]
		 * [대문자쓰레드 : A]
		 * [소문자쓰레드 : a]
		 * [대문자쓰레드 : B]
		 *	... 
		 * [대문자쓰레드 : Z]
		 * [소문자쓰레드 : z]
		 * [대문자쓰레드 종료]
		 * [소문자쓰레드 종료]
		 */

		Thread upper = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("[" + Thread.currentThread().getName() + "시작]");
				for (int i = 65; i < 91; i++) {
					System.out.println("[" + Thread.currentThread().getName() + ": " + (char) i + "]");
				}
				System.out.println("[" + Thread.currentThread().getName() + "종료]");
			}

		});

		Thread lower = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("[" + Thread.currentThread().getName() + "시작]");
				for (int i = 97; i < 123; i++) {
					System.out.println("[" + Thread.currentThread().getName() + ": " + (char) i + "]");
				}
				System.out.println("[" + Thread.currentThread().getName() + "종료]");
			}
		});

		upper.setName("대문자쓰레드");
		lower.setName("소문자스레드");

		upper.start();
		lower.start();
	}

}
