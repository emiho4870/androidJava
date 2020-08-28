package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class 회원가입페이지 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {//기본페이지
		// TODO Auto-generated method stub
		
//		기본셋팅
//		JFrame f = new JFrame(); //(1)
//		f.setSize(1000,500); //(2)
//		//FlowLayout flow = new FlowLayout();
//		//f.getContentPane().setLayout(flow);
//		f.setVisible(true); //(3)
		
		
	
		JFrame f = new JFrame(); // (1)
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.getContentPane().setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		f.setSize(1000,1000); // (2)
		
		JLabel lblFurnitureshop = new JLabel("Furniture Shop Login");
		lblFurnitureshop.setForeground(new Color(51, 51, 51));
		lblFurnitureshop.setBounds(339, 105, 385, 70);
		lblFurnitureshop.setFont(new Font("Serif", Font.BOLD, 40));
		
		textField = new JTextField();
		textField.setBounds(319, 298, 249, 46);
		textField.setText("아이디를 입력하세요");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(319, 350, 249, 47);
		textField_1.setText("비밀번호를 입력하세요");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 102, 102));
		btnNewButton.setBounds(620, 296, 104, 101);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("멤버십회원으로 가입하신 후 구매가 가능하십니다");
		lblNewLabel.setBounds(319, 513, 314, 18);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(102, 102, 102));
		btnNewButton_1.setBounds(645, 509, 113, 27);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JButton btnNewButton_1_1 = new JButton("X");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(102, 102, 102));
		btnNewButton_1_1.setBounds(892, 10, 80, 80);
		btnNewButton_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(lblFurnitureshop);
		f.getContentPane().add(btnNewButton_1_1);
		f.getContentPane().add(textField);
		f.getContentPane().add(textField_1);
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(102, 102, 102), 1, true));
		panel.setBounds(236, 234, 583, 333);
		f.getContentPane().add(panel);
		f.setVisible(true); // (3)
		//FlowLayout flow = new FlowLayout();
		//f.getContentPane().setLayout(flow);
		
		
		
		
		

	}
}
