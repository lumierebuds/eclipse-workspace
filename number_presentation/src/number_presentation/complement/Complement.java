package number_presentation.complement;

public class Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1의 보수와 2의 보수로 1과 -1 표현하기
		// 2진수 형태로 int 변수에 저장

		int num1 = 0b00000000_00000000_00000000_00000001;
		int num2 = 0b11111111_11111111_11111111_11111110;
		int num3 = 0b11111111_11111111_11111111_11111111;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
