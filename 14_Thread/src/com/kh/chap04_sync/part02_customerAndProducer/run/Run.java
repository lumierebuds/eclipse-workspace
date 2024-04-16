package com.kh.chap04_sync.part02_customerAndProducer.run;

import com.kh.chap04_sync.part02_customerAndProducer.thread.Buffer;
import com.kh.chap04_sync.part02_customerAndProducer.thread.Consumer;
import com.kh.chap04_sync.part02_customerAndProducer.thread.Producer;

public class Run {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer);
		Thread consumer = new Consumer(buffer);

		producer.start();
		consumer.start();

		try {
			producer.join(); // 메인 스레드는 멈춘다.
			/*
			 * join(mills) : 지정된 시간이 지나거나, 스레드의 작업이 완료되기 전까지 스레드를 실행시키고, 현재 스레드는 대기 
			 */
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메인스레드 종료.");
	}

}
