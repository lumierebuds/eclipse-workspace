package com.kh.chap01_innerClass.part03_local;

public class OuterClass3 {

	/*
	 * 3) 지역내부클래스? 
	 * - 지역변수처럼 메서드 내부에서 클래스를 정의하여 사용하는것
	 * - 이렇게 생성한 클래스는 메서드 안에서만 사용가능하며 메서드가 호출되는 시점에 생성.
	 * - 지역내부클래스안에서 지역변수는 상수처럼 취급된다. ★
	 * 
	 * 진도 나가기전 기억해둘것 
	 * 1) 메서드 호출시 메모리 영역중 스택에 메서드가 쌓이고 메서드 안에 지역변수들을 위한 저장공간이 할당됨. 메서드가 종료되면
	 *    메서드 안에 부여되어있던 메모리들을 싹다 회수함. 스택안에 메서드에 대한 메모리 공간이 지워진다.
	 *    스택에 쌓이는 메서드 == 스택 프레임(매개변수, 지역변수, 반환되는 위치값 정보등등이 있음)
	 *    
	 * 2) static 키워드가 붙은 필드는 static 메모리 영역에 별도의 저장공간을 할당받는다. 
	 *    static final(상수)키워드가 붙은 필드는? static 메모리 영역 안에서 상수풀(상수값만 모아두는곳)에 저장공간할당.
	 *    final 키워드가 붙은 필드? static 메모리 영역중 상수메모리에 저장공간을 할당받음.   
	 * 							상수메모리내부에 상수풀 존재
	 * 
	 */

	private String outerSter = "외부클래스 필드";
	private static String staticOuterStr = "외부클래스 스태틱변수";

	// 반환형이 Runnable인 getRunnable 메서드
	public Runnable getRunnable(int num) {

		int local = 1; // 지역변수
		int notUsed = 4;
		notUsed = 5; // 사용안하고 있으면 수정가능

		// 지역내부클래스 : 지역변수와 동일한 생명주기를 가졌다.
		class LocalInner implements Runnable {

			int localInnerNum = 10;

			@Override
			public void run() {

				// 지역내부클래스에서 지역 변수 사용은 가능. 단 상수로 취급해버림.
				System.out.println(local);
				// local = 3; // 값의 수정이 불가능.
				System.out.println(num);
				System.out.println(localInnerNum);
				System.out.println(outerSter);
				System.out.println(staticOuterStr);

			}
		}

		return new LocalInner(); // Runnable 타입의 지역내부클래스를 반환
	}

}
