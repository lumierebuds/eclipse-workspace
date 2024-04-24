package typesafe_enum;

/* 타입 안전 열거 패턴(typesafe enum pattern) */
public class Season {
	public static final Season SPRING = new Season("봄"); // 자기자신의 인스턴스를 만들어 상수화
	public static final Season SUMMER = new Season("여름");
	public static final Season AUTUMN = new Season("가을");
	public static final Season WINTER = new Season("겨울");

	private String season;

	private Season(String season) {
		this.season = season;
	}

	public String getSeason() {
		return season;
	}
}
// 실제로 enum이 나오기전 jdk 1.5 밑 버전에서는 이렇게 사용되었다. 
