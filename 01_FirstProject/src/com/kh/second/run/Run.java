package com.kh.second.run;

// import문: 정의한 클래스를 현재 클래스에서 사용하도록 한다.
import com.kh.second.MyName;

public class Run {
	
	public static void main(String[] args) {
		
		MyName name = new MyName();
		name.callMyName(); // 함수 호출 연산자 () 
	}
}
