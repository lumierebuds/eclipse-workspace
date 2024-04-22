package encapsulation;

import java.io.Serializable;
/*
 * 직렬화(serialization)
 * - 객체의 상태를 그대로 저장하거나, 복원하는 방식을 직렬화, 역직렬화라고 부름.
 * 	 객체의 데이터를 Byte[] 로 변환하여 입/출력매체에 저장 -> 직렬화
 * 	 저장된 Byte[] 데이터를 다시 현재 프로그램으로 입력 -> 역직렬화 
 * - 직렬화를 위해서는 Serializable 인터페이스를 구현해야함 
 * 
 * - Serializable는 구현코드는 없고 직렬화를 "허용"하겠다는 의미로 사용.
 * 
 */

public class Food implements Serializable {

	private String name;
	private int kcal;

	public Food() {

	}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getKcal() {
		return kcal;
	}

	public String toString() {
		return "Food [name= " + name + ", kcal= " + kcal + "]";
	}
}
