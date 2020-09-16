package project;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 상품정보 {
	private static JTextField t2;
	private static JTextField t1;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) { //java : openwith : windowbuilder : 전환 : 기본소스셋팅
		// TODO Auto-generated method stub
		
	

//		기본셋팅 : 창
//		JFrame f = new JFrame();
//		f.setSize(500,500);
//		f.setVisible(true);
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.setSize(700,700);
		
		
	

		f.setVisible(true);
		f.setTitle("product");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("home5.png"); //상세이미지 넣기
		ImageIcon img2 = new ImageIcon("home6.png"); //상세이미지
		ImageIcon img3 = new ImageIcon("home7.png"); //상세이미지
		ImageIcon img4 = new ImageIcon("home8.png"); //상세이미지
		
		
		String product_name[] = {"sofa1","sofa2","sofa3","sofa4","sofa5"};
		String product_price[] = {"20000","30000","40000","50000","60000"};
		String product_color[] = {"BLACK","BROWN","GREEN","PURPLE","DARKGRAY"};
		String product_amount[] = {"1","2","3","4","5"};
		f.getContentPane().setLayout(null);
		
		
		t1 = new JTextField(product_name[0]);
		t1.setBounds(515, 188, 109, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		
		t2 = new JTextField(product_price[0]);
		t2.setBounds(515, 243, 109, 35);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		
		/*
		tLabel = new JLabel("텍스트창에 입력한 글자를 TextArea에 작성합니다.");
        return tLabel;
		 */
		
		
		t3 = new JTextField(product_color[0]);
		t3.setBounds(515, 315, 109, 35);
		//t3.setText(null);
		t3.setColumns(10);
		f.getContentPane().add(t3);
		
		t4 = new JTextField(product_amount[0]);
		t4.setBounds(515, 361, 109, 35);
		//t4.setText(null);
		t4.setColumns(10);
		f.getContentPane().add(t4);
		
		
		JButton btnNewButton_10 = new JButton("바로구매");
		btnNewButton_10.setBounds(525, 467, 100, 35);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String product_name = t1.getText();
				String product_price = t2.getText();
				String product_color = t3.getText();
				String product_amount = t4.getText();
				
				
				OrderDAO dao = new OrderDAO();
				OrderVO bag = new OrderVO();
				
				bag.setProduct_name(product_name);
				bag.setProduct_price(Integer.parseInt(product_price));
				bag.setProduct_color(product_color);
				bag.setProduct_amount(Integer.parseInt(product_amount));
				
				try {
					dao.create(bag);
					JOptionPane.showMessageDialog(null,"주문이 완료되었습니다");
				} catch (Exception e1) {
//
						
					}
					
					/*
					 * catch : 아이디btn : 비밀번호btn : 미체크시 확인요청창
					 */
			}
		});
		btnNewButton_10.setBackground(new Color(102, 102, 102));
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		
//		JButton btnNewButton_2 = new JButton("소파/거실");
//		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
//		btnNewButton_2.setBackground(new Color(102, 102, 102));
//		btnNewButton_2.setForeground(new Color(255, 255, 255));
//		btnNewButton_2.setBounds(246, 146, 135, 50);
		
//		JButton btnNewButton_3 = new JButton("침실");
//		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
//		btnNewButton_3.setBackground(new Color(102, 102, 102));
//		btnNewButton_3.setForeground(new Color(255, 255, 255));
//		btnNewButton_3.setBounds(390, 146, 135, 50);
		
//		JButton btnNewButton_4 = new JButton("드레스룸");
//		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 20));
//		btnNewButton_4.setBackground(new Color(102, 102, 102));
//		btnNewButton_4.setForeground(new Color(255, 255, 255));
//		btnNewButton_4.setBounds(533, 146, 135, 50);
		
		JButton btnImg1 = new JButton("가구이미지");
		btnImg1.setBounds(60, 186, 222, 240);
		
		JLabel lblNewLabel_2 = new JLabel("상품명");
		lblNewLabel_2.setBounds(334, 186, 75, 35);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("판매가");
		lblNewLabel_3.setBounds(334, 236, 69, 34);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("배송비");
		lblNewLabel_4.setBounds(334, 274, 78, 35);
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6 = new JLabel("색상");
		lblNewLabel_6.setBounds(334, 319, 80, 31);
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel_7 = new JLabel("수량");
		lblNewLabel_7.setBounds(334, 360, 69, 41);
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 20));
		
		
		
		btnImg1.setIcon(img);
		//btnImg4.setIcon(img4);
		
		f.getContentPane().add(btnImg1);
		
		JButton btnNewButton_9 = new JButton("장바구니");
		btnNewButton_9.setBounds(403, 467, 116, 35);
		btnNewButton_9.setBackground(new Color(102, 102, 102));
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		
		
		JLabel label = new JLabel("무료배송");
		label.setBounds(515, 286, 76, 15);
		
		//라벨 : 버튼 : 리스트
		JLabel lblNewLabel = new JLabel("Furnitureshop");
		lblNewLabel.setBounds(241, 63, 244, 56);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 0, 0);
		f.getContentPane().add(comboBox);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(btnImg1);
		f.getContentPane().add(comboBox);
//		f.getContentPane().add(btnNewButton_2);
//		f.getContentPane().add(btnNewButton_3);
		f.getContentPane().add(lblNewLabel_7);
		f.getContentPane().add(lblNewLabel_4);
		f.getContentPane().add(lblNewLabel_6);
		f.getContentPane().add(lblNewLabel_2);
		f.getContentPane().add(label);
		f.getContentPane().add(lblNewLabel_3);
		f.getContentPane().add(btnNewButton_9);
		f.getContentPane().add(btnNewButton_10);
//		f.getContentPane().add(btnNewButton_4);
//		f.getContentPane().add(btnNewButton_4_1);
		f.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
//=====끝
	}
}

