package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void square() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double width= sc.nextDouble();
		
		System.out.print("세로: ");
		double height = sc.nextDouble();
		
		double 면적 = width * height;
		double 둘레 = (width + height) * 2;
		
		System.out.println("면적 : "+면적);
		System.out.println("둘레 : "+둘레);
	}
	

}
