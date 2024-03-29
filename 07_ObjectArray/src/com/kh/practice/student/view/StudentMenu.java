package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {

		System.out.println("========== 학생 정보 출력 ==========");

		Student[] sArr = ssm.printStudent();
		for (Student std : sArr) {
			System.out.printf("이름 : %s / 과목 : %s / 점수 : %d\n", std.getName(), std.getSubject(), std.getScore());
		}

		System.out.println();
		System.out.println("========== 학생 성적 출력 ==========");

		double[] avg = ssm.avgScore();
		System.out.printf("학생 점수 합계 : %d\n", (int) avg[0]);
		System.out.printf("학생 점수 평균 : %.1f\n", avg[1]);

		System.out.println();
		System.out.println("========== 성적 결과 출력 ==========");

		for (Student std : sArr) {
			if (std.getScore() >= StudentController.CUT_LINE) {
				System.out.println(std.getName() + " 학생은 통과입니다.");
			} else {
				System.out.println(std.getName() + " 학생은 재시험 대상입니다.");
			}
		}
	}
}
