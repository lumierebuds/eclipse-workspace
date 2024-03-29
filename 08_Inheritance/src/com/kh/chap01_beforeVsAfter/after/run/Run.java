package com.kh.chap01_beforeVsAfter.after.run;

import com.kh.chap01_beforeVsAfter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsAfter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsAfter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop d = new Desktop("삼성", "d-01", "삼송데스크탑", 2000000, true);
		SmartPhone p = new SmartPhone("애플", "s-01", "아이폰", 1300000, "LGU+");
		Tv t = new Tv("엘지", "t-01", "울트라씬티비", 3500000, 30);

		System.out.println(d);
		System.out.println(p);
		System.out.println(t);

		/* 
		   상속의 장점 
		
			- 보다 적은 양의 코드로 새로운 클래스들을 작성가능
			- 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할때
			용이하다 ⇒ 프로그램 생산성과 유지보수에 크게 기여가된다.
			- 정의해둔 부모클래스를 통해 좀더 쉽게 “확장”이 가능하다.
			ex) 데탑, 폰, tv외에도 냉장고나 에어프라이어 객체를 쉽게 만들 수 있음
		 
		 */
	}

}
