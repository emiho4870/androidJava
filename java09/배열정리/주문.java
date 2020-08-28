package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class 주문 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.getContentPane().setLayout(null);
		
		
		
		JLabel 메뉴btn_3 = new JLabel("짜장");
		메뉴btn_3.setBackground(Color.ORANGE);
		메뉴btn_3.setBounds(203, 44, 57, 15);
		f.getContentPane().add(메뉴btn_3);
		
		
		
		
		JLabel 메뉴btn_1 = new JLabel("짬뽕");
		메뉴btn_1.setBackground(Color.CYAN);
		메뉴btn_1.setBounds(90, 44, 57, 15);
		f.getContentPane().add(메뉴btn_1);
		
		
		
		
		JLabel 메뉴Btn_2 = new JLabel("우동");
		메뉴Btn_2.setBackground(Color.ORANGE);
		메뉴Btn_2.setBounds(146, 44, 57, 15);
		f.getContentPane().add(메뉴Btn_2);
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("개수입력");
		lblNewLabel_3.setBounds(314, 44, 57, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		
		
		
		textField = new JTextField();
		textField.setText("0개");
		textField.setBounds(371, 41, 93, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		JLabel label = new JLabel("지불할 총 금액");
		label.setBounds(359, 362, 116, 15);
		f.getContentPane().add(label);
		
		
		
		textField_1 = new JTextField();
		textField_1.setText("0원");
		textField_1.setBounds(487, 359, 116, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\VSproject\\workspace\\java09\\jjajang.png"));
		lblNewLabel_4.setBounds(90, 87, 512, 249);
		f.getContentPane().add(lblNewLabel_4);
		
		
		
		
		f.setVisible(true);
	}
}
