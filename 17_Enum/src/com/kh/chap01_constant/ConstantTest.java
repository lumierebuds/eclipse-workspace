package com.kh.chap01_constant;

import com.kh.chap01_constant.model._enum.CarColor;
import com.kh.chap01_constant.model._enum.DressColor;
import com.kh.chap01_constant.model.vo.Car;
import com.kh.chap01_constant.model.vo.Dress;

public class ConstantTest {
	/*
	 * 상수? 
	 * - 값이 바뀌지 않는 변수를 의미함. 
	 * - 사용시기? 저장하고 있는 값에 대해서 가독성이나 전달력을 부여하고자 할때.
	 * - 일반적으로 상수값은 변수명을 통해 의미를 부여하고, 실제 값은 "정수값"을 보관하는 경우가 대부분. 
	 * 
	 * 상수의 단점?
	 * - 값에 대한 검증기능이 없음 -> 컴파일러가 에러를 안잡아줌
	 * 
	 */



	public static void main(String[] args) {

		/* 
		 * 자동차의 색깔을 관리할 상수값 
		 * 0 : 검은색
		 * 1 : 빨간색
		 * 2 : 파랑색 
		 * ...
		 * 
		 * */
		Car car1 = new Car();
		car1.setName("테슬라");
		car1.setCarColor(CarColor.BLACK);

		Dress dress1 = new Dress();
		dress1.setName("외투");
		dress1.setDressColor(DressColor.BLACK);

		// 상수의 단점은 값에대한 검증기능이 없다.
		// 이 문제점을 해결하기 위해 상수값으로
	}

}
