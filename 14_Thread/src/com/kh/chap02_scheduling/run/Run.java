package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.thread.Car;
import com.kh.chap02_scheduling.thread.Plane;
import com.kh.chap02_scheduling.thread.Tank;

public class Run {

	/*
	 * 스레드 스케줄링?
	 * 
	 * 스레드의 작업순서를 조절하는 방법
	 * 
	 * 1) 우선순위 기반 스케줄링
	 * 	  - 스레드마다 우선순위를 부여하는 방식
	 * 	  - 우선순위가 더 높은 스레드가 작업시간을 더 많이 할당받을 수 있음
	 *    - 코드로 우선순위 부여가 가능. 
	 * 
	 * 2) 순환 할당 방식 스케줄링(OS의 기본 스케줄링방식) --> Rount Robin 방식
	 * 	  - 각 스레드에게 시간 할당량을 정하여 스레드를 정해진 시간만큼 실행시키는 방식 
	 *    - 우선순위가 같은 스레드에는 순환 할당 방식이 적용 
	 *    - 코드로 제어 불가능. => OS가 관리하므로
	 * 
	 * 
	 * 코드로 가능한 것은 스레드 생성, 실행, 중지, 우선순위 설정 정도만 가능하다. 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Thread car = new Thread(new Car(), "Car");
		Thread plane = new Thread(new Plane(), "Plane");
		Thread tank = new Thread(new Tank(), "Tank");

		// 스레드는 기본적으로 5의 우선순위를 가지고 있다. (1~10)
		System.out.println("------우선순위 변경 전------");
		System.out.println(Thread.currentThread().getName() + "의 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println(car.getName() + "의 우선순위 : " + car.getPriority());
		System.out.println(plane.getName() + "의 우선순위 : " + plane.getPriority());
		System.out.println(tank.getName() + "의 우선순위 : " + tank.getPriority());

		System.out.println("------우선순위 변경 후------");
		car.setPriority(Thread.MIN_PRIORITY); // 1
		tank.setPriority(Thread.MAX_PRIORITY); // 10
		System.out.println(car.getName() + "의 우선순위 : " + car.getPriority());
		System.out.println(plane.getName() + "의 우선순위 : " + plane.getPriority());
		System.out.println(tank.getName() + "의 우선순위 : " + tank.getPriority());

		car.setDaemon(true);
		plane.setDaemon(true);
		tank.setDaemon(true);

		car.start();
		plane.start();
		tank.start();

		/*
		 * 메인 스레드가 종료되더라도 실행 중인 스레드가 하나라도 있으면 프로세스는 종료되지 않는다.
		 * (스레드의 독립성)
		 * main 스레드가 종료시 다른 스레드도 종료시키게끔 하기 위해서는 setDaemon을 통해 주종관계 설정을 해줘야한다. 
		 * 
		 * 주의점은 스레드중에 하나라도 setDaemon으로 설정을 하지 않았다면 정상 작동하지 않음. 
		 * 스레드를 start() 시키기전에 setDaemon 설정을 해줘야함. (우선순위도 마찬가지)
		 * 
		 */

		System.out.println("메인 스레드 종료");
	}

}
