package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 틀역할을 하는 부품이 필요
		
		JFrame f = new JFrame(); //자료형 변수명 //자료형 : int : String  
		f.setSize( 500 , 500 ); //. : 부품
		
		JButton btnNewButton = new JButton("나를 눌러요");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를 눌렀네..!!!");
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("메뉴1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "메뉴1..!!!");
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		
		JButton btnNewButton_3 = new JButton("메뉴3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "메뉴3..!!!");
			}
		});
		f.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		f.setVisible(true);
		//기본설정
		
		//openwith : windowbuildereditor : design
		
		}

}
