package 그래픽Swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		이름/태어난 년도를 입력을 바다엇
//		다음과 같이 출력되도록 프로그래밍
//		=> 홍길동은 성인입니다.
//		성인의 기준 : 18살 이상
		
		JFrame f = new JFrame();
		
		f.setSize(500, 500); //이미지사이즈
		//텍스트 입력
		JTextField t1 = new JTextField(20);// text1
		JTextField t2 = new JTextField(20);// text2
		//버튼1 : 숫자1입력
		JButton button = new JButton();
		button.setText("숫자1입력");
		button.setBackground(Color.MAGENTA);//버튼색상
		
		button.addActionListener(new ActionListener() {//버튼액션 //함수설정
			public void actionPerformed(ActionEvent e) {//public void //기본class에서 windowbuildeditor : source : design : 이용
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num3 = Integer.parseInt(num1);
				int num4 = Integer.parseInt(num2);
				
				if (num3>num4) {
					System.out.println("첫번째숫자" + t1 + "이 더큽니다");
				}else {
					System.out.println("두번째 숫자" + t2 + "가 더 큽니다");
				}
				
			
				
			}
		});
		f.getContentPane().add(button, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("숫자2입력");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		
		f.setVisible(true);//화면구현
		
	}

}
