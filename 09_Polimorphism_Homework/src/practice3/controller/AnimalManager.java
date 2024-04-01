package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] arr = new Animal[5];
		arr[0] = new Dog("바둑이", "달마시안", 10);
		arr[1] = new Cat("나비", "먼치킨", "집", "흰색");
		arr[2] = new Dog("누렁이", "진돗개", 20);
		arr[3] = new Cat("깜이", "검은고양이", "길", "검은색");
		arr[4] = new Dog("메시", "웰시코기", 25);

		for (Animal ani : arr) {
			ani.speak();
		}
	}

}
