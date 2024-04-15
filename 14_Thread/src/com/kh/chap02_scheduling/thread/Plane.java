package com.kh.chap02_scheduling.thread;

public class Plane implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 20; i++) {

			System.out.println("Plane flight..");
			try {
				Thread.sleep(100); // 현재 작동중인 스레드를 ms시간만큼 지연시키는 메서드
			} catch (InterruptedException e) {
				break; // interrupt 발생시 작업 종료
				// e.printStackTrace();
			}
		}
	}

}
