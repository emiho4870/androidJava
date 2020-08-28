package project1;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;

public class 상품페이지 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) { //java : openwith : windowbuilder : 전환 : 기본소스셋팅
		// TODO Auto-generated method stub
		
	

//		기본셋팅 : 창
//		JFrame f = new JFrame();
//		f.setSize(500,500);
//		f.setVisible(true);
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.setSize(1000,1000);
		
		ImageIcon img = new ImageIcon("home.png"); //상세이미지 넣기
		ImageIcon img2 = new ImageIcon("home2.png"); //상세이미지
		ImageIcon img3 = new ImageIcon("home3.png"); //상세이미지
		ImageIcon img4 = new ImageIcon("home4.png"); //상세이미지
		
		JButton btnNewButton_2 = new JButton("소파/거실");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(102, 102, 102));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(246, 146, 135, 50);
		
		JButton btnNewButton_3 = new JButton("침실");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3.setBackground(new Color(102, 102, 102));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(390, 146, 135, 50);
		
		JButton btnNewButton_4 = new JButton("드레스룸");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_4.setBackground(new Color(102, 102, 102));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(533, 146, 135, 50);
		
		JLabel lblNewLabel_1 = new JLabel("거실>소파");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(251, 236, 116, 47);
		
		JButton btnImg1 = new JButton("가구이미지"); //상세이미지
		btnImg1.setBounds(253, 287, 210, 210);
		
		JButton btnImg3 = new JButton("가구3");
		btnImg3.setBounds(326, 507, 66, 66);
		
		JLabel lblNewLabel_2 = new JLabel("상품명");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(502, 257, 75, 35);
		
		JLabel lblNewLabel_3 = new JLabel("판매가");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(502, 307, 69, 34);
		
		JLabel lblNewLabel_4 = new JLabel("배송비");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(502, 345, 78, 35);
		
		JLabel lblNewLabel_6 = new JLabel("색상");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(502, 379, 80, 31);
		
		JLabel lblNewLabel_7 = new JLabel("수량");
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(502, 420, 69, 41);
		
		JList list = new JList();
		list.setBounds(1469, 499, 1, 1);
		
		JList list_1 = new JList();
		list_1.setBounds(1514, 518, 1, 1);
		
		JList list_2 = new JList();
		list_2.setBounds(1476, 806, 1, 1);
		
		JList list_3 = new JList();
		list_3.setBounds(1514, 750, 1, 1);
		
		JList list_4 = new JList();
		list_4.setBounds(246, 769, 1, 1);
		
		JList list_5 = new JList();
		list_5.setBounds(1570, 421, 1, 1);
		
		JList list_6 = new JList();
		list_6.setBounds(1514, 750, 1, 1);
		
		JList list_7 = new JList();
		list_7.setBounds(1514, 421, 1, 1);
		
		JLabel lblNewLabel_8 = new JLabel("결제예정금액");
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(502, 454, 136, 67);
		
		

		
		btnImg1.setIcon(img);
		//btnImg2.setIcon(img2);
		btnImg3.setIcon(img3);
		//btnImg4.setIcon(img4);
		
		f.getContentPane().add(btnImg1);
		//f.getContentPane().add(btnImg2);
		f.getContentPane().add(btnImg3);
		//f.getContentPane().add(btnImg4);
		
		//라벨 : 버튼 : 리스트
		
		textField = new JTextField();
		textField.setBounds(683, 464, 110, 36);
		textField.setText("결제예정금액");
		textField.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("찜하기");
		btnNewButton_8.setBackground(new Color(102, 102, 102));
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBounds(491, 538, 100, 35);
		
		JButton btnNewButton_9 = new JButton("장바구니");
		btnNewButton_9.setBackground(new Color(102, 102, 102));
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBounds(592, 538, 100, 35);
		
		JButton btnNewButton_10 = new JButton("바로구매");
		btnNewButton_10.setBackground(new Color(102, 102, 102));
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBounds(693, 538, 100, 35);
		
		JLabel label = new JLabel("무료배송");
		label.setBounds(683, 357, 76, 15);
		
		JButton btnNewButton_4_1 = new JButton("주방");
		btnNewButton_4_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_4_1.setBackground(new Color(102, 102, 102));
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.setBounds(677, 146, 135, 50);
		
		JButton btnImg2 = new JButton("가구2");
		btnImg2.setBounds(253, 507, 66, 66);
		btnImg2.setIcon(img2);
		f.getContentPane().add(btnImg2);
		
		JButton btnImg4 = new JButton("가구4");
		btnImg4.setBounds(399, 507, 66, 66);
		btnImg4.setIcon(img4);
		f.getContentPane().add(btnImg4);
		
		//라벨 : 버튼 : 리스트
		JLabel lblNewLabel = new JLabel("Furnitureshop");
		lblNewLabel.setBounds(398, 60, 244, 56);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
		
		JButton btnNewButton_1_1 = new JButton("X");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(102, 102, 102));
		btnNewButton_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(891, 10, 81, 81);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 0, 0);
		f.getContentPane().add(comboBox);
		f.getContentPane().setLayout(null);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(btnImg1);
		f.getContentPane().add(btnImg3);
		f.getContentPane().add(btnImg2);
		f.getContentPane().add(btnImg4);
		f.getContentPane().add(comboBox);
		f.getContentPane().add(list_2);
		f.getContentPane().add(btnNewButton_2);
		f.getContentPane().add(btnNewButton_3);
		f.getContentPane().add(lblNewLabel_1);
		f.getContentPane().add(lblNewLabel_7);
		f.getContentPane().add(lblNewLabel_4);
		f.getContentPane().add(lblNewLabel_6);
		f.getContentPane().add(lblNewLabel_2);
		f.getContentPane().add(lblNewLabel_8);
		f.getContentPane().add(label);
		f.getContentPane().add(lblNewLabel_3);
		f.getContentPane().add(textField);
		f.getContentPane().add(btnNewButton_8);
		f.getContentPane().add(btnNewButton_9);
		f.getContentPane().add(btnNewButton_10);
		f.getContentPane().add(list_4);
		f.getContentPane().add(btnNewButton_4);
		f.getContentPane().add(btnNewButton_4_1);
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(list);
		f.getContentPane().add(list_6);
		f.getContentPane().add(list_7);
		f.getContentPane().add(list_5);
		f.getContentPane().add(list_1);
		f.getContentPane().add(list_3);
		f.getContentPane().add(btnNewButton_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("상품가격 (원)");
		textField_1.setBounds(683, 314, 109, 35);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("상품명1");
		textField_2.setBounds(683, 259, 109, 35);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(683, 379, 110, 35);
		f.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(683, 425, 110, 34);
		f.getContentPane().add(comboBox_2);
		f.setVisible(true);
		
		
//=====끝
	}
}
