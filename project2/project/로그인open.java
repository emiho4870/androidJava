package project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

public class 로그인open {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {//기본페이지
		// TODO Auto-generated method stub
		
//		기본셋팅
//		JFrame f = new JFrame(); //(1)
//		f.setSize(1000,500); //(2)
//		//FlowLayout flow = new FlowLayout();
//		//f.getContentPane().setLayout(flow);
//		f.setVisible(true); //(3)
		
		/*
		 * 아이디 비밀번호 를 잘못입력하였습니다 
		 */
		
		
	
		JFrame f = new JFrame(); // (1)
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.getContentPane().setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		f.setSize(800,800); // (2)
		
		JLabel lblFurnitureshop = new JLabel("Furniture Shop Login");
		lblFurnitureshop.setBounds(210, 76, 385, 70);
		lblFurnitureshop.setForeground(new Color(51, 51, 51));
		lblFurnitureshop.setFont(new Font("Serif", Font.BOLD, 40));
		
		t1 = new JTextField();
		t1.setBounds(194, 246, 249, 46);
		t1.setText("아이디를 입력하세요");
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(194, 298, 249, 47);
		t2.setText("비밀번호를 입력하세요");
		t2.setColumns(10);
		
		
		/*
		 * Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20)); 
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시 ...", 20)); 
		 */
		JButton logbtn = new JButton("로그인");
		logbtn.setBounds(495, 244, 104, 101);
		logbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String member_id = t1.getText();
				String member_pw = t2.getText();
				
				MemberDAO dao = new MemberDAO();
				
				try {
					boolean result = dao.read(member_id,member_pw);
					if(result == true) {
						JOptionPane.showMessageDialog(null, "로그인성공");
						
					}else {
						JOptionPane.showMessageDialog(null, "로그인실패");
						
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		logbtn.setForeground(new Color(255, 255, 255));
		logbtn.setBackground(new Color(102, 102, 102));
		logbtn.setFont(new Font("굴림", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("멤버십회원으로 가입하신 후 구매가 가능하십니다");
		lblNewLabel.setBounds(194, 461, 314, 18);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		
		/*
		 * 회원가입
		 */
		JButton joinbtn = new JButton("회원가입");
		joinbtn.setBounds(520, 457, 113, 27);
		joinbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		joinbtn.setForeground(new Color(255, 255, 255));
		joinbtn.setBackground(new Color(102, 102, 102));
		joinbtn.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JPanel panel = new JPanel();
		panel.setBounds(111, 182, 583, 333);
		panel.setBorder(new LineBorder(new Color(102, 102, 102), 1, true));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(lblFurnitureshop);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(logbtn);
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(joinbtn);
		f.getContentPane().add(panel);
		f.setVisible(true); // (3)
		//FlowLayout flow = new FlowLayout();
		//f.getContentPane().setLayout(flow);
		
		f.setTitle("login");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		

	}
}