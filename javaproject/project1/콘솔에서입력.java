package project1;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 콘솔에서 입력 : Scanner
		// 모든 입력의 데이터 타입은 String
		Scanner scan = new Scanner(System.in);
		//System.out.print("이름을 입력>> ");
		String x = scan.next(); // scan.next : 입력 : String x  
		System.out.println( "이름" + x );
		System.out.println("나이를 입력>> ");
		int y = scan.nextInt();//int<-String입력 : int로 변환
		System.out.println("내년 나이는" + (y + 1) + "년");
		
		//현재키입력 : 150.5
		//내년키는 170.5
		
		//밖에 비가 오나 : true
		//scan.nextdouble
		//true이면, 우산을 가지고가자
		//false이면, 우산을 놓고가자
	}

}
