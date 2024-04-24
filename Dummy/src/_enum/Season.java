package _enum;

// 계절 열거 타입 
public enum Season {
	// Enum 매핑, 상수를 가져오면 상수의 고유의 값(value)을 문자열을 출력하게 만들고 싶을때
	// enum을 매핑해서 구성해줄 수 있다.
	Spring("봄"), summer("여름"), Autumn("가을"), winter("겨울");
	
	// enum 상수 하나당 자신의 인스턴스를 하나씩 만들어 public static field 필드로 공개하기 때문

	// 문자열을 저장할 필드 
	private String season;
	
	// 생성자 (싱글톤) 
	private Season(String season) {

		this.season = season;
	}
	
	// Getter - enum 상수에 해당하는 값을 반환받는다.
	public String getSeason() {
		return season;
	}
	
}


