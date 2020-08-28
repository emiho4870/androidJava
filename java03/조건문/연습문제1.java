package 조건문;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("숫자1을 입력하세요"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("숫자2을 입력하세요"));
		
		//JOptionPane.showInputDialog("STRING")
		//Integer.parseInt(INT형변환할STRING형)
		//int 변수
		
		String sign = JOptionPane.showInputDialog("기호 + , - ,* , / 중 하나를 입력하세요");
		char oper = sign.charAt(0);
		
		if(oper == '+') {
			System.out.println(num1+num2);
		}else if (oper == '-') {
			System.out.println(num1-num2);
		}else if (oper == '*') {
			System.out.println(num1*num2);
		}else {
			System.out.println(num1/num2);
		}
		
	}

}
