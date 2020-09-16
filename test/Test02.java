package test;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {

		/*
		 * 1.입력 , 2.출력
		 */
	
		int sum = 0;//누적값 초기화
		
		for (int i = 1; i < 6; i++) {
			System.out.println();
			String n1 = JOptionPane.showInputDialog("입금자 이름 입력하세요"); //입금자 이름 입력
			System.out.println("입금자  : " + n1); //입금자 이름 출력
			for (int j = 0; j < 5; j++) { // 예금액 입력 5회
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("예금액을 입력하세요")); // 예금액String입력 int타입 변환
				System.out.print(n2 + " 원" + ","); // 예금액 출력
				sum += n2; //예금액 누적계산
			}
			
		
			
			/*
			 * 4.합계 , 5.평균
			 */
			System.out.println("총 입금 합계 는 " + sum);//누적계산된 총합
			System.out.println(n1 + "의 입금액 평균은" + sum/5);
		}
		
		System.out.println("++++++++++++++++++++++++++");

	}
}
		
		
	

	

	
