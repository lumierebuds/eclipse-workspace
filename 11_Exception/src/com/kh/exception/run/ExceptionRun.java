package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class ExceptionRun {

	/*
	  에러(오류) 종류 
	  
	  - 시스템 에러  
	  - 컴파일 에러
	  - 런타임 에러
	  - 논리 에러
	  
	  시스템 에러를 제외한 컴파일, 런타임, 논리 에러와 같은 덜 심각한 에러를 가지고 
	  작업을 할 예정. 이런 것들을 싹다 예외로 부름(Exception) 
	  
	  이러한 "예외"들이 발생했을 경우, 에러를 "처리"하는 방법을 정의하는 것을 "예외처리"라고함.
	  예외 처리를 해야하는 이유 : 예외 발생시 프로그램이 비정상적으로 종료되는것을 막기 위함.
	  
	 */

	public static void main(String[] args) {
		A_UncheckedException au = new A_UncheckedException();
		// au.method3();

		B_CheckedException bc = new B_CheckedException();
		// bc.method1();

		int num1 = 1;
		int num2 = 2;

		// 특정상황
		if (num1 != num2) {
			// 에러객체 생성후, throw 키워드 사용
			// throw + 에러 객체
			throw new C_CustomException("허어엉");
		}
		System.out.println("프로그램 종료...!");

	}

}
