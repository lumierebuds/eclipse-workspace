package com.kh.chap01_beforeVsAfter.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne;

	public Desktop() {

	}

	// 부모 생성자를 호출하여 필드값 초기화

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand, pCode, pName, price = Product에 존재하는 필드
		// 1. 필드의 접근제한자를 protected로 변경후 필드에 직접대입
		super.brand = brand;

		// 2. public 접근제한자인 setter 메서드 활용.
		setBrand(brand);
		setpCode(pCode);
		setpName(pName);
		setPrice(price);

		// 상위 요소에 접근을 해서 초기화 해줘야한다.
		// 3. 부모 생성자를 통하여 객체 생성
		// 즉, super으로 부모에 접근 가능
		// super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String toString() {
		return super.toString() + ", allInOne : " + allInOne;
	}

}
