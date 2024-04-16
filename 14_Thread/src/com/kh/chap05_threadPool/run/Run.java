package com.kh.chap05_threadPool.run;

import com.kh.chap05_threadPool.thread.ThreadPool;

public class Run {

	public static void main(String[] args) {
		// 스레드풀의 크기를 100으로 설정하여 스레드풀 객체 생성.
		ThreadPool threadPool = new ThreadPool(100);

		// 작업내용을 저장시킨 Runnable 객체 생성후, 작업큐로 전달.

		Runnable task1 = new Runnable() {

			@Override
			public void run() {

				for (int i = 1; i <= 100; i++) {
					System.out.println("테스트1 [" + i + "]");
				}
			}
		};

		while (true)
			threadPool.submit(task1);

	}
}
