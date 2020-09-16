package projectRe;

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
import javax.swing.border.LineBorder;

import project.MemberDAO;
import project.MemberVO;
import projectRe.join;

/*
 * 회원가입버튼 : 로그인창
 */
//public class login extends JFrame {
//
//	public login() {
//
//
//}

public class login extends JFrame {
	// 버튼이 들어갈 메인 클래스
	public login() {
		        
//				setTitle("login");
//				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		    	
//		    	JPanel LoginContainer = new JPanel();
//		    	setContentPane(LoginContainer);
//		    	
//		    	setSize(800,800);
//		    	setResizable(false);
//		    	setVisible(true);
		    	
		    
		        JTextField t1;
		    	JTextField t2;

		
		    	
		    		JFrame f = new JFrame(); // (1)
		    		f.setTitle("login");
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
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
		    		JButton OpenWindow = new JButton("회원가입");
		    		OpenWindow.setBounds(520, 457, 113, 27);
		    		OpenWindow.addActionListener(new ActionListener() {
		    			 @Override
			                public void actionPerformed(ActionEvent e) {
			               
			                    new join();
		    				
		    				
		    			}
		    		});
//		    		MainContainer.add(OpenWindow);

		    		
		    		OpenWindow.setForeground(new Color(255, 255, 255));
		    		OpenWindow.setBackground(new Color(102, 102, 102));
		    		OpenWindow.setFont(new Font("굴림", Font.PLAIN, 15));
		    		

		    	
		            
		    
		    		
		    		
		    		JPanel panel = new JPanel();
		    		panel.setBounds(111, 182, 583, 333);
		    		panel.setBorder(new LineBorder(new Color(102, 102, 102), 1, true));
		    		f.getContentPane().setLayout(null);
		    		f.getContentPane().add(lblFurnitureshop);
		    		f.getContentPane().add(t1);
		    		f.getContentPane().add(t2);
		    		f.getContentPane().add(logbtn);
		    		f.getContentPane().add(lblNewLabel);
		    		f.getContentPane().add(OpenWindow);
		    		f.getContentPane().add(panel);
		    		f.setVisible(true);
		    		
		   
		        
		        
		    }

	public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        new login();
		    }
		 
		}
		 
	
	
		    	
		    

	
	
	
	
/*
 * 회원가입창
 */
class join extends JFrame {
	join() {
		setTitle("join");

		JPanel JoinContainer = new JPanel();
		setContentPane(JoinContainer);

		//JLabel NewLabel = new JLabel("새 창을 띄우는데 성공!");
		//JoinContainer.add(NewLabel);

		setSize(800, 800);
		setResizable(false);
		setVisible(true);

		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		JTextField t1;
		JTextField t2;
		JTextField t2Chk;
		JTextField t3;
		JTextField t4;
		JTextField t5;
		JTextField t1Chk = null;
		JTextField pwchkchk = null;

		JFrame f = new JFrame(); // (1)
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.getContentPane().setFont(new Font("새굴림", Font.PLAIN, 12));
		f.setSize(800, 800);
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

		JButton create = new JButton("회원가입");
		create.setBounds(247, 461, 116, 44);
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String member_id = t1.getText();
				String member_pw = t2.getText();
				String member_pwChk = t2Chk.getText();
				String member_name = t3.getText();
				String member_tel_no = t4.getText();
				String member_address = t5.getText();

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
					JOptionPane.showMessageDialog(null, "회원가입이 되었습니다");
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

				String member_id = t1.getText();// id로 검색
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(member_id);// 0이나 1이 리턴되어왔음.
					if (result == 1) { // 검색결과가 있음.
//										t1Chk.setText("중복아이디가있습니다");
//										t1Chk.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "중복아이디가있습니다");

					} else {// 검색결과가 없음.
//										t1Chk.setText("중복아이디가없습니다");
//										t1Chk.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "중복아이디가없습니다");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		idchk.setForeground(new Color(255, 255, 255));
		idchk.setBackground(new Color(102, 102, 102));
		panel.add(idchk);

//		t1Chk = new JTextField();
//		t1Chk.setBounds(248, 96, 149, 21);
//		t1Chk.setText("*아이디중복 여부 체크");
//		panel.add(t1Chk);
//		t1Chk.setColumns(10);

		JButton pwchk = new JButton("비밀번호확인 [필수]");
		pwchk.setBounds(409, 195, 149, 29);
		pwchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String member_pw = t2.getText();
				String member_pwChk = t2Chk.getText();

				MemberDAO dao = new MemberDAO();

				try {
					if (member_pw.equals(member_pwChk)) {
//								pwchkchk.setText("비밀번호입력이 같습니다");
//								pwchkchk.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "비밀번호입력이 같습니다");
					} else {
//								pwchkchk.setText("비밀번호입력이 다릅니다");
						JOptionPane.showMessageDialog(null, "비밀번호입력이 다릅니다");

					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		pwchk.setForeground(Color.WHITE);
		pwchk.setBackground(new Color(102, 102, 102));
		panel.add(pwchk);

//		pwchkchk = new JTextField();
//		pwchkchk.setBounds(248, 236, 149, 21);
//		pwchkchk.setText("*\uBE44\uBC00\uBC88\uD638\uD655\uC778");
//		pwchkchk.setColumns(10);
//		panel.add(pwchkchk);
		// FlowLayout flow = new FlowLayout();
		// f.getContentPane().setLayout(flow);
		f.setVisible(true); // (3)

	}
}
