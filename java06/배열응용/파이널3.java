package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 파이널3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5개의 정수 배열을 만들어서 1~5까지 입력하여 프린트
		
//		Random r = new Random(5);
//		int[] data = new int[100]; //100개 범위 에서 5개 랜덤 정수
		
		int[] data = new int[5];
		for (int i = 0; i < data.length; i++) {
			String num = JOptionPane.showInputDialog("정수5개입력");	
			int data2 = Integer.parseInt(num); //int 변환
		}
		System.out.println();
		
		
		// 66,77,88,99 중 최대값을 찾아보세요
	}

}
