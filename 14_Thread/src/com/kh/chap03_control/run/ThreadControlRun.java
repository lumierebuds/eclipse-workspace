package com.kh.chap03_control.run;

import java.util.Scanner;

import com.kh.chap03_control.thread.SleepThread;

public class ThreadControlRun {

	public static void main(String[] args) {
		/*
		 * 스레드 컨트롤 메서드
		 * 작업중인(실행중인) 스레드를 "일시정지" 상태로 변경하는 메서드
		 * 
		 * 1) Thread.sleep(mils) : 스레드를 지정된 시간동안 "일시정지" 시키는 메서드. 지정된 시간이 지나면 
		 * 						   다시 실행 대기 상태로 돌아감. (자주사용됨) 
		 * 
		 * 2) wait() : 동기화된 블록 안에서 사용하며, 지정 시간이 지나거나 다른 스레드에 의해 호출되기 전까지 대기시킨다. 
		 * 
		 * 
		 * 3) join() : 지정된 시간동안 다른 스레드를 실행시키고, 현재 스레드를 대기시킴. 
		 * 	 		   시간이 지나거나 작업이 완료되면 현재 스레드가 다시 가동.
		 * 
		 * 4) IO BLOCK : 입출력이 완료되기 전까지 일시정지 상태로 만듬.
		 * 
		 * 일시정지를 푸는 메서드
		 * 1) notify / notifyAll() : 동기화된 블럭안에서 대기중인 쓰레드를 깨우는 역할을 함.
		 * 2) interrupt() : sleep()이나 join()에 의해 "일시정지"상태인 스레드를 실행 대기 상태로 만든다.
		 * 					(쓰레드는 InterruptException에 의해 일시정지를 벗어난다.) 
		 * 
		 */

		// 0.05초씩 일시정지하는 스레드 => 1000ms = 15, 50ms == 0.05s
		// 0.03초씩 일시정지하는 스레드 => 30ms == 0.03

		Thread a = new Thread(new SleepThread('|', 50));
		Thread b = new Thread(new SleepThread('-', 30), "B 쓰레드");

		a.setName("A 쓰레드");
		a.start();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("종료하시려면 y를 입력해주세요. (빨리) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'y') { // y를 입력시 a쓰레드 종료
				break;

			}
		}
		a.interrupt(); // 충돌시키다.
		// b.start();

	}
}
