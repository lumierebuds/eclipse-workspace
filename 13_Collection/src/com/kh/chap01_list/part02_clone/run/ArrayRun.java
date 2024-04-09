package com.kh.chap01_list.part02_clone.run;

import java.util.Arrays;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

// ArrayList의 기능을 구현해보는 클론 클래스 
public class ArrayRun {

	private static final int DEFAULT_CAPACITY = 10; // 기본생성자 호출시 사용되는 객체의 크기값.

	Music[] mArr; // null

	private int size; // 0

	public ArrayRun() {
		mArr = new Music[DEFAULT_CAPACITY]; // 기본생성자 호출시 길이 10짜리 Music 객체배열 생성.
	}

	public ArrayRun(int initialCapacity) {
		mArr = new Music[initialCapacity];
	}

	public static void main(String[] args) {
		// 기본생성자 호출(길이 10짜리 배열)
		ArrayRun ar = new ArrayRun();

		// 매개변수 있는 생성자(길이 5짜리 배열)
		ArrayRun ar2 = new ArrayRun(5);

		ar2.add(new Music("스물다섯스물하나", "자우0"));
		ar2.add(new Music("스물다섯스물하나", "자우1"));
		ar2.add(new Music("스물다섯스물하나", "자우2"));
		ar2.add(new Music("스물다섯스물하나", "자우3")); // 3번 인덱스
		ar2.add(new Music("스물다섯스물하나", "자우4"));
		ar2.add(new Music("스물다섯스물하나", "자우5"));
		ar2.add(new Music("스물다섯스물하나", "자우6"));

		ar2.add(3, new Music("스토커", "10cm"));
		ar2.add(0, new Music("1월부터6월까지", "윤종신"));

		System.out.println(ar);
		System.out.println(ar2);
		System.out.println(ar2.size());

		ArrayRun ar3 = new ArrayRun();
		ar3.add(new Music("스물다섯스물하나", "자우림"));
		System.out.println(ar3.size());
		System.out.println(ar3.isEmpty());
	}

	// 배열의 마지막위치에 매개변수로 전달받은 Music m을 추가하는 함수
	public void add(Music m) {
		// 1) 배열의 저장공간이 꽉찬 경우 ?
		// 배열을 늘려줘야함.(1칸)
		if (mArr.length == size) {
			mArr = Arrays.copyOf(mArr, mArr.length + 1);
			// 복사할 배열, 총 길이로 깊은 복사를 한 배열을
			// 추가시킨다.
		}
		mArr[size++] = m; // 값 저장 후 size 증가
	}

	// 배열의 index위치에 전달받은 Music m을 추가하는 함수
	public void add(int index, Music m) { // 끼워넣기

		// 1) 배열의 범위(size)를 벗어난 index 제시시?
		// 출력문 : 저장가능한 인덱스 위치가 아닙니다.
		if (index > size || index < 0) { // 초기화되지 않은 위치에 값을 추가하거나, 음수를 제시하는 경우
			System.out.println("저장가능한 인덱스 위치가 아닙니다. ");
			return;
		}

		// 2) 배열의 저장공간이 꽉찬경우 배열의 크기 증가.
		if (size == mArr.length) {
			mArr = Arrays.copyOf(mArr, size + 1);
		}

		// 3) index위치에 값을 저장시 이미 값이 들어가 있다면 한칸씩 뒤로 밀어줘야함.
		// [1,2,3,4,5] => '3번' 인덱스에 10이라는 값을 넣고 싶다?
		// [1,2,3,10,4,5]

		// [두가지 방법]
		// 3_1) 반복문 활용하여 뒤로밀어주기
		/*
		for (int i = size; i > index; i--) {
			mArr[i] = mArr[i - 1];
		
		}
		*/
		// [1,2,3,4,4,5]

		// 3_2) 배열복사를 통한 뒤로 밀어주기 -> 성능 상 해당 방식이 더 좋음 ✔✔
		// System.arraycopy(원본배열, 원본에서 복사를 시작할 인덱스, 복사본배열, 본사본배열에 붙여넣기를 시작할 첫번째 인덱스, 복사할
		// 갯수);

		// [1,2,3,4,5,0]
		System.arraycopy(mArr, index, mArr, index + 1, size - index);
		// [1,2,3,4,4,5]

		mArr[index] = m;
		size++;

		// [1,2,3,10,4,5]
	}

	// 배열 내부에 "초기화된" 데이터만 문자열로 반환하는 함수
	// []
	// ["1234", "1234"]
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		// 반복문 돌리면서 초기화된 데이터의 toString() 호출
		for (int i = 0; i < size; i++) {
			sb.append(mArr[i]);
			if (i != size - 1) {
				sb.append(", "); // 다음값이 있다면 , 없다면 ' '
			}
		}

		sb.append("]");

		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {

		// 배열내부에 초기화된 데이터가 1개라도 존재하는가?
		/*
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] != null) {
				return false;
			}
		}
		return true;
		*/

		// size 값이 0이면 true, 아니면 false
		return size == 0;
	}

	public Music get(int index) {
		// 잘못된 인덱스범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스 범위입니다.
		// null값 반환.
		if (index > size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
			return null;
		}
		return mArr[index];
	}

	// set
	public Music set(int index, Music music) {
		// 잘못된 인덱스 범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스범위입니다.

		if (index > size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
			return null;
		}

		Music old = mArr[index]; // 이전에 담겨 있던값.

		mArr[index] = music;

		return old;

	}

	// remove
	public Music remove(int index) {
		// 잘못된 인덱스 범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스범위입니다.

		if (index > size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
			// throw 예외객체; 로 예외 강제로 발생시켰음.
			return null;
		}

		Music old = mArr[index];
		// 항상 빈공간을 채우기위해, index 뒤쪽의 값을 땡겨오는 코드가 있음.
		// 반복문을 활용한 땡기기
		// [m1, m2, m3, m4, m5]; 에서 2번 인덱스의 값을 삭제
		// [m1, m2, m4, m5, m5];
		for (int i = index; i < size - 1; i++) {
			mArr[i] = mArr[i + 1];
		}

		mArr[size - 1] = null;
		// mArr[index] = null;

		size--;
		return old;

	}

}
