package com.kh.chap04_sync.part01_synchronize.sync;

public class ATM implements Runnable {

	private Account acc;

	public ATM(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {

		// 계좌에 잔고가 0원보다 많을때,
		// 100원 혹은 200원 혹은 300원씩 출금
		while (acc.getBalance() > 0) {
			// 100, 200, 300 -> (1~3 * 100)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " 종료");
	}
}
