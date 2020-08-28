package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 데이터 : 입력
		String n1 = JOptionPane.showInputDialog("반복될 숫자"); //콘솔창으로 입력받기
		String n2 = JOptionPane.showInputDialog("반복할 문자");
		//2. 처리
		int nn1 = Integer.parseInt(n1);  //String을 int로 : Integer.parseInt(); //String 형변환 // String숫자만
		//3.결과 : 출력
		for (int i = 0 ; i < nn1; i++) {
			System.out.println(n2);
		// 입력 : 처리 : 출력(조건문:System.out.println)
	}

}
}
