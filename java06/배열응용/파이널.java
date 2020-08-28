package 배열응용;

import javax.swing.JOptionPane;

public class 파이널 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 11,22,33,44를 배열에 넣어서
		// 이 중 33은 몇 번째 위치에 있는지 프린트!

		int[] num_2 = { 11, 22, 33, 44 };
		int target = 33; // 3번째위치설정
		int targetDot = 3;

		for (int i = 0; i < num_2.length; i++) { //
			if(target == num_2[i]) {
				System.out.println(num_2[i]+ "는" + targetDot + "번째 위치에 있습니다");
			}

		}

		// 5개의 정수 배열을 만들어서 1~5까지 입력하여 프린트

		// 66,77,88,99 중 최대값을 찾아보세요
	}

}
