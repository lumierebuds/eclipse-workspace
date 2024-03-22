package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 변수에 기록한다.
public class B_KeyboardInput {
	
	public void inputTest1() {
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 인적사항을 입력받기.
		// 이름, 나이, 키 
		
		
		// 사용자가 입력한 값을 문자열로 받아오는 메서드
		// 1) nextLine(): 사용자가 입력한 값 중 개행이 있을 경우 공백에 무관하게 개행 이전까지 출력해준다.
		// 2) next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지 출력.
		
		System.out.println("당신의 이름은 무엇인가요?");
		String name = sc.nextLine(); 
		
		System.out.println("당신의 나이는 몇 살 입니까?");
		int age = sc.nextInt(); // 사용자가 입력한 값을 int 자료형으로 변환 
		
		System.out.println("당신의 키는 몇 cm입니까?");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 double 자료형으로 변환
		
		// nextLine은 개행을 감지한다. '\n'
		// 이전에 nextInt, nextDouble 을 통해 개행문자가 남아있어서 입력을 받지 않는다. 
		
		// 이를 해결하기 위해서는 sc.nextLine() 메서드를 통해 존재했던 개행문자를 없애주도록 한다. 
		sc.nextLine();
		
		System.out.println("당신이 사는 곳은?");
		String address = sc.nextLine();
		
		System.out.println(address+"에 사는 키: "+height+"cm, " 
				+age+"세 " +name+"님 안녕하세요");
		
		
		
	}

}
