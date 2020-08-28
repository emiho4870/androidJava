package 배열기본;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 받아서, 저장공간에 넣어두었다가
		//나중에 꺼내서 연산이나 출력을 하고자 하는 경우
		
		Random r = new Random(); // 자동완성 : import : import java.util.Random; //랜덤변수설정
		
		int[] data = new int[1000]; //int형 data배열 갯수 1000개 //data 변수갯수 설정
		
		for (int i = 0; i < 1000; i++) { //1000까지 범위에
			data[i] = r.nextInt(100); //Random설정된 변수 r.nextInt(범위);
		}//for문 (1)
		
		for(int x : data) {
			System.out.println(x);
		}//for문 (2)

	}
}
