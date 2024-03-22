package com.kh.variable;

public class A_Variable {

	// ** 시급과 근무 일수를 곱해서 월급을 계산하는 프로그램 **  
	
	public void printVariable() {
		System.out.println("=== 변수 사용전 ===");
		
		System.out.println("시급: 18500");
		System.out.println("근무시간: 6");
		System.out.println("근무일수: 20");
		
		// 월급 = 시급 x 근무시간 x 20
		// 김지훈: 0000원 형식으로 출력 
		
		System.out.println("김지훈의 월급은 " + (18500 * 6 * 20) +"원 입니다.");
		
		System.out.println("=== 변수 사용후 ===");
		int pay = 18500; // 시급: int(4byte 저장공간확보)
		int hours = 6;  // 근무 시간: int(4byte 저장공간확보)
		int days =20;   // 근무 일수: int(4byte 저장공간확보) 
 		
		System.out.println("김지훈의 월급은 " + (pay * hours * days) +"원 입니다.");
		
	}
	
	// 변수의 선언
	
	
	public void declareVariable() {
		/*
		 * 변수의 선언? 메모리에 값을 저장하기 위한 저장공간을 확보하는 것. 
		 * 
		 * [표현법] 
		 * 자료형 변수명; 
		 * 
		 * 자료형: 어떤 값을 담아낼지, 어떤 크기의 값을 담아 낼지에 따라서 
		 * 		 변수의 크기 및 모양을 지정한다.
		 * 
		 * 변수명: 변수의 이름을 직관적으로 지정하는 부분.
		 */
		
		// 1. 논리형 변수(1byte) => true/false 
		
		boolean isTrue; // 1byte 할당 
		
		// 2. 숫자형 변수
		// 2.1 정수형 
		
		byte bNum;  // 1byte(-128~127)  
		short sNum; // 2byte(-32,768 ~ 32,767)
		int iNum; 	// 4byte(-2,147,483,648 ~ 2,147,483,647) => 정수형 대표 자료형 
		System.out.println(12345); // 대표 정수형인 int형으로 처리된다. 
		long lNum;  // 8byte(-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		
		// 2.2 실수형 
		
		float fNum;  // 4byte; => 소수점 아래 7자리까지 표현 가능
		double dNum; // 8byte; => 소수점 아래 15자리까지 표현 가능
					 //  	   =>double이 좀더 정확한 값을 저장할 수 있다. 
		
		// 3. 문자형(기본 자료형) 
		
		char ch; // 2byte; 0~65,535(유니코드문자) 
		
		// 4. 문자열(참조형) => 나중에 자세히 다뤄볼 예정
		// 기본 자료형 처럼 처리된다.
		
		String str;
		
		
		
		/*
		 * 변수에 값 대입
		 * [표현법] 
		 * 변수명 = 값 
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 	 // long 자료형임을 알려주기 위해서 소문자, 대문자 L을 표기함 
		
		fNum = 4.0f; // float 자료형임을 알려주기 위해서 소문자 f를 표기함
		dNum = 8.0;
		
		ch = 'A'; 		// 반드시 ''(작은따옴표) 안에 넣어줘야됨
		str = "String"; // 반드시 ""(쌍따옴표) 안에 넣어줘야 한다. 
		
	}
	
	public void initVariable() {
		
		/*
		 * 변수 "선언과 동시에 값을 대입" => 초기화 
		 * 자료형 변수명 = 값(리터럴);
		 */
		boolean isTrue = true;
		int longInteger = 999_999_999; // ** 언더바를 넣어서 값을 가독성있게 볼 수 있다. ** 
		
		int age = 20;
		age = 21; 
		
		
		// final: 상수 예약어 
		final int Age = 20; 
		
	}

}
