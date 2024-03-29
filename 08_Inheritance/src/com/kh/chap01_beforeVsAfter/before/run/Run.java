package com.kh.chap01_beforeVsAfter.before.run;

import com.kh.chap01_beforeVsAfter.before.model.vo.Desktop;
import com.kh.chap01_beforeVsAfter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVsAfter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Desktop
		Desktop d = new Desktop("삼성", "d-01", "삼송데스크탑", 2000000, true);

		// SmartPhone
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "LGU+");

		// Tv
		Tv t = new Tv("엘지", "t-01", "울트라씬티비", 3500000, 30);

		// 출력
		System.out.println(d);
		System.out.println(s);
		System.out.println(t);

		/*
		 * 상속이 없다면? 
		 * 
		 * 매 클래스마다 중복된 코드를 일일히 기술해 둬야함. 
		 * 수정이나, 기타 유지보수시 모든 클래스 일일히 찾아서 수정해줘야함
		 * 
		 * 상속이라는 개념을 적용시켜서, 중복된 필드 및 메서드들을 하나의 클래스로 정의해서
		 * 관리할 예정이다.
		 * 
		 */

	}

}
