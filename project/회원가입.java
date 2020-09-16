package project;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class 회원가입 {
	
	
//	로그인페이지() {
//		setTitle("loginpage");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t2Chk;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t1Chk;
	private static JTextField pwchkchk;

	public static void main(String[] args) {//기본페이지
		// TODO Auto-generated method stub
		
		/*
		 * 비밀번호를 다시입력하여주세요
		 */

		
				JFrame f = new JFrame(); //(1)
				f.getContentPane().setBackground(new Color(204, 153, 153));
				f.getContentPane().setFont(new Font("새굴림", Font.PLAIN, 12));
				f.setSize(800,800);
				f.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Furniture Shop Join");
				lblNewLabel.setBounds(221, 49, 352, 56);
				lblNewLabel.setBackground(Color.GRAY);
				lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
				f.getContentPane().add(lblNewLabel);
				
				JPanel panel = new JPanel();
				panel.setBounds(79, 148, 614, 553);
				f.getContentPane().add(panel);
				
				t1 = new JTextField();
				t1.setBounds(247, 55, 150, 36);
				t1.setFont(new Font("굴림", Font.PLAIN, 15));
				t1.setText("아이디 입력");
				t1.setColumns(10);
				
				t2 = new JTextField();
				t2.setBounds(247, 127, 150, 32);
				t2.setFont(new Font("굴림", Font.PLAIN, 15));
				t2.setText("비밀번호 입력");
				t2.setColumns(10);
				
				t2Chk = new JTextField();
				t2Chk.setBounds(247, 194, 150, 32);
				t2Chk.setFont(new Font("굴림", Font.PLAIN, 15));
				t2Chk.setText("비밀번호 확인");
				t2Chk.setColumns(10);
				
				t3 = new JTextField();
				t3.setBounds(248, 276, 116, 32);
				t3.setFont(new Font("굴림", Font.PLAIN, 15));
				t3.setText("이름 입력");
				t3.setColumns(10);
				
				t4 = new JTextField();
				t4.setBounds(247, 330, 116, 32);
				t4.setFont(new Font("굴림", Font.PLAIN, 15));
				t4.setText("연락처 입력");
				t4.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("10자 이상, 영문 대소문자 , 숫자 중 2가지 이상 조합");
				lblNewLabel_6.setBounds(248, 169, 294, 15);
				
				JLabel lblNewLabel_1 = new JLabel("아이디");
				lblNewLabel_1.setBounds(107, 59, 68, 32);
				lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_2 = new JLabel("비밀번호");
				lblNewLabel_2.setBounds(107, 125, 90, 32);
				lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_3 = new JLabel("비밀번호 확인");
				lblNewLabel_3.setBounds(107, 192, 127, 37);
				lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_4 = new JLabel("이름");
				lblNewLabel_4.setBounds(106, 274, 68, 37);
				lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel lblNewLabel_5 = new JLabel("연락처");
				lblNewLabel_5.setBounds(106, 335, 69, 29);
				lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 20));
				
				JLabel label = new JLabel("주소");
				label.setBounds(106, 383, 69, 32);
				label.setFont(new Font("굴림", Font.PLAIN, 20));
				
				t5 = new JTextField();
				t5.setBounds(248, 383, 234, 32);
				t5.setFont(new Font("굴림", Font.PLAIN, 15));
				t5.setText("주소입력");
				t5.setColumns(10);
				
				
				/*
				 * 아이디중복체크btn
				 * 비밀번호입력동일여부
				 * 항목비워져있으면입력요청
				 */
				JButton create = new JButton("회원가입");
				create.setBounds(247, 461, 116, 44);
				create.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String member_id = t1.getText();
						String member_pw = t2.getText();
						String member_pwChk = t2Chk.getText();
						String member_name= t3.getText();
						String member_tel_no= t4.getText();
						String member_address= t5.getText();
						
						MemberDAO dao = new MemberDAO();
						MemberVO bag = new MemberVO();
						
						bag.setMember_id(member_id);
						bag.setMember_pw(member_pw);
						bag.setMember_pwChk(member_pwChk);
						bag.setMember_name(member_name);
						bag.setMember_tel_no(member_tel_no);
						bag.setMember_address(member_address);
						try {
							dao.create(bag);
							JOptionPane.showMessageDialog(null,"회원가입이 되었습니다");
						} catch (Exception e1) {
//		
								
							}
							
							/*
							 * catch : 아이디btn : 비밀번호btn : 미체크시 확인요청창
							 */
						}		
					
				});
				f.setTitle("join");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				create.setForeground(new Color(255, 255, 255));
				create.setBackground(new Color(102, 102, 102));
				create.setFont(new Font("굴림", Font.PLAIN, 15));
				panel.setLayout(null);
				panel.add(lblNewLabel_2);
				panel.add(lblNewLabel_3);
				panel.add(lblNewLabel_4);
				panel.add(lblNewLabel_5);
				panel.add(label);
				panel.add(t5);
				panel.add(lblNewLabel_6);
				panel.add(t2);
				panel.add(t2Chk);
				panel.add(t3);
				panel.add(t1);
				panel.add(t4);
				panel.add(create);
				panel.add(lblNewLabel_1);
				
				JButton idchk = new JButton("중복체크[필수]");
				idchk.setBounds(410, 55, 132, 36);
				idchk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
								String member_id = t1.getText();//id로 검색
								MemberDAO dao = new MemberDAO();
								try {
									int result = dao.read(member_id);//0이나 1이 리턴되어왔음.
									if (result == 1) { //검색결과가 있음.
										t1Chk.setText("중복아이디가있습니다");
										t1Chk.setForeground(Color.red);
										
									}else {//검색결과가 없음.
										t1Chk.setText("중복아이디가없습니다");
										t1Chk.setForeground(Color.red);
									}
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								
							}
						});
				idchk.setForeground(new Color(255, 255, 255));
				idchk.setBackground(new Color(102, 102, 102));
				panel.add(idchk);
				
				t1Chk = new JTextField();
				t1Chk.setBounds(248, 96, 149, 21);
				t1Chk.setText("*\uC544\uC774\uB514\uC911\uBCF5 \uC5EC\uBD80");
				panel.add(t1Chk);
				t1Chk.setColumns(10);
				
				JButton pwchk = new JButton("비밀번호확인 [필수]");
				pwchk.setBounds(409, 195, 149, 29);
				pwchk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String member_pw = t2.getText();
						String member_pwChk = t2Chk.getText();
						
						MemberDAO dao = new MemberDAO();
						
						try {
							if(member_pw != member_pwChk) {
								pwchkchk.setText("비밀번호입력이 같습니다");
								pwchkchk.setForeground(Color.red);
							}else {
								pwchkchk.setText("비밀번호입력이 다릅니다");
								
							}
							
						} catch (Exception e2) {
							e2.printStackTrace();
						}
						
						/*
						 * return : != : 
						 * 비밀번호return
						 * 비밀번호10자리입력length
						 */
					}
				});
				pwchk.setForeground(Color.WHITE);
				pwchk.setBackground(new Color(102, 102, 102));
				panel.add(pwchk);
				
				pwchkchk = new JTextField();
				pwchkchk.setBounds(248, 236, 149, 21);
				pwchkchk.setText("*\uBE44\uBC00\uBC88\uD638\uD655\uC778");
				pwchkchk.setColumns(10);
				panel.add(pwchkchk);
				//FlowLayout flow = new FlowLayout();
				//f.getContentPane().setLayout(flow);
				f.setVisible(true); //(3)
				
	}
}