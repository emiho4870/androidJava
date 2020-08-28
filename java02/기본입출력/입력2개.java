package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 데이터 : 입력
		String n1 = JOptionPane.showInputDialog("숫자1"); //콘솔창으로 입력받기
		String n2 = JOptionPane.showInputDialog("숫자2");
		//2. 처리
		int nn1 = Integer.parseInt(n1); // int 변수명 = Integer.parseInt(String 변수명);
		int nn2 = Integer.parseInt(n2);
		//3.결과 : 출력 //JOptionPane : System.out.println
		System.out.println(nn1 + nn2); 
		System.out.println(nn1 - nn2);
		System.out.println(nn1 * nn2);
		System.out.println(nn1 / nn2);
	}

}
