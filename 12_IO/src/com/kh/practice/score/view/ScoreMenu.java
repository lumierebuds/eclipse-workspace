package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);

	private ScoreController scr = new ScoreController();

	public int parse(String str) {
		return Integer.parseInt(str);
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menu = parse(sc.nextLine());

			switch (menu) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		}
	}

	public void saveScore() {

		int num = 0; // 학생 숫자를 나타낼 변수
		// N번 째 학생 정보 기록
		while (true) {

			System.out.println(++num + "번째 학생 정보 기록");
			System.out.print("이름 :");
			String name = sc.nextLine();

			System.out.print("국어 점수 :");
			int kor = parse(sc.nextLine());

			System.out.print("영어 점수 :");
			int eng = parse(sc.nextLine());

			System.out.print("수학 점수 :");
			int math = parse(sc.nextLine());

			// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
			int sum = kor + eng + math;
			double avg = sum / 3;

			scr.saveScore(name, kor, eng, math, sum, avg);

			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char check = sc.nextLine().toLowerCase().charAt(0);
			if (check == 'n') {
				break;
			}
		}

		// 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌

		// 그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 :
		// N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
		// N이나 n을 입력하면 사용자에게 받는 반복문을 나감

	}

	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		try {
			DataInputStream readScore = scr.readScore();
			while (true) {
				String name = readScore.readUTF();
				int kor = readScore.readInt();
				int eng = readScore.readInt();
				int math = readScore.readInt();
				int sum = readScore.readInt();
				double avg = readScore.readDouble();

				count++; // 몇명의 학생인지?
				sumAll += sum;
				avgAll += avg;
				System.out.print(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("어맛!");
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		avgAll = avgAll / count;
		System.out.println("읽은 횟수 전체 합계 전체 평균");
		System.out.println(count + "\t" + sumAll + "\t" + avgAll);

		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		// 안에 들어가있는 데이터를 가지고 와서 출력
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
	}

}
