package com.kh.hw.person.controller;

import java.util.Arrays;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] PersonCount() {
		int[] person = new int[2];
		for (Student std : s) {
			if (std != null) {
				person[0]++;
			}
		}
		for (Employee emp : e) {
			if (emp != null) {
				person[1]++;
			}
		}
		return person;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student student = new Student(name, age, height, weight, grade, major);
		int studentNum = PersonCount()[0];
		s[studentNum] = student;
	}

	public Student[] printStudent() {
		// 1번) 방법
		Student[] copy = new Student[3];
		int studentCount = PersonCount()[0];
		System.arraycopy(s, 0, copy, 0, studentCount);

		// 2번)
		Student[] copy2 = Arrays.copyOf(s, studentCount);

		return copy;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		Employee employee = new Employee(name, age, height, weight, salary, dept);
		int employeeNum = PersonCount()[1];
		e[employeeNum] = employee;
	}

	public Employee[] printEmployee() {

		return e;
	}
}
