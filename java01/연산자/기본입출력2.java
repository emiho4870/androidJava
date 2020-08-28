package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두 수를 입력받아서
		//ctrl + alt + 화살표아래 : 한 줄복사
		//alt + 화살표방향 : 이동
		String n1 = JOptionPane.showInputDialog("nn1");
		String n2 = JOptionPane.showInputDialog("nn2");
		// int로 변환한 후,
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		// 더한 다음
		int nn3 = nn1 + nn2; //정수형 : 계산위함
		System.out.println(nn3);
		
		
		String num = "1"; // 문자열로 변수 저장
		int num2 =  Integer.parseInt(num); // 정수형으로 변환 : Integer.parseInt(변수명)
		
		String num3 = "11";
		int num4 = Integer.parseInt(num3);
		
		System.out.println(num2 + num4);
		
		
	}

}
