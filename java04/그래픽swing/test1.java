package 그래픽Swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class test1 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		두 개의 숫자를 입력을 받아서
//		버튼을 누르면 어떤 숫자가 더 큰지 판별!

		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel label = new JLabel("숫자를입력하시오");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("숫자입력(1)");
		label_1.setBackground(Color.PINK);
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("숫자입력(2)");
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("입력완료");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		
		textField_2 = new JTextField();
		textField_2.setText("더 큰수 표시");
		textField_2.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(f.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_2)
								.addComponent(lblNewLabel_1))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(26)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(303))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(64)
					.addComponent(label)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(79)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		f.getContentPane().setLayout(groupLayout);
		//텍스트 입력
		JTextField t1 = new JTextField(20);// text1
		JTextField t2 = new JTextField(20);
		
		
		f.setVisible(true);
		
	}
}
