package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scan import

		int[] seat = new int[11]; // [배열] //좌석마다 예매상황을 저장할 공간 // 배열공간에 데이터입력일 안하면 0으로 초기화 상태임 : seat[i] : 주소만가짐
		
		int count = 0; // 예약수 카운터
		int ticket = 10000; //final : 티켓한장당 금액
		
		while (true) {
			System.out.println("===========================================");
			
			for (int i = 1; i < seat.length; i++) { //좌석번호설정 : 표시
				System.out.print(i+ "좌석" + " "); // ln : line : <br> 
			}
			
			System.out.println(); //줄바꿈
			System.out.println("===========================================");
			
			for (int i = 1; i < seat.length; i++) { //int = 1 
				System.out.print(seat[i] + " " + " " + " "); // ln : line : <br>
			}

			System.out.println();
			System.out.println("**원하는 좌석 입력 (종료시 : -1)"); // 1 : 2
			
			
			int choice = scan.nextInt(); //선택한 번호 consol창 입력 : choice
			
			if (choice == -1) { //예약차면 종료설정
				System.out.println("예약시스템을 종료합니다");
				System.out.println("예약좌석 갯수는" + count);
				System.out.println("예약금액은 " + count*ticket + "원 입니다");
				System.out.println("프로그램 종료");
				break;
			}
			
			// 선택한 변호의 좌석을 에약처리 : 예약은 1번 선택
			seat[choice] = 1; //1번으로 예약처리설정
			
			if (seat[choice] ==1) {
				seat[choice] = 1;
				count++;
				System.out.println(choice + "번 예약완료");
			}else {
				System.out.println("이미 예약된 좌석입니다");
				System.out.println("다른 좌석번호를 입력해주세요");
			}
			
			
			//1)이미 예약된 자리는 예약불가 다른 자리 선택하라고 알려주세요.
			//2)종료시 몇자석이 예매가 되었는지 프린트 한 장당 10000원, 결제금액 프린트
			//3)좌석번호가 1번부터 시작되게 해주세요.
			
			//if(seat[choice]==1)
		}//while
		
		
	}
}










