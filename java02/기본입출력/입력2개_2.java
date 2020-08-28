package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 데이터 : 입력
				String n1 = JOptionPane.showInputDialog("시작값"); //콘솔창으로 입력받기
				String n2 = JOptionPane.showInputDialog("종료값");
				//2. 처리
				int nn1 = Integer.parseInt(n1); //String 타입으로 ram에 저장된 변수를 int 타입으로 변환처리
				int nn2 = Integer.parseInt(n2);
				//3.결과 : 출력
				for (int i = nn1 ; i < nn2; i++) {
					System.out.println(i);
				}
	}

}
