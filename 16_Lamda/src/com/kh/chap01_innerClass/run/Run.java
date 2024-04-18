package com.kh.chap01_innerClass.run;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.OuterClass2;
import com.kh.chap01_innerClass.part02_static.mode.vo.KakaoUserInfoResponse;
import com.kh.chap01_innerClass.part02_static.mode.vo.KakaoUserInfoResponse.KakaoAccount;
import com.kh.chap01_innerClass.part02_static.mode.vo.Member;

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
		// oc.new Inner(); // Inner가 public이기 때문에 외부클래스에서 Inner생성자에 접근가능.
		// System.out.println(OuterClass.Inner.sNum);

		OuterClass2.StaticInnerClass.staticMethod();

		// 카카오 로그인 응답 구현
		KakaoUserInfoResponse response = new KakaoUserInfoResponse();
		response.setId(1234523522623452456L);
		response.setHas_signed_up(true);

		KakaoAccount kakaoaccount = new KakaoAccount();
		kakaoaccount.setEmail("wlgnsdl@gmail.com");
		kakaoaccount.setProfile_needs_agreement(true);

		response.setKakao_account(kakaoaccount);

		Member m = new Member
				.Builder("wlgns1234")
				.setName("지훈")
				.setAge(26)
				.setPhone(1234)
				.build();

		System.out.println(new Member
				.Builder("wlgns1234")
				.setName("지훈")
				.setAge(26)
				.setPhone(1111)
				.build());
		
		System.out.println(m);
		
	}
}
