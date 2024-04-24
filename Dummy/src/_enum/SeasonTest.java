package _enum;

public class SeasonTest {

	public static void main(String[] args) {
		System.out.println(Season.Autumn);

		// name() 메서드 : 열거 객체가 가지고 있는 문자열 리턴
		// 반환되는 문자열은 열거 타입을 정의할 때 사용한 '상수 이름' 과 동일
		Season autumn = Season.Autumn;
		System.out.println(autumn);
		System.out.println(autumn.getSeason());
		System.out.println(typesafe_enum.Season.AUTUMN.getSeason());
		

	}
}
