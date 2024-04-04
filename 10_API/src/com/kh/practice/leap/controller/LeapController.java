package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		// 윤년이라면 true, 평년이면 false 반환
		// 윤년: 연도가 4의 배수이면서
		// 100의 배수가 아니거나 400의 배수가 되는해

		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public long leapDate(Calendar c) {

		/*
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
		*/

		// 1년 1월 1일부터 오늘까지의 총
		// 날 수를 계산
		// 1년부터 현재 연도까지 각 연도가
		// 윤년이면 총 날수에 366일을, 평
		// 년이면 365일을 더함
		// 해당 현재 연도가 윤년이면 2월을
		// 29일로 평년이면 28일로 더함
		// 월의 날짜 수를 더함
		// (31일: 1, 3, 5, 7, 8, 10, 12월/
		// 30일: 4, 6, 9, 11월)

		// [강사님 코드 ]

		int currentYear = c.get(Calendar.YEAR);
		// 1년부터 2023년까지
		long totalDate = 0;
		for (int i = 1; i < currentYear; i++) { // 1~2023년까지의 일수
			totalDate += isLeapYear(i) ? 366 : 365;
		}

		int currentMonth = c.get(Calendar.MONTH); // 3이 나온다(4월이니까 -1 된 값이 된다.) // 0(1월) ~ 2월(3월) 까지의 일수를 구한다.
		for (int i = 0; i < currentMonth; i++) {
			switch (i) {
			case 0, 2, 4, 6, 7, 9, 11:
				totalDate += 31;
			case 3, 5, 8:
				totalDate += 30;
			case 1:
				totalDate += isLeapYear(currentYear) ? 29 : 30;
			}
		}

		// 해당 현재 연도가 윤년이면 2월을
		// 29일로 평년이면 28일로 더함
		// 월의 날짜 수를 더함
		// (31일: 1, 3, 5, 7, 8, 10, 12월/
		// 30일: 4, 6, 9, 11월)

		return totalDate;
	}

}
