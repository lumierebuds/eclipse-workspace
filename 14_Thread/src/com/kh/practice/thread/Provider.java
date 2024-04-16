package com.kh.practice.thread;

public class Provider extends Thread {

	private Data data;

	public Provider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			int value = (int) (Math.random() * 100 + 1);
			data.setValue(value);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
