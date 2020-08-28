package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scan import

		int[] seat = new int[10]; // [배열] //좌석마다 예매상황을 저장할 공간
		while (true) {
			System.out.println("-----------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.println(i + "  ");
			}
			System.out.println("-----------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.println(seat[i] + "  ");
			}

			System.out.println();
			System.out.println("원하는 좌석 입력(종료-1)"); // 1 : 2
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			// 선택한 변호의 좌석을 에약처리
			seat[choice] = 1;
		}
	}

}
