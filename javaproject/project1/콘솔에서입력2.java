package project1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class 콘솔에서입력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);//Scanner Import
		
		String x = scan.next(); // scan.next 에서 콘솔창에 String 입력후 : String x로 변수저장 //scan
		System.out.println("이름" + x); // 콘솔창 x 입력시 실행됨
		// 현재키입력 : 150.5
		// 내년키는 170.5

		System.out.println("현재키입력 : ");
		double height = scan.nextDouble(); //scan : 변수명 : consol입력시 scan에 저장
		System.out.println("내년키는" + (height + 20));

		// 밖에 비가 오나 : true
		// scan.nextdouble
		// true이면, 우산을 가지고가자
		// false이면, 우산을 놓고가자

		System.out.println("밖에 비가오나 ");
		boolean rain = scan.nextBoolean();//scan
		if (rain) {
			System.out.println("우산을 가지고 가자");
		} else {// false
			System.out.println("우산을 놓고 가자");
		}
		System.out.println("당신의 목표는 ");
		scan.nextLine();
		String life = scan.nextLine(); //엔터치기까지의문장 
		System.out.println("목표는"+ life);
		
		/*
		 * 
		 */
		
	}

}
