package com.kh.chap04_sync.part03_deadlock;

import com.kh.chap04_sync.part02_customerAndProducer.thread.Buffer;

public class Run {

	/*
	 * 교착상태 ? 
	 * 각각의 스레드가 서로 임계영역에 접근할 수 있는 key를 얻지 못하고, key를 얻기 위해 무한 대기에 돌입하는것. 
	 * 	
	 *  * 
	 */

	// 공유자원 1
	private static Buffer buffer1 = new Buffer();

	// 공유자원 2
	private static Buffer buffer2 = new Buffer();

	public static void main(String[] args) {

		// 첫번째 스레드 : buffer1을 가지고 작업을 한 후, buffer2를 가지고 이어서 작업.
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (buffer1) {
					System.out.println("Th1이 buffer1에 대한 key를 획득");
					System.out.println("thread 1 : th2가 buffer2에 대한 key를 반납함.");

					synchronized (buffer2) {
						System.out.println("Th1이 buffer2에 대한 key를 획득");
					}
				}
			}
		});

		// 두번째 스레드 : buffer2을 가지고 작업을 한 후, buffer1을 가지고 이어서 작업.

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Th2이 buffer2에 대한 key를 획득");

				System.out.println("thread2 : th1번이 buffer1에 대한 key를 반납하기전까지 대기중.");
				synchronized (buffer2) {
					System.out.println("Th2이 buffer1에 대한 key를 획득");
					synchronized (buffer1) {
						System.out.println("Th2이 buffer1에 대한 key를 획득");
					}
				}
			}
		});
		// 교착상태 해결방법?
		// 1. key 획득 순서 변경하기.
		// synchronized 블럭의 순서를 동일하게 맞춰주기
		// 2. threadControl() : notify, wait등을 통해 동기화 블럭 안에서 스레드의 흐름을 제어하기.

		th1.start();
		th2.start();

	}

}
