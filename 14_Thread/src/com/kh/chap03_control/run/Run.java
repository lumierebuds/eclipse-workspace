package com.kh.chap03_control.run;

import com.kh.chap03_control.thread.MultipleThread;

public class Run {
	/*
	 * 3의 배수 출력 쓰레드와 
	 * 4의 배수 출력 쓰레드를 생성하고 실행
	 * 
	 * 출력문 : [Thread 이름 - 배수 ] 
	 * 실행간경느 0.2초이며, 각 쓰레드는 숫자가 100이 넘으면 작동을 정지할것 
	 * [3의 배수 스레드 - 3] 
	 * [3의 배수 스레드 - 6] 
	 */

	public static void main(String[] args) {
		Thread three = new Thread(new MultipleThread(3));
		three.setName("3의 배수 스레드");

		Thread four = new Thread(new MultipleThread(4));
		four.setName("4의 배수 스레드");

		three.start();
		four.start();
	}

}
