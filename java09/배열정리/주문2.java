package 배열정리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 주문2 {
	
	
	private static JTextField fcount;
	private static JTextField fmoney;

	static int now = 2;
	static int f1 = 0; //짬 초기값
	static int f2 = 0; //탕
	static int f3 = 0; //짜
	
	static int take = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Textfield : Button
		
		/*
		 * JFrame 
		 */
		JFrame f = new JFrame();
		
		f.getContentPane().setLayout(null);
		
		
		
		
		JLabel label1 = new JLabel("개수입력");
		label1.setBounds(486, 39, 57, 15);
		f.getContentPane().add(label1);
		
		
		
		/*
		 * fcount : 갯수누적
		 */
		fcount = new JTextField(); 
		fcount.setText("0개");
		fcount.setBounds(543, 36, 63, 21);
		f.getContentPane().add(fcount);
		fcount.setColumns(10);
		
		
		
		
		JLabel label2 = new JLabel("지불할 총 금액");
		label2.setBounds(358, 378, 116, 15);
		f.getContentPane().add(label2);
		
		
		/*
		 * 금액누적 : fmoney
		 */
		fmoney = new JTextField();
		fmoney.setText("0원");
		fmoney.setBounds(486, 375, 116, 21);
		f.getContentPane().add(fmoney);
		fmoney.setColumns(10);
		
		
		/*
		 * 음식이미지변경 : 변수 : foodImage
		 */
		JLabel foodImage = new JLabel("New label");
		foodImage.setIcon(new ImageIcon("D:\\VSproject\\workspace\\java09\\img1.png"));
		foodImage.setBounds(90, 87, 512, 249);
		f.getContentPane().add(foodImage);
		
		
		
//		img0 = new ImageIcon("images/family.png"); 
//		img1 = new ImageIcon("images/bart.png"); 
//		img2 = new ImageIcon("images/risa.png"); 
//		imageLabel = new JLabel(img0);
//		contentPane.add(imageLabel, BorderLayout.CENTER); 
//		contentPane.add(new MenuPanel(), BorderLayout.SOUTH); 
//		setSize(300, 400); 
//		setVisible(true);

	
		
		/*
		 * menu1
		 */
		JButton menu1 = new JButton("짬뽕");
		menu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				ImageIcon icon = new ImageIcon("D:\\VSproject\\workspace\\java09\\img1.png");
				foodImage.setIcon(icon);
				f1++; //갯수누적
				//변수명.setText(); : 변수명은 출력될곳
				fcount.setText(f1 + "개"); //setText : 출력설정
				take = f1 * 4000; // 변수설정
				fmoney.setText( take + "원");
			}
		});
		menu1.setBounds(85, 36, 97, 23);
		f.getContentPane().add(menu1);
		
		
		
		/*
		 * menu2
		 */
		JButton menu2 = new JButton("탕수육");
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("D:\\VSproject\\workspace\\java09\\img2.png"); //create new object
				foodImage.setIcon(icon);
				f2++; //갯수누적
				//변수명.setText(); : 변수명은 출력될곳
				fcount.setText(f2 + "개"); //setText : 출력설정
				take = f2 * 4000; // 변수설정
				fmoney.setText( take + "원");
				
			}
		});
		menu2.setBounds(194, 36, 97, 23);
		f.getContentPane().add(menu2);
		
		
		
		/*
		 * menu3
		 */
		JButton menu3 = new JButton("짜장");
		menu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("D:\\VSproject\\workspace\\java09\\img3.png"); //create new object
				foodImage.setIcon(icon);
				f3++; // 갯수누적
				//변수명.setText(); : 변수명은 출력될곳
				fcount.setText(f3 + "개"); //setText : 출력설정
				take = f3 * 4000; // 변수설정
				fmoney.setText( take + "원");
			}
		});
		menu3.setBounds(304, 36, 97, 23);
		f.getContentPane().add(menu3);
		
		
		
		
		f.setVisible(true);
	}
}
