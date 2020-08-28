package 영화예매배열;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class 가위바위보게임2 { // 가위 0 바위 1 보 2 // 기준
						// 가위 0 바위 1 보 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in); //콘솔입력 : scan //*
		Random r = new Random(); // 랜덤값 : r //*
		
		int gameCount = 0; // 전체횟수초기값
		int meWin0 = 0; //사람이 가위로 이긴 횟수 초기값
		int meWin1 = 0; //사람이 바위로 이긴 횟수 초기값
		int meWin2 = 0; //사람이 보로 이긴 횟수 초기값
		int same = 0; //비긴횟수 초기값
		int gameWin2 = 0; //컴퓨터가 이긴 횟수 초기값
		int lose = 0; //사람이 진 횟수 초기값
		
		
		
		while (true) { //while : break조건걸어서 빠져나감
			
			//System.out.println("사람이" + game1 + "을 내고 컴퓨터가 " + game2 + "냈습니다" ); // 하단코드읽고결과
			
			System.out.println("가위 0) 바위 1) 보2) 중 하나를 입력하세요 , 종료는:3  ");
			
			int game1 = scan.nextInt();
			int game2 = r.nextInt(3); //0~2까지 
			//int 를 String으로 변환
			
			System.out.println("사람이" + game1 + "을 내고 컴퓨터가 " + game2 + "냈습니다" );
			
			/*
			lose++;
			gameCount++;
			meWin0++;
			meWin1++;
			meWin2++;
			gameWin2++;
 			*/
 
			if (game1 == 0) { // 사람이 가위 0 일때
				if (game2 == 0) {
					System.out.println("둘다 비겼습니다");
					same++;
				} else if (game2 == 1) {
					System.out.println("사람이 졌습니나");
					lose++;
				} else {
					System.out.println("사람이 이겼습니다");
					meWin0++;
				}
			}
			else if (game1 == 1) {
				if (game2 == 0) {
					System.out.println("사람이 이겼습니다");
					meWin1++;
				}else if (game2 ==1 ) {
					System.out.println("둘다 비겼습니다");
					same++;
				}else {
					System.out.println("사람이 졌습니다");
					lose++;
				}
			}
			else{
				if (game2 == 0) {
					System.out.println("사람이 졌습니다");
					lose++;
				}else if (game2==1) {
					System.out.println("사람이 이겼습니다");
					meWin2++;
				}else {
					System.out.println("비겼습니다");
					same++;
				}
			}
			
			
			
			if (game1 == 3) {
				System.out.println("게임이 종료됩니다");
				break;
			}
			
			
		} // while문
		System.out.println("==================================================");
		System.out.println("게임의 총횟수" + gameCount +"회");
		System.out.println("컴퓨터가이긴 횟수" + lose +"회");
		System.out.println("내가 가위로 이긴 횟수" + meWin0 +"회");
		System.out.println("내가 바위로 이긴 횟수" + meWin1 +"회");
		System.out.println("내가 보로 이긴 횟수" + meWin2 +"회");
		System.out.println("게임이 비긴 횟수" + same +"회");
		
		System.out.println("==================================================");

	}

}
