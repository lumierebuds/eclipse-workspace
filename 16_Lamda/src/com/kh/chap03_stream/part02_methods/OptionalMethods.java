package com.kh.chap03_stream.part02_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethods {

	/*
	 * Optional 
	 * - 존재 할 수도 있고, 안할 수도 있는 객체를 감싸고 있는 객체 
	 * - 옵셔널 변수는 변수명에 maybeMember, optUser와 같이 Optional 타입임을 암묵적으로 제시해야한다. 
	 * 
	 * 
	 * Optional 객체 생성방법.
	 * 1. Optional.empty() : 비어있는 Optional 객체 
	 * 2. Optional.of(obj) : 결코 null 아닌 객체를 담은 Optional 객체 
	 * 3. Optional.ofNullable(obj) : null일수도 있는 객체를 담은 Optional 객체 
	 *  
	 * Optional 객체 내부 메서드들 
	 * - get() : 값을 반환 (값이 없다면 NoSuchElementException 발생) 
	 * - getAs자료형 :자료형의 값을 반환 (값이 없다면 NoSuchElementException 발생) 
	 * - orElas(T) : get()으로 꺼낼 값이 존재하지 않을경우 T값 반환
	 * - orElseGet(Supplier) : get()으로 꺼낼값이 존재하지 않을때, 람다식으로 구현한 값을 반환  
	 * - orElseThrow(Supplier) : get()으로 꺼낼값이 존재하지 않을때 람다식으로 구현한 에러객체를 반환. 
	 * - isPresent() : boolean 값이 존재하는지 확인후 존재하면 true, 없으면 false 
	 * - ifPresent(Consumer) : 값이 존재한다면 스트림요소값을 통해 실행할 코드 구현. 
	 */
	
	public static void main(String[] args) {
		OptionalMethods om = new OptionalMethods();
		// om.test1();
		// om.test2();

		// 1) isPresent()
		Optional opt = Optional.empty();
		boolean isPresent = opt.isPresent();
		if (isPresent) {
			System.out.println(isPresent);
		}

		// 2) ifPresent(Consumer)
		Optional<Integer> opt2 = Optional.of(1);
		opt2.ifPresent(value -> System.out.println("value값이 존재합니다." + value));

		// 3) orElseGet(Supplier)
		String str = (String) opt.orElseGet(() -> "값이 없네요");
		System.out.println(str);
	}

	public void test2() {
		Member member = new Member();
		member.email = "lumierebuds@naver.com";

		Order order = new Order();
		order.member = member;

		Order order2 = null; // order2 : null 값이 들어갔다.

		Order order3 = new Order(); // order3 : Order 객체를 만들었지만 이메일이 null이다.

		System.out.println(getEmailFromOrder(order)); // order 객체로 부터 member의 이메일을 가져온다.
		System.out.println(getEmailFromOrder(order2));
		System.out.println(getEmailFromOrder(order3));

	}

	public String getEmailFromOrder(Order order) {
		//		if (order != null) {
		//			Member member = order.getMember();
		//			if (member != null) {
		//				String email = member.email;
		//				if (email != null) {
		//					return email;
		//				}
		//			}
		//
		//		}
		//		return "이메일이 존재하지 않습니다.";
		
		/* Optional 을 이용해서 코드를 간결하게 만들기 */
		//		Optional<Order> optOrder = Optional.ofNullable(order);
		//		return optOrder
		//				.map(ord -> ord.member)
		//				.map(member -> member.email)
		//				.orElse("이메일이 존재하지 않습니다.");
		
		/* 위의 코드를 더욱 간단하게 만들기 */
		return Optional.ofNullable(order)
			.map(Order::getMember)
			.map(Member::getEmail)
			.orElse("이메일이 존재하지 않습니다.");
	}

	class Order {
		Member member;
		int count;

		public Order() {

		}

		public Order(Member member, int count) {
			this.member = member;
			this.count = count;
		}

		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "Order [member=" + member + ", count=" + count + "]";
		}

	}

	class Member {
		String id;
		String email;

		public Member() {

		}

		public Member(String id, String email) {
			this.id = id;
			this.email = email;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Member [id=" + id + ", email=" + email + "]";
		}

	}
	

	public void test1() {
		List<String> list = Arrays.asList("홍길동", "임꺽정", null, "");
		
		list.stream()
			.forEach(s -> System.out.println(s + " : "+getStringLength(s)));
	}
	
	public int getStringLength(String str) {
		Optional<String> maybeStr = Optional.ofNullable(str); // null이 반환될 수 있다. 
		return maybeStr
				.map(s -> s.length()) // map() Optional 에서도 동일한 기능을 한다.
				// .orElse(0); // get()으로 꺼낼값이 없을때 0값 반환
				.orElseThrow(() -> new RuntimeException("null 값이 있습니다."));
		
	}
}
