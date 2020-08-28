package project1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class 로그인페이지 {
	
	
//	로그인페이지() {
//		setTitle("loginpage");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_9;

	public static void main(String[] args) {//기본페이지
		// TODO Auto-generated method stub

		
				JFrame f = new JFrame(); //(1)
				f.getContentPane().setBackground(new Color(204, 153, 153));
				f.getContentPane().setFont(new Font("새굴림", Font.PLAIN, 12));
				f.setSize(1000,1000);
				
				JLabel lblNewLabel = new JLabel("Furniture Shop Join");
				lblNewLabel.setBounds(308, 42, 352, 56);
				lblNewLabel.setBackground(Color.GRAY);
				lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
				
				JButton btnNewButton_1 = new JButton("X");
				btnNewButton_1.setBounds(881, 10, 91, 87);
				btnNewButton_1.setForeground(new Color(255, 255, 255));
				btnNewButton_1.setBackground(new Color(102, 102, 102));
				btnNewButton_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
				f.getContentPane().setLayout(null);
				f.getContentPane().add(lblNewLabel);
				f.getContentPane().add(btnNewButton_1);
				
				JPanel panel = new JPanel();
				panel.setBounds(196, 178, 614, 553);
				f.getContentPane().add(panel);
				
				textField_3 = new JTextField();
				textField_3.setBounds(247, 67, 150, 36);
				textField_3.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_3.setText("아이디 입력");
				textField_3.setColumns(10);
				
				textField_4 = new JTextField();
				textField_4.setBounds(247, 113, 150, 32);
				textField_4.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_4.setText("비밀번호 입력");
				textField_4.setColumns(10);
				
				textField_5 = new JTextField();
				textField_5.setBounds(247, 194, 150, 32);
				textField_5.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_5.setText("비밀번호 확인");
				textField_5.setColumns(10);
				
				textField_6 = new JTextField();
				textField_6.setBounds(248, 276, 116, 32);
				textField_6.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_6.setText("이름 입력");
				textField_6.setColumns(10);
				
				textField_7 = new JTextField();
				textField_7.setBounds(247, 330, 116, 32);
				textField_7.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_7.setText("연락처 입력");
				textField_7.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("10자 이상, 영문 대소문자 , 숫자 중 2가지 이상 조합");
				lblNewLabel_6.setBounds(248, 155, 278, 15);
				
				JLabel lblNewLabel_7 = new JLabel("10자 이상, 영문 대소문자 , 숫자 중 2가지 이상 조합");
				lblNewLabel_7.setBounds(247, 236, 278, 15);
				
				JLabel lblNewLabel_1 = new JLabel("아이디");
				lblNewLabel_1.setBounds(118, 69, 68, 32);
				lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_2 = new JLabel("비밀번호");
				lblNewLabel_2.setBounds(119, 111, 90, 32);
				lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_3 = new JLabel("비밀번호 확인");
				lblNewLabel_3.setBounds(119, 190, 127, 37);
				lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_4 = new JLabel("이름");
				lblNewLabel_4.setBounds(118, 272, 68, 37);
				lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_5 = new JLabel("연락처");
				lblNewLabel_5.setBounds(118, 333, 69, 29);
				lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel label = new JLabel("주소");
				label.setBounds(118, 381, 69, 32);
				label.setFont(new Font("굴림", Font.PLAIN, 20));
				
				textField_9 = new JTextField();
				textField_9.setBounds(248, 383, 234, 32);
				textField_9.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_9.setText("주소입력");
				textField_9.setColumns(10);
				
				JButton btnNewButton_2 = new JButton("회원가입");
				btnNewButton_2.setForeground(new Color(255, 255, 255));
				btnNewButton_2.setBackground(new Color(102, 102, 102));
				btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 15));
				btnNewButton_2.setBounds(247, 480, 116, 44);
				panel.setLayout(null);
				panel.add(lblNewLabel_2);
				panel.add(lblNewLabel_3);
				panel.add(lblNewLabel_4);
				panel.add(lblNewLabel_5);
				panel.add(label);
				panel.add(textField_9);
				panel.add(lblNewLabel_6);
				panel.add(textField_4);
				panel.add(textField_5);
				panel.add(textField_6);
				panel.add(textField_3);
				panel.add(textField_7);
				panel.add(lblNewLabel_7);
				panel.add(btnNewButton_2);
				panel.add(lblNewLabel_1);
				
				JButton btnNewButton = new JButton("중복체크[필수]");
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(102, 102, 102));
				btnNewButton.setBounds(409, 67, 132, 36);
				panel.add(btnNewButton);
				//FlowLayout flow = new FlowLayout();
				//f.getContentPane().setLayout(flow);
				f.setVisible(true); //(3)
				
	}
}
