package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		// 윤년이라면 true, 평년이면 false 반환
		// 윤년: 연도가 4의 배수이면서
		// 100의 배수가 아니거나 400의 배수가 되는해

		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public long leapDate(Calendar c) {
		// 1년 1월 1일부터 오늘까지의 총 날 수를 계산
		// 1년 부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을
		// 평년이면 365일을 더함
		long days = 0;

		Calendar now = Calendar.getInstance(); // 2024년 4월 3일
		Calendar first = new GregorianCalendar(1, 0, 1); // 1년 1월 1일

		long nowTimes = now.getTimeInMillis(); // 1970년 1월 1일 ~ 현재까지 밀리초
		long firstTimes = first.getTimeInMillis(); // 1년 1월 1일 ~ 1970년 1월 1일까지 밀리초 (음수값이 나옴. 절대값으로 변환)

		long dayToday = nowTimes / 1000 / 60 / 60 / 24; // 1970년 1월 1일 ~ 현재까지 일수
		long dayThen = Math.abs(firstTimes) / 1000 / 60 / 60 / 24;

		// days = dayToday + dayThen;

		// [다른 방법] - 년을 기준으로 해서 부정확함.

		int nowYear = now.get(Calendar.YEAR);
		for (int i = 1; i <= nowYear; i++) {
			if (isLeapYear(i)) {
				days += 366; // 윤년이면
			} else {
				days += 365; // 평년이면
			}

		}

		return days;

	}

}
