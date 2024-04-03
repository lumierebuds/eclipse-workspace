package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {

	public LeapView() {
		LeapController lc = new LeapController();
		// 기본 생성자로 이 안에 평년인지 윤년인지
		Calendar cal1 = Calendar.getInstance(); // new Calendar();

		boolean result = lc.isLeapYear(cal1.get(Calendar.YEAR));
		System.out.println("2024년은 " + (result ? "윤년" : "평년"));

		long count = lc.leapDate(cal1);
		System.out.println("총 날짜 수 :" + count);

	}
}
