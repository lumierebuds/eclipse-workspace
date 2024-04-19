package com.kh.chap01_innerClass.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.OuterClass2;
import com.kh.chap01_innerClass.part02_static.OuterClass2.StaticInnerClass;
import com.kh.chap01_innerClass.part02_static.mode.vo.KakaoUserInfoResponse;
import com.kh.chap01_innerClass.part02_static.mode.vo.KakaoUserInfoResponse.KakaoAccount;
import com.kh.chap01_innerClass.part02_static.mode.vo.Member;
import com.kh.chap01_innerClass.part03_local.OuterClass3;
import com.kh.chap01_innerClass.part04_annonymous.OuterClass4;

public class Run {

	public static void main(String[] args) {
		/*
		 * 내부 클래스? 
		 * - 외부클래스 내부에 작성한 클래스를 내부 클래스라고 부름
		 * - 내부클래스는 보통 외부클래스와 밀접한 관련이 있으면서 다른 클래스들과는 서로 연관관계가 없는경우,
		 *   내부클래스로 선언하여 사용함.
		 * 
		 * 내부 클래스의 종류 
		 * 1) 인스턴스 내부 클래스 
		 * 2) 정적 내부 클래스 - 진짜 많이 사용
		 * 3) 지역 내부 클래스
		 * 4) 익명 내부 클래스 
		 * 
		 */

		OuterClass oc = new OuterClass();
		// oc.outerMethod();
		// oc.new Inner(); // Inner가 public이기 때문에 외부클래스에서 Inner생성자에 접근가능.
		// System.out.println(OuterClass.Inner.sNum);

		OuterClass2.StaticInnerClass.staticMethod();
		StaticInnerClass staticInnerClass = new OuterClass2.StaticInnerClass();
		// staticInnerClass.method();

		// 카카오 로그인 응답 구현
		KakaoUserInfoResponse response = new KakaoUserInfoResponse();
		response.setId(1234523522623452456L);
		response.setHas_signed_up(true);

		KakaoAccount kakaoaccount = new KakaoAccount();
		kakaoaccount.setEmail("wlgnsdl@gmail.com");
		kakaoaccount.setProfile_needs_agreement(true);

		response.setKakao_account(kakaoaccount);

		Member m = new Member.Builder("wlgns1234").setName("지훈").setAge(26).setPhone(1234).build();

		// System.out.println(new
		// Member.Builder("wlgns1234").setName("지훈").setAge(26).setPhone(1111).build());

		// System.out.println(m);

		// ------------------------------------------------------
		// 지역내부클래스
		OuterClass3 oc3 = new OuterClass3();
		Runnable r = oc3.getRunnable(1234);
		new Thread(r).start();

		// 익명내부클래스
		OuterClass4 oc4 = new OuterClass4();
		new Thread(oc4.runner, "필드 스레드").start();
		new Thread(oc4.getRunnable("리턴 스레드")).start();
		System.out.println("-------------------------");

		// ArrayList 생성 및 초기화 하는 방법들

		// 1) 일반적인 컬렉션 생성 및 초기화
		List<Integer> list = new ArrayList<>(); // 객체생성
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}

		// 2) 익명 클래스를 활용한 초기화

		List<Integer> list2 = new ArrayList<Integer>() {
			{ // 초기화 블럭을 사용해서 코드 실행. 메서드 오버라이딩 없이
				for (int i = 0; i <= 10; i++) {
					add(i);
				}
			}
		};

		// 3) Arrays.asList(T ...a) : ArrayList => 매개변수로 전달받은 값을 List으로 변환해주는 메서드
		// ...? 가변인자. 매개변수가 몇개나 들어올지 모를때 사용하며, 가변인자가 사용된 매개변수는 들어오는 값을 모두
		// "배열"로 받아서 처리함.
		List<Integer> list3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> list4 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 반환형 ArrayList Arrays 내부에서
		// 구현한 정적 내부 클래스. 기존 ArrayList와는 달리 값의 추가,삭제 메서드가 구현되어 있지 않음.

		// list4.add(1); // 에러 발생
		// list4.remove(0); // 에러발생
		list4.set(0, 999); // 값의 추가, 삭제는 불가능하나 수정은 가능함. 기존 ArrayList와 비교해서 불변성을 추가함.

		// 4) List.of(E ...elements) : List => 매개변수로 전달받은 값을 가지고 List 컬렉션을 반환
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };
		// list3.toArray(); // 컬렉션을 배열로 반환
		List<Integer> list5 = new ArrayList<>(List.of(arr));
		List<Integer> list6 = List.of(arr); // ImmutableCollections의 정적 내부 클래스 ListN()값을 반환하며,
											// 내부에 담긴 값이 추가되거나 수정되지않는 불변한 리스트를 반환해줌.
		// list6.add(0);
		// list6.remove(0);
		// list6.set(0, 11); // 값의 추가, 수정, 삭제가 불가능.
		// null 값 추가도 불가능.
		// 계층과 계층간의 데이터 전송을 할때 데이터의 불변성을 지키기 위해 사용

		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		System.out.println(list5);

		/*
		 * 내부클래스들의 종류별 특징 
		 * 1) 인스턴스 내부 클래스 
		 * 		구현위치 : 외부클래스의 필드와 동일한 위치에서 구현
		 * 		생성시기 : 외부클래스가 먼저 생성된 후 외부클래스 내부에 생성
		 * 		사용가능변수범위 : 외부클래스의 필드 및 static 변수 
		 * 
		 * 2) 정적 내부 클래스 
		 * 		구현위치 : 외부클래스의 필드와 동일한 위치에서 구현
		 * 		생성시기 : 외부클래스의 생성시기와 무관하게 생성된다.
		 * 		사용가능한변수 : 외부클래스의 static변수만 사용가능 
		 *
		 * 3) 지역 내부 클래스
		 * 		구현위치 : 메서드 내부에 구현
		 * 		생성시기 : 메서드 호출시 생성
		 * 		사용가능한변수 : 외부클래스의 필드 및 static변수 
		 * 
		 * 4) 익명 내부 클래스 
		 * 		구현위치 : 메서드 내부에 혹은 필드에 구현
		 * 		생성시기 : 메서드가 호출될때 혹은 필드에 대입될때 
		 * 		사용가능한변수 : 외부클래스의 필드 및 static변수 
		 * 
		 * 
		 */

	}
}
