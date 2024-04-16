package com.kh.practice.thread;

public class Data {

	private int value;
	// 플래그 변수 (객체의 상태를 저장하고 흐름을 제어하기 위한 변수)
	private boolean isEmpty = true;

	public Data() {

	}

	/*
	public void setValue(int value) {
	
		synchronized (this) {
	
			if (isEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	
			// true 값이면 ? 기록하고, isEmpty를 false로 변경
			this.value = value;
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
	
			notify(); // 동기화된 블럭안에서 대기중인 다른 스레드를 깨우는 역할
		}
	}
	
	public int getValue() {
	
		synchronized (this) {
			if (isEmpty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	
			// false 값이면 value 값을 꺼내고, true로 변경
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			isEmpty = true;
			notify();
			return value;
		}
	
	}
	*/

	// [강사님 코드]

	public synchronized void setValue(int value) {
		try {

			// setVAlue 메서드 호출후, 변환된 key값을 또 Provider가 가져갔을때
			if (isEmpty == false) {
				wait();
			}

			this.value = value;
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);

			notify(); // 대기중인 스레드를 실행시킴. 깨움

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized int getValue() {
		int value = 0;

		if (isEmpty == true) {
			try {
				throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오..");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());

				try {
					wait(); // 일시정지
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}

		value = this.value;
		isEmpty = true;
		System.out.println("get value : " + value);
		System.out.println("값을 꺼냈습니다. value가 비었습니다.");
		notify();

		// 대기 상태의 스레드를 실행시킴ㅎ

		return value;
	}

}
