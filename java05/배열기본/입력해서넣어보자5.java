package 배열기본;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 받아서, 저장공간에 넣어두었다가
		//나중에 꺼내서 연산이나 출력을 하고자 하는 경우

		Random r = new Random(); //임의의 랜덤값
		
		int[] data = new int[100];
		for (int i = 0; i < 100; i++) {
			data[i] = r.nextInt(100);
		}
		for(int x : data) {
		System.out.println(data[0] + data[99]);
	}
}
}
