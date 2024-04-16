package com.kh.chap04_sync.part01_synchronize.sync;

// 공유자원(계좌) 
// 2개의 ATM기가 하나의 Account에서 출금을 시도하려는 상황을 만들예정.

public class Account {

	private int balance = 3000; // 잔고

	public Account() {
	}

	public int getBalance() {
		return balance;
	}

	/*
	 * 출금메서드
	 * 
	 * 동기화처리. 
	 * 객체단위로 동기화처리 : account 객체를 임계영역으로 설정하게된다. 
	 * 객체를 임계영역으로 지정하기 위한 방법으로는 
	 * 
	 * 1. 메서드를 synchronized로 만들기 -> 메서드 전체에 락을 걸고, 메서드 종료시 락이 풀림.
	 * 2. synchronized block 사용하기 -> 동기화가 필요한 메서드의 일부에만 락을 건다. 
	 * 								   임계영역이 아닌 지역까지는 모든 스레드에서 접근가능하기 때문에 좀더 효율이 좋다.
	 * 
	 */
	public /* synchronized */ void withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 접근중인 스레드 : " + threadName);

		synchronized (this) {
			System.out.println("[" + threadName + "] 현재 잔액은? " + balance);

			if (money <= balance) { // 잔고가 여유로운 상황
				balance -= money; // 잔고 - 출금금액
				System.out.printf("[%s] %d원 출금 >> 잔고 : %d원\n", threadName, money, balance);
			} else { // 잔고가 여유롭지 않은 상황
				System.out.printf("[%s] %d원 출금시도 >>> 잔고가 다 떨어졌습니다. \n", threadName, money);
			}

		}

	}
}
