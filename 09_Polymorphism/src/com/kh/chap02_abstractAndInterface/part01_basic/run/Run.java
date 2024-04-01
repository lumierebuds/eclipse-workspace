package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class Run {
	public static void main(String[] args) {

		// Sports s = new Sports();
		// 추상 클래스로 객체 생성불가. 미완성된 클래스이기 때문.

		Sports s; // 객체 생성 x. 참조 변수로서는 사용 가능.
		s = new Football();

		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();

		for (Sports sp : arr) {
			// sp.rule(); // 각각 농구, 축구의 경기규칙이 출력된다.

			sp.start();
		}

	}
}
