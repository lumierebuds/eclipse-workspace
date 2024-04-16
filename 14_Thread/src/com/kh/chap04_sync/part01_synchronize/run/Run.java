package com.kh.chap04_sync.part01_synchronize.run;

import com.kh.chap04_sync.part01_synchronize.sync.ATM;
import com.kh.chap04_sync.part01_synchronize.sync.Account;

public class Run {

	/*
	 * 동기화? 
	 * 멀티 쓰레드 프로그램에서 스레드간에 "경쟁상태"에 있는 "공유자원"에 대한 "임계영역"을 지정해주는 것
	 * -----------------------------------------------------------------------------
	 * 정수기 = 공유자원
	 * 사람들 = 스레드 
	 * 
	 * 정수기를 쓰는 사람들을 줄 세우는게 아닌, 방에 정수기가 있고 열쇠f를 통해 이를 접근해서 물을 마실 수 있다. 
	 * -----------------------------------------------------------------------------
	 * 
	 * 멀티 쓰레드 프로그램에서 여러 쓰레드가 "동시에" 하나의 "공유자원"에 접근하는 것을 경쟁상태라고 부름
	 * 이를 방지하기 위해 하나의 공유자원에 접근할때는 하나의 쓰레드만 접근할 수 있도록 통제해야하는데 통제하기 위해 
	 * 해당 자원을 임계영역(통제영역)으로 지정을하고 이 통제를 하기 위해서는 "동기화"가 필요함. 
	 * 
	 * 동기화시 프로세스가 느려질 수 있다. 
	 * 
	 */

	public static void main(String[] args) {

		Account acc = new Account();
		ATM atm1 = new ATM(acc);
		ATM atm2 = new ATM(acc);
		ATM atm3 = new ATM(acc);
		ATM atm4 = new ATM(acc);

		Thread th1 = new Thread(atm1, "ATM 1");
		Thread th2 = new Thread(atm2, "ATM 2");
		Thread th3 = new Thread(atm3, "ATM 3");
		Thread th4 = new Thread(atm4, "ATM 4");

		th1.start();
		th2.start();
		th3.start();
		th4.start();

		/*
		 * 단순 동기화 처리시에는 싱크로나이즈만으로 충분함.
		 * 단, 스레드가 많은 환경에서는 스레드 컨트롤을 통해 직접 스레드를 제어해줘야함. 
		 * 
		 * 약 100개의 스레드가 공유자원에 접근하려고 할때 100개의 스레드의 상태는 실행대기.
		 * 실행상태에서는 공유자원에 대한 key를 획득할때까지 계속 접근을 할것임. 
		 * 
		 * 이 문제점을 스레드 컨트롤을 통해 하나의 스레드가 공유자원을 사용중인 동안에는, 
		 * 다른 스레드가 접근하기 못하게 다른 스레드들을 일시 정지시켜서 성능저하를 막을 수 있음.
		 * 
		 */

	}
}
