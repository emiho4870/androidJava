package 영화예매배열;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class 가위바위보게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scan import
		

		int[] game= new int[6]; //게임횟수5회
		int[] list1 = new int[4]; //가위바위보
		int[] list2 = new int[4]; //가위바위보
		
		int count = 0; // 가위바위보 횟수
		
		
		System.out.println("가위바위보 게임 가위)1 바위)2 보)3");	
		System.out.println("==========================");	
		
		
			
		
		
		
		for (int i = 0; i < game.length; i++) {
		/*
		 * 컴퓨터가 선택
		 */
		int choice1 = scan.nextInt(); //선택한 번호 consol창 입력 : choice
		
		System.out.println();
		System.out.println("컴퓨터가 낸 수>>");	
		
		
		for (int j = 1 ; j < list1.length; j++) {
		
		if (choice1 == 1) {
			System.out.println("가위");
		}else if (choice1 == 1) {
			System.out.println("보");
		}else {
			System.out.println("바위");
		}
		System.out.println();
		
		}
		
		/*
		 * 사람이 선택
		 */
		int choice2 = scan.nextInt(); //선택한 번호 consol창 입력 : choice
		
		System.out.println();
		System.out.println("사람이 낸 수");	
		for (int j = 1 ; i < list2.length; i++) {
		
		
		if (choice2 == 1) {
			System.out.println("가위");
		}else if (choice2 == 1) {
			System.out.println("보");
		}else {
			System.out.println("바위");
		}
		System.out.println();
		}
		
		}
		
		
		/*	
		System.out.println("게임회차");	
		for (int i = 1; i < game.length; i++) {
			System.out.print(i + "회" + "컴퓨터는" + choice1 + "사람은" + choice2 + "냈습니다");
			System.out.println();
		}
		
		
		if (choice1 == choice2) {
		System.out.println("비겼습니다");	
		}else if((choice1 == 1 && choice2 == 3)) {
			System.out.println("사람이 이겼습니다");
		}
		*/
		
	
		
		
		
		
		}	
}//while
		
		
	


		











