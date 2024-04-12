package com.kh.chap03_set.model.vo;

import java.util.HashMap;

public class MyHashSet {
	private HashMap<Student, Boolean> map;

	public MyHashSet() {
		map = new HashMap<>();
	}

	public void add(Student s) {
		map.put(s, true);
	}

	public void remove(Student s) {
		// 필드 map에서 Student를 제거하는 함수
		map.remove(s);
	}

	public boolean contains(Student s) {
		// 필드 map에 Student요소가 존재하는지 확인하는 함수
		return map.containsKey(s);
	}

	public int size() {
		return map.size();
	}

	public void printAll() {
		for (Student s : map.keySet()) {
			System.out.println(s);

		}
	}

	public static void main(String[] args) {
		MyHashSet mhs = new MyHashSet();
		mhs.add(new Student("홍길동", 25, 100));
		mhs.add(new Student("홍길동", 25, 100));
		mhs.add(new Student("김영희", 30, 85));
		mhs.add(new Student("김철수", 40, 55));

		System.out.println(mhs.map);
		mhs.remove(new Student("김영희", 30, 85)); // 주소값은 다르지만 서로 동일한 객체로 인식된다.
		System.out.println(mhs.map);

		System.out.println(mhs.contains(new Student("김영희", 30, 85)));
		System.out.println(mhs.contains(new Student("홍길동", 25, 100)));

		mhs.printAll();
	}
}
