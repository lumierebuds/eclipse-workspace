package com.kh.chap03_control.thread;

public class MultipleThread implements Runnable {

	private int number; // 3, 4
	private int origin; // 0으로 시작

	public MultipleThread() {

	}

	public MultipleThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		/*
		while (true) {
			try {
				origin += number;
				System.out.println("[" + threadName + "-" + origin + "]");
				Thread.sleep(200);
				if (origin >= 100) // 100이 넘은 이후엔
					throw new InterruptedException();
		
			} catch (InterruptedException e) {
				System.out.println("[" + threadName + " 종료" + "]");
				return;
			}
		}
		*/

		for (int i = 1; number * i <= 100; i++) {
			System.out.println("[" + threadName + "-" + (i * number) + "]");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[" + threadName + " 종료]");

	}

}
