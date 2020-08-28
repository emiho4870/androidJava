package 그래픽Swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class test2 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//		이름/태어난 년도를 입력을 바다엇
//		다음과 같이 출력되도록 프로그래밍
//		=> 홍길동은 성인입니다.
//		성인의 기준 : 18살 이상
		
		JFrame f = new JFrame();
		
		f.setSize(500, 500); //이미지사이즈
		
		JLabel label = new JLabel("이름");
		
		JLabel lblNewLabel = new JLabel("태어난 년도");
		
		JLabel label_1 = new JLabel("당신은");
		
		textField = new JTextField();
		textField.setText("성인유무");
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("입니다");
		
		textField_1 = new JTextField();
		textField_1.setText("이름입력");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("태어난 년도 입력");
		textField_2.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(f.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(61)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(25)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addGap(62)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addComponent(label_1)
							.addGap(26)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(label_2)))
					.addContainerGap(167, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(label)
							.addGap(74)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(88)
									.addComponent(label_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(85)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(184, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
							.addComponent(label_2)
							.addGap(185))))
		);
		f.getContentPane().setLayout(groupLayout);
		//텍스트 입력
		JTextField t1 = new JTextField(20);// text1
		JTextField t2 = new JTextField(20);
		
		
		f.setVisible(true);//화면구현
		
	}

}
