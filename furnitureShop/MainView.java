package furnitureShop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;



public class MainView extends JFrame {
	public MainView() {
	}

	protected static final String WHAT_THE_CLICKED_ON = null;

	public static void main(String[] args) {

		JFrame f = new JFrame("Furniture Shop");
		f.getContentPane().setLayout(new FlowLayout());
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setBackground(new Color(204, 153, 153));

		JLabel top = new JLabel("Furniture Shop");
		f.setBounds(120, 120, 300, 200);
		top.setBounds(374, 10, 309, 58);
		top.setFont(new Font("Serif", Font.BOLD, 40));
		top.setText("Furniture Shop");
		f.getContentPane().add(top);

		String[] mem = { "로그인", "관리자" };

		for (int i = 0; i < 2; i++) {
			JPanel panel1 = new JPanel();
			panel1.setBackground(Color.gray);
			FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
			flowLayout.setVgap(2);
			flowLayout.setHgap(2);
			f.getContentPane().add(panel1);
			JButton btn2 = new JButton(mem[i]);
			panel1.add(btn2);
			
			if(mem[i].equals(mem[0])) {
				btn2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					    
							JFrame frame6 = new JFrame();
							frame6.setTitle("login");
							frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					    	
					    	JPanel LoginContainer = new JPanel();
					    	frame6.setContentPane(LoginContainer);
					    	
					    	frame6.setSize(800,800);
					    	frame6.setResizable(false);
					    	frame6.setVisible(true);
					    
					        JTextField t1;
					    	JTextField t2;

					    		frame6.setTitle("login");
								frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
					    		frame6.getContentPane().setBackground(new Color(204, 153, 153));
					    		frame6.getContentPane().setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
					    		frame6.setSize(800,800); // (2)
					    		
					    		JLabel lblFurnitureshop = new JLabel("Furniture Shop Login");
					    		lblFurnitureshop.setBounds(210, 500, 385, 70);
					    		lblFurnitureshop.setForeground(new Color(51, 51, 51));
					    		lblFurnitureshop.setFont(new Font("Serif", Font.BOLD, 40));
					    		frame6.getContentPane().add(lblFurnitureshop);

					    		JPanel panel = new JPanel();
					    		t1 = new JTextField();
					    		t1.setBounds(194, 246, 249, 46);
					    		t1.setText("아이디를 입력하세요");
					    		t1.setColumns(10);
					    		panel.add(t1);
					    		panel.setSize(500, 500);
					    		
					    		
					    		t2 = new JTextField();
					    		t2.setBounds(194, 298, 249, 47);
					    		t2.setText("비밀번호를 입력하세요");
					    		t2.setColumns(10);
					    		panel.add(t2);
					    		frame6.getContentPane().add(t2);
					    		
					  
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
					    		panel.add(logbtn);
					    		frame6.getContentPane().add(logbtn);
					    		frame6.setResizable(false);
					    		
					    		JLabel lblNewLabel = new JLabel("멤버십회원으로 가입하신 후 구매가 가능하십니다");
					    		lblNewLabel.setBounds(194, 461, 314, 18);
					    		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
					    		panel.add(lblNewLabel);
					    		frame6.getContentPane().add(lblNewLabel);
					    		
					    		//회원가입
					    		JButton OpenWindow = new JButton("회원가입");
					    		
					    		OpenWindow.setBounds(520, 457, 113, 27);
					    		OpenWindow.addActionListener(new ActionListener() {
					    			 @Override
						                public void actionPerformed(ActionEvent e) {
					    				 JFrame frame7 = new JFrame();
						              
					    				 JTextField t1;
					    				 JTextField t2;
					    				 JTextField t2Chk;
					    				 JTextField t3;
					    				 JTextField t4;
					    				 JTextField t5;
					    				 
					    				 frame7.setTitle("join");
					    				 
					    				 JPanel panel2 = new JPanel();
					    				 frame7.setContentPane(panel2);
					    				 
					    				 frame7.setSize(800, 800);
					    				 
					    				 frame7.getContentPane().setBackground(new Color(204, 153, 153));
					    				 frame7.getContentPane().setFont(new Font("새굴림", Font.PLAIN, 12));
//					    				 frame7.getContentPane().setLayout(null);
					    				 
					    				 JLabel lblNewLabel = new JLabel("Furniture Shop Join");
					    				 lblNewLabel.setBounds(221, 49, 352, 56);
					    				 lblNewLabel.setBackground(Color.GRAY);
					    				 lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
					    				 frame7.getContentPane().add(lblNewLabel);
					    				 
					    				
					    				 panel2.setBounds(79, 148, 614, 553);
					    				 frame7.getContentPane().add(panel2);
					    				 
					    				 t1 = new JTextField();
					    				 t1.setBounds(247, 55, 150, 36);
					    				 t1.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 t1.setText("아이디 입력");
					    				 t1.setColumns(10);
					    				 panel2.add(t1);
					    				 frame7.getContentPane().add(t1);
					    				 
					    				 t2 = new JTextField();
					    				 t2.setBounds(247, 127, 150, 32);
					    				 t2.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 t2.setText("비밀번호 입력");
					    				 t2.setColumns(10);
					    				 panel2.add(t2);
					    				 frame7.getContentPane().add(t2);
					    				 
					    				 t2Chk = new JTextField();
					    				 t2Chk.setBounds(247, 194, 150, 32);
					    				 t2Chk.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 t2Chk.setText("비밀번호 확인");
					    				 t2Chk.setColumns(10);
					    				 panel2.add(t2Chk);
					    				 frame7.getContentPane().add(t2Chk);
					    				 
					    				 t3 = new JTextField();
					    				 t3.setBounds(248, 276, 116, 32);
					    				 t3.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 t3.setText("이름 입력");
					    				 t3.setColumns(10);
					    				 panel2.add(t3);
					    				 frame7.getContentPane().add(t3);
					    				 
					    				 t4 = new JTextField();
					    				 t4.setBounds(247, 330, 116, 32);
					    				 t4.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 t4.setText("연락처 입력");
					    				 t4.setColumns(10);
					    				 panel2.add(t4);
					    				 frame7.getContentPane().add(t4);
					    				 
					    				 JLabel lblNewLabel_6 = new JLabel("10자 이상, 영문 대소문자 , 숫자 중 2가지 이상 조합");
					    				 lblNewLabel_6.setBounds(248, 169, 294, 15);
					    				 panel2.add(lblNewLabel_6);
					    				 frame7.getContentPane().add(lblNewLabel_6);
					    				 
					    				 JLabel lblNewLabel_1 = new JLabel("아이디");
					    				 lblNewLabel_1.setBounds(107, 59, 68, 32);
					    				 lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
					    				 panel2.add(lblNewLabel_1);
					    				 frame7.getContentPane().add(lblNewLabel_1);
					    				 
					    				 JLabel lblNewLabel_2 = new JLabel("비밀번호");
					    				 lblNewLabel_2.setBounds(107, 125, 90, 32);
					    				 lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
					    				 panel2.add(lblNewLabel_2);
					    				 frame7.getContentPane().add(lblNewLabel_2);
					    				 
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
					    							 
					    						 }
					    						 
					    						
					    					 }
					    					 
					    				 });
					    				 frame7.setTitle("join");
					    				 frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					    				 create.setForeground(new Color(255, 255, 255));
					    				 create.setBackground(new Color(102, 102, 102));
					    				 create.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 frame7.getContentPane().add(create);
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
					    				 frame6.getContentPane().add(panel);
					    				 frame7.getContentPane().add(panel);
					    				 frame7.getContentPane().add(OpenWindow);
					    				 
					    				 JButton idchk = new JButton("중복체크[필수]");
					    				 idchk.setBounds(410, 55, 132, 36);
					    				 idchk.addActionListener(new ActionListener() {
					    					 public void actionPerformed(ActionEvent e) {
					    						 
					    						 String member_id = t1.getText();// id로 검색
					    						 MemberDAO dao = new MemberDAO();
					    						 try {
					    							 int result = dao.read(member_id);// 0이나 1이 리턴되어왔음.
					    							 if (result == 1) { 
					    								 JOptionPane.showMessageDialog(null, "중복아이디가 있습니다");
					    								 
					    							 } else {
					    								 JOptionPane.showMessageDialog(null, "중복아이디가 없습니다");
					    							 }
					    						 } catch (Exception e1) {
					    							 e1.printStackTrace();
					    						 }
					    						 
					    					 }
					    				 });
					    				 idchk.setForeground(new Color(255, 255, 255));
					    				 idchk.setBackground(new Color(102, 102, 102));
					    				 panel.add(idchk);
					    				 frame7.getContentPane().add(panel);
					    				 
					    				 
					    				 JButton pwchk = new JButton("비밀번호확인 [필수]");
					    				 pwchk.setBounds(409, 195, 149, 29);
					    				 pwchk.addActionListener(new ActionListener() {
					    					 public void actionPerformed(ActionEvent e) {
					    						 String member_pw = t2.getText();
					    						 String member_pwChk = t2Chk.getText();
					    						 
					    						 MemberDAO dao = new MemberDAO();
					    						 
					    						 try {
					    							 if (member_pw.equals(member_pwChk)) {
					    								 JOptionPane.showMessageDialog(null, "비밀번호입력이 같습니다");
					    							 } else {
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
					    				 frame7.getContentPane().add(panel);
					    				 

					    				 f.setVisible(true); // (3)
					    				 
					    				 OpenWindow.setForeground(new Color(255, 255, 255));
					    				 OpenWindow.setBackground(new Color(102, 102, 102));
					    				 OpenWindow.setFont(new Font("굴림", Font.PLAIN, 15));
					    				 
					    				 JPanel panel1 = new JPanel();
					    				 panel1.setBounds(111, 182, 583, 333);
					    				 panel1.setBorder(new LineBorder(new Color(102, 102, 102), 1, true));
					    				 frame6.getContentPane().setLayout(null);
					    				 
					    				 frame6.getContentPane().add(OpenWindow);
					    				 frame6.getContentPane().add(panel);
					    				 frame6.setVisible(true);
					    				 
					    				 panel2.setVisible(true);
					    			 }
					    		});
						                    
					    		frame6.getContentPane().add(panel);
					    		panel.setVisible(true);
					    		frame6.setVisible(true);
				    			}
					    		});
					   
					        
					   

				
			} if (mem[i].equals(mem[1])) {
				btn2.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						
						String adminpw1 = JOptionPane.showInputDialog(null, "관리자 비밀번호를 입력하시오.");
						int adminpw2 = Integer.parseInt(adminpw1);

						if (adminpw2 == 1234) {

							JTextField t1;
							JTextField t2;
							JTextField t3;
							JTextField t4;
							JTextField t6;

							JFrame frame1 = new JFrame();
							frame1.getContentPane().setBackground(new Color(204, 153, 153));
							frame1.setSize(500, 600);
							frame1.getContentPane().setLayout(null);

							JLabel title = new JLabel("상품정보입력");// 상품정보입력
							title.setFont(new Font("굴림", Font.BOLD, 25));
							title.setBounds(155, 15, 195, 30);
							frame1.getContentPane().add(title);

							JButton b1 = new JButton("상품번호");// 상품번호
							b1.setForeground(new Color(255, 255, 255));
							b1.setBackground(new Color(51, 51, 51));
							b1.setFont(new Font("굴림", Font.BOLD, 20));
							b1.setBounds(17, 88, 125, 29);
							frame1.getContentPane().add(b1);

							JButton b2 = new JButton("상품명");// 상품명
							b2.setForeground(Color.WHITE);
							b2.setFont(new Font("굴림", Font.BOLD, 20));
							b2.setBackground(new Color(51, 51, 51));
							b2.setBounds(17, 157, 125, 29);
							frame1.getContentPane().add(b2);

							JButton b3 = new JButton("색상");// 색상
							b3.setForeground(Color.WHITE);
							b3.setFont(new Font("굴림", Font.BOLD, 20));
							b3.setBackground(new Color(51, 51, 51));
							b3.setBounds(17, 222, 125, 29);
							frame1.getContentPane().add(b3);

							JButton b4 = new JButton("가격");// 가격
							b4.setForeground(Color.WHITE);
							b4.setFont(new Font("굴림", Font.BOLD, 20));
							b4.setBackground(new Color(51, 51, 51));
							b4.setBounds(17, 291, 125, 29);
							frame1.getContentPane().add(b4);

							JButton b6 = new JButton("수량");// 수량
							b6.setForeground(Color.WHITE);
							b6.setFont(new Font("굴림", Font.BOLD, 20));
							b6.setBackground(new Color(51, 51, 51));
							b6.setBounds(17, 362, 125, 29);
							frame1.getContentPane().add(b6);

							t1 = new JTextField();
							t1.setFont(new Font("굴림", Font.PLAIN, 20));
							t1.setBounds(188, 89, 259, 27);
							frame1.getContentPane().add(t1);
							t1.setColumns(10);

							t2 = new JTextField();
							t2.setFont(new Font("굴림", Font.PLAIN, 20));
							t2.setColumns(10);
							t2.setBounds(188, 158, 259, 27);
							frame1.getContentPane().add(t2);

							t3 = new JTextField();
							t3.setFont(new Font("굴림", Font.PLAIN, 20));
							t3.setColumns(10);
							t3.setBounds(188, 223, 259, 27);
							frame1.getContentPane().add(t3);

							t4 = new JTextField();
							t4.setFont(new Font("굴림", Font.PLAIN, 20));
							t4.setColumns(10);
							t4.setBounds(188, 292, 259, 27);
							frame1.getContentPane().add(t4);

							t6 = new JTextField();
							t6.setFont(new Font("굴림", Font.PLAIN, 20));
							t6.setColumns(10);
							t6.setBounds(188, 362, 259, 27);
							frame1.getContentPane().add(t6);

							JButton read = new JButton("검색");// 검색
							read.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {

									String product_id = t1.getText();
									ProductDAO dao = new ProductDAO();
									try {
										ProductVO bag = dao.read(product_id);
										t2.setText(bag.getProduct_name());
										t3.setText(bag.getProduct_color());
										t4.setText(String.valueOf(bag.getProduct_price()));
										t6.setText(String.valueOf(bag.getProduct_amount()));
									} catch (Exception e1) {
									}
								}
							});
							read.setForeground(Color.BLACK);
							read.setFont(new Font("굴림", Font.BOLD, 24));
							read.setBackground(new Color(102, 102, 102));
							read.setBounds(17, 448, 102, 47);
							frame1.getContentPane().add(read);

							JButton delete = new JButton("삭제");// 삭제
							delete.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String product_id = t1.getText();
									String product_name = t2.getText();
									String product_color = t3.getText();
									int product_price = Integer.parseInt(t4.getText());
									int product_amount = Integer.parseInt(t6.getText());

									ProductDAO dao = new ProductDAO();
									ProductVO bag = new ProductVO();

									bag.setProduct_id(product_id);
									bag.setProduct_name(product_name);
									bag.setProduct_color(product_color);
									bag.setProduct_price(product_price);
									bag.setProduct_amount(product_amount);

									try {
										dao.delete(bag);
									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							});
							delete.setForeground(Color.BLACK);
							delete.setFont(new Font("굴림", Font.BOLD, 24));
							delete.setBackground(new Color(102, 102, 102));
							delete.setBounds(131, 448, 102, 47);
							frame1.getContentPane().add(delete);

							JButton update = new JButton("수정");// 수정
							update.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String product_id = t1.getText();
									String product_name = t2.getText();
									String product_color = t3.getText();
									int product_price = Integer.parseInt(t4.getText());
									int product_amount = Integer.parseInt(t6.getText());

									ProductDAO dao = new ProductDAO();
									ProductVO bag = new ProductVO();

									bag.setProduct_id(product_id);
									bag.setProduct_name(product_name);
									bag.setProduct_color(product_color);
									bag.setProduct_price(product_price);
									bag.setProduct_amount(product_amount);

									try {
										dao.update(bag);
									} catch (Exception e1) {
										e1.printStackTrace();
									}
								}

							});
							update.setForeground(Color.BLACK);
							update.setFont(new Font("굴림", Font.BOLD, 24));
							update.setBackground(new Color(102, 102, 102));
							update.setBounds(248, 448, 102, 47);
							frame1.getContentPane().add(update);

							JButton create = new JButton("저장");// 저장
							create.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String product_id = t1.getText();
									String product_name = t2.getText();
									String product_color = t3.getText();
									int product_price = Integer.parseInt(t4.getText());
									int product_amount = Integer.parseInt(t6.getText());

									ProductDAO dao = new ProductDAO();
									ProductVO bag = new ProductVO();

									bag.setProduct_id(product_id);
									bag.setProduct_name(product_name);
									bag.setProduct_color(product_color);
									bag.setProduct_price(product_price);
									bag.setProduct_amount(product_amount);

									try {
										dao.create(bag);
									} catch (Exception e1) {
										e1.printStackTrace();
									}
								}
							});

							create.setForeground(Color.BLACK);
							create.setFont(new Font("굴림", Font.BOLD, 24));
							create.setBackground(new Color(102, 102, 102));
							create.setBounds(362, 448, 102, 47);
							frame1.getContentPane().add(create);
							frame1.setResizable(false);

							frame1.setVisible(true);
							frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						} else {
							JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요!");
						}

					}

				});
			}

	}

		String[] menubar = { "소파/거실", "침실", "드레스룸", "행거" };

		for (int i = 0; i < 4; i++) {
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.gray);
			FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
			flowLayout.setVgap(10);
			flowLayout.setHgap(10);
			f.getContentPane().add(panel2);
			JButton btn3 = new JButton(menubar[i]);
			panel2.add(btn3);

			btn3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

				}
			});
		}

		for (int i = 1; i < 7; i++) {
			JPanel panel3 = new JPanel();
			panel3.setBackground(Color.lightGray);
			FlowLayout flowLayout = (FlowLayout) panel3.getLayout();
			flowLayout.setVgap(5);// 세로
			flowLayout.setHgap(20);// 가로
			f.getContentPane().add(panel3);
			JButton btn3 = new JButton();
			ImageIcon icon = new ImageIcon("sofa" + i + ".jpg");
			btn3.setIcon(icon);
			panel3.add(btn3);
			JLabel name = new JLabel("Sofa" + i);
			name.setFont(new Font("Serif", Font.BOLD, 30));
			panel3.add(name);

			if (i == 1) {
				btn3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
								
						JTextField t1;
						JTextField t2;
						JTextField t3;

						JFrame frame5 = new JFrame();
						frame5.getContentPane().setBackground(new Color(204, 153, 153));
						frame5.setSize(800, 800);
						frame5.setTitle("상품정보");
						frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						frame5.getContentPane().setLayout(null);

						t1 = new JTextField();
						t1.setBounds(548, 251, 109, 35);
						t1.setFont(new Font("굴림", Font.BOLD, 18));
						t1.setColumns(10);
						frame5.getContentPane().add(t1);

						t2 = new JTextField();
						t2.setBounds(548, 306, 109, 35);
						t2.setFont(new Font("굴림", Font.BOLD, 18));
						t2.setColumns(10);
						frame5.getContentPane().add(t2);

						t3 = new JTextField();
						t3.setBounds(548, 382, 78, 35);
						t3.setFont(new Font("굴림", Font.BOLD, 18));
						t3.setColumns(10);
						frame5.getContentPane().add(t3);
						
						
						JLabel p_id = new JLabel("s100");
						JLabel o_id = new JLabel("o100");
						o_id.setBounds(130, 221, 78, 21);
						o_id.setFont(new Font("굴림", Font.BOLD, 15));
						frame5.getContentPane().add(o_id);

						JButton pay = new JButton("결제하기");
						pay.setFont(new Font("굴림", Font.BOLD, 22));
						pay.setBounds(550, 600, 200, 35);
						
//								pay.addActionListener(new ActionListener() {
//									public void actionPerformed(ActionEvent e) {
//										String order_id = o_id.getText();
//										String product_id = p_id.getText();
//										String product_name = t1.getText();
//										String product_color = t2.getText();
//										int product_price = Integer.parseInt(t3.getText());
//										
//										OrderDAO dao = new OrderDAO();
//										OrderVO bag = new OrderVO();
//
//										bag.setOrder_id(order_id);
//										bag.setProduct_id(product_id);
//										bag.setProduct_name(product_name);
//										bag.setProduct_color(product_color);
//										bag.setProduct_price(product_price);
//
//
//										try {
//											dao.pay(bag);
//										} catch (Exception e1) {
//											e1.printStackTrace();
//										}
//									}
//								});
//
//								pay.setForeground(Color.BLACK);
//								pay.setFont(new Font("굴림", Font.BOLD, 24));
//								pay.setBackground(new Color(102, 102, 102));
//								pay.setBounds(500, 600, 182, 47);
//								frame5.getContentPane().add(pay);
//								frame5.setResizable(false);
//
//								frame5.setVisible(true);
//								frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//						
						pay.setBackground(new Color(102, 102, 102));
						pay.setForeground(new Color(255, 255, 255));

						JButton btnImg1 = new JButton();
						ImageIcon img = new ImageIcon("sofa1.jpg");
						btnImg1.setIcon(img);
						frame5.getContentPane().add(btnImg1);
						btnImg1.setBounds(62, 251, 230, 230);

						JLabel lblNewLabel_2 = new JLabel("상품명");
						lblNewLabel_2.setBounds(370, 251, 75, 35);
						lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_3 = new JLabel("상품색상");
						lblNewLabel_3.setBounds(370, 301, 120, 34);
						lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_4 = new JLabel("배송비");
						lblNewLabel_4.setBounds(370, 339, 78, 35);
						lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_6 = new JLabel("가격");
						lblNewLabel_6.setBounds(370, 384, 80, 31);
						lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel label = new JLabel("무료배송");
						label.setBounds(548, 349, 76, 25);

						JLabel title = new JLabel("Furniture Shop");
						title.setBounds(235, 64, 300, 56);
						title.setFont(new Font("Serif", Font.BOLD, 40));

						
						p_id.setBounds(67, 221, 78, 21);
						p_id.setFont(new Font("굴림", Font.BOLD, 15));
						frame5.getContentPane().add(p_id);

						JLabel lblNewLabel_1 = new JLabel("만원");
						lblNewLabel_1.setBounds(636, 389, 78, 21);

						JButton read = new JButton("상품정보 보기");
						read.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String product_id = p_id.getText();
								OrderDAO dao = new OrderDAO();
								try {
									OrderVO bag = dao.read(product_id);
									p_id.setText(bag.getProduct_id());
									t1.setText(bag.getProduct_name());
									t2.setText(bag.getProduct_color());
									t3.setText(String.valueOf(bag.getProduct_price()));

								} catch (Exception e1) {
								}
							}
						});
						read.setForeground(Color.BLACK);
						read.setFont(new Font("굴림", Font.BOLD, 18));
						read.setBackground(new Color(102, 102, 102));
						read.setBounds(70, 500, 180, 40);
						frame5.getContentPane().add(read);
						frame5.getContentPane().setLayout(null);
						frame5.getContentPane().add(btnImg1);
						frame5.getContentPane().add(lblNewLabel_4);
						frame5.getContentPane().add(lblNewLabel_6);
						frame5.getContentPane().add(lblNewLabel_2);
						frame5.getContentPane().add(label);
						frame5.getContentPane().add(lblNewLabel_3);
						frame5.getContentPane().add(pay);
						frame5.getContentPane().add(title);
						frame5.getContentPane().add(lblNewLabel_1);
						frame5.setResizable(false);

						frame5.setVisible(true);

					}

				});
			} 
						
						
						else if (i == 2) {

				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JTextField t1;
						JTextField t2;
						JTextField t3;

						JFrame frame5 = new JFrame();
						frame5.getContentPane().setBackground(new Color(204, 153, 153));
						frame5.setSize(800, 800);
						frame5.setTitle("상품정보");
						frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						frame5.getContentPane().setLayout(null);

						t1 = new JTextField();
						t1.setBounds(548, 251, 109, 35);
						t1.setFont(new Font("굴림", Font.BOLD, 18));
						t1.setColumns(10);
						frame5.getContentPane().add(t1);

						t2 = new JTextField();
						t2.setBounds(548, 306, 109, 35);
						t2.setFont(new Font("굴림", Font.BOLD, 18));
						t2.setColumns(10);
						frame5.getContentPane().add(t2);

						t3 = new JTextField();
						t3.setBounds(548, 382, 78, 35);
						t3.setFont(new Font("굴림", Font.BOLD, 18));
						t3.setColumns(10);
						frame5.getContentPane().add(t3);

						JButton pay = new JButton("결제하기");
						pay.setFont(new Font("굴림", Font.PLAIN, 25));
						pay.setBounds(537, 600, 160, 35);
						pay.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								

							}
						});
						pay.setBackground(new Color(102, 102, 102));
						pay.setForeground(new Color(255, 255, 255));

						JButton btnImg1 = new JButton();
						ImageIcon img = new ImageIcon("sofa2.jpg");
						btnImg1.setIcon(img);
						frame5.getContentPane().add(btnImg1);
						btnImg1.setBounds(62, 251, 230, 230);

						JLabel lblNewLabel_2 = new JLabel("상품명");
						lblNewLabel_2.setBounds(370, 251, 75, 35);
						lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_3 = new JLabel("상품색상");
						lblNewLabel_3.setBounds(370, 301, 120, 34);
						lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_4 = new JLabel("배송비");
						lblNewLabel_4.setBounds(370, 339, 78, 35);
						lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_6 = new JLabel("가격");
						lblNewLabel_6.setBounds(370, 384, 80, 31);
						lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel label = new JLabel("무료배송");
						label.setBounds(548, 349, 76, 25);

						JLabel title = new JLabel("Furniture Shop");
						title.setBounds(235, 64, 300, 56);
						title.setFont(new Font("Serif", Font.BOLD, 40));

						JLabel p_id = new JLabel("s101");
						p_id.setBounds(67, 221, 78, 21);
						p_id.setFont(new Font("굴림", Font.BOLD, 20));
						frame5.getContentPane().add(p_id);

						JLabel lblNewLabel_1 = new JLabel("만원");
						lblNewLabel_1.setBounds(636, 389, 78, 21);

						JButton read = new JButton("상품정보 보기");
						read.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String product_id = p_id.getText();
								OrderDAO dao = new OrderDAO();
								try {
									OrderVO bag = dao.read(product_id);
									p_id.setText(bag.getProduct_id());
									t1.setText(bag.getProduct_name());
									t2.setText(bag.getProduct_color());
									t3.setText(String.valueOf(bag.getProduct_price()));

								} catch (Exception e1) {
								}
							}
						});
						read.setForeground(Color.BLACK);
						read.setFont(new Font("굴림", Font.BOLD, 18));
						read.setBackground(new Color(102, 102, 102));
						read.setBounds(70, 500, 180, 40);
						frame5.getContentPane().add(read);
						frame5.getContentPane().setLayout(null);
						frame5.getContentPane().add(btnImg1);
						frame5.getContentPane().add(lblNewLabel_4);
						frame5.getContentPane().add(lblNewLabel_6);
						frame5.getContentPane().add(lblNewLabel_2);
						frame5.getContentPane().add(label);
						frame5.getContentPane().add(lblNewLabel_3);
						frame5.getContentPane().add(pay);
						frame5.getContentPane().add(title);
						frame5.getContentPane().add(lblNewLabel_1);
						frame5.setResizable(false);

						frame5.setVisible(true);

					}
				});

			} else if (i == 3) {
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JTextField t1;
						JTextField t2;
						JTextField t3;

						JFrame frame5 = new JFrame();
						frame5.getContentPane().setBackground(new Color(204, 153, 153));
						frame5.setSize(800, 800);
						frame5.setTitle("상품정보");
						frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						frame5.getContentPane().setLayout(null);

						t1 = new JTextField();
						t1.setBounds(548, 251, 109, 35);
						t1.setFont(new Font("굴림", Font.BOLD, 18));
						t1.setColumns(10);
						frame5.getContentPane().add(t1);

						t2 = new JTextField();
						t2.setBounds(548, 306, 109, 35);
						t2.setFont(new Font("굴림", Font.BOLD, 18));
						t2.setColumns(10);
						frame5.getContentPane().add(t2);

						t3 = new JTextField();
						t3.setBounds(548, 382, 78, 35);
						t3.setFont(new Font("굴림", Font.BOLD, 18));
						t3.setColumns(10);
						frame5.getContentPane().add(t3);

						JButton pay = new JButton("결제하기");
						pay.setFont(new Font("굴림", Font.PLAIN, 25));
						pay.setBounds(537, 600, 160, 35);
						pay.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

							}
						});
						pay.setBackground(new Color(102, 102, 102));
						pay.setForeground(new Color(255, 255, 255));

						JButton btnImg1 = new JButton();
						ImageIcon img = new ImageIcon("sofa3.jpg");
						btnImg1.setIcon(img);
						frame5.getContentPane().add(btnImg1);
						btnImg1.setBounds(62, 251, 230, 230);

						JLabel lblNewLabel_2 = new JLabel("상품명");
						lblNewLabel_2.setBounds(370, 251, 75, 35);
						lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_3 = new JLabel("상품색상");
						lblNewLabel_3.setBounds(370, 301, 120, 34);
						lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_4 = new JLabel("배송비");
						lblNewLabel_4.setBounds(370, 339, 78, 35);
						lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_6 = new JLabel("가격");
						lblNewLabel_6.setBounds(370, 384, 80, 31);
						lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel label = new JLabel("무료배송");
						label.setBounds(548, 349, 76, 25);

						JLabel title = new JLabel("Furniture Shop");
						title.setBounds(235, 64, 300, 56);
						title.setFont(new Font("Serif", Font.BOLD, 40));

						JLabel p_id = new JLabel("s102");
						p_id.setBounds(67, 221, 78, 21);
						p_id.setFont(new Font("굴림", Font.BOLD, 20));
						frame5.getContentPane().add(p_id);

						JLabel lblNewLabel_1 = new JLabel("만원");
						lblNewLabel_1.setBounds(636, 389, 78, 21);

						JButton read = new JButton("상품정보 보기");
						read.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String product_id = p_id.getText();
								OrderDAO dao = new OrderDAO();
								try {
									OrderVO bag = dao.read(product_id);
									p_id.setText(bag.getProduct_id());
									t1.setText(bag.getProduct_name());
									t2.setText(bag.getProduct_color());
									t3.setText(String.valueOf(bag.getProduct_price()));

								} catch (Exception e1) {
								}
							}
						});
						read.setForeground(Color.BLACK);
						read.setFont(new Font("굴림", Font.BOLD, 18));
						read.setBackground(new Color(102, 102, 102));
						read.setBounds(70, 500, 180, 40);
						frame5.getContentPane().add(read);
						frame5.getContentPane().setLayout(null);
						frame5.getContentPane().add(btnImg1);
						frame5.getContentPane().add(lblNewLabel_4);
						frame5.getContentPane().add(lblNewLabel_6);
						frame5.getContentPane().add(lblNewLabel_2);
						frame5.getContentPane().add(label);
						frame5.getContentPane().add(lblNewLabel_3);
						frame5.getContentPane().add(pay);
						frame5.getContentPane().add(title);
						frame5.getContentPane().add(lblNewLabel_1);
						frame5.setResizable(false);

						frame5.setVisible(true);

					}
				});

			} else if (i == 4) {
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JTextField t1;
						JTextField t2;
						JTextField t3;

						JFrame frame5 = new JFrame();
						frame5.getContentPane().setBackground(new Color(204, 153, 153));
						frame5.setSize(800, 800);
						frame5.setTitle("상품정보");
						frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						frame5.getContentPane().setLayout(null);

						t1 = new JTextField();
						t1.setBounds(548, 251, 109, 35);
						t1.setFont(new Font("굴림", Font.BOLD, 18));
						t1.setColumns(10);
						frame5.getContentPane().add(t1);

						t2 = new JTextField();
						t2.setBounds(548, 306, 109, 35);
						t2.setFont(new Font("굴림", Font.BOLD, 18));
						t2.setColumns(10);
						frame5.getContentPane().add(t2);

						t3 = new JTextField();
						t3.setBounds(548, 382, 78, 35);
						t3.setFont(new Font("굴림", Font.BOLD, 18));
						t3.setColumns(10);
						frame5.getContentPane().add(t3);

						JButton pay = new JButton("결제하기");
						pay.setFont(new Font("굴림", Font.PLAIN, 25));
						pay.setBounds(537, 600, 160, 35);
						pay.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

							}
						});
						pay.setBackground(new Color(102, 102, 102));
						pay.setForeground(new Color(255, 255, 255));

						JButton btnImg1 = new JButton();
						ImageIcon img = new ImageIcon("sofa4.jpg");
						btnImg1.setIcon(img);
						frame5.getContentPane().add(btnImg1);
						btnImg1.setBounds(62, 251, 230, 230);

						JLabel lblNewLabel_2 = new JLabel("상품명");
						lblNewLabel_2.setBounds(370, 251, 75, 35);
						lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_3 = new JLabel("상품색상");
						lblNewLabel_3.setBounds(370, 301, 120, 34);
						lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_4 = new JLabel("배송비");
						lblNewLabel_4.setBounds(370, 339, 78, 35);
						lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel lblNewLabel_6 = new JLabel("가격");
						lblNewLabel_6.setBounds(370, 384, 80, 31);
						lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));

						JLabel label = new JLabel("무료배송");
						label.setBounds(548, 349, 76, 25);

						JLabel title = new JLabel("Furniture Shop");
						title.setBounds(235, 64, 300, 56);
						title.setFont(new Font("Serif", Font.BOLD, 40));

						JLabel p_id = new JLabel("s103");
						p_id.setBounds(67, 221, 78, 21);
						p_id.setFont(new Font("굴림", Font.BOLD, 20));
						frame5.getContentPane().add(p_id);

						JLabel lblNewLabel_1 = new JLabel("만원");
						lblNewLabel_1.setBounds(636, 389, 78, 21);

						JButton read = new JButton("상품정보 보기");
						read.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								String product_id = p_id.getText();
								OrderDAO dao = new OrderDAO();
								try {
									OrderVO bag = dao.read(product_id);
									p_id.setText(bag.getProduct_id());
									t1.setText(bag.getProduct_name());
									t2.setText(bag.getProduct_color());
									t3.setText(String.valueOf(bag.getProduct_price()));

								} catch (Exception e1) {
								}
							}
						});
						read.setForeground(Color.BLACK);
						read.setFont(new Font("굴림", Font.BOLD, 18));
						read.setBackground(new Color(102, 102, 102));
						read.setBounds(70, 500, 180, 40);
						frame5.getContentPane().add(read);
						frame5.getContentPane().setLayout(null);
						frame5.getContentPane().add(btnImg1);
						frame5.getContentPane().add(lblNewLabel_4);
						frame5.getContentPane().add(lblNewLabel_6);
						frame5.getContentPane().add(lblNewLabel_2);
						frame5.getContentPane().add(label);
						frame5.getContentPane().add(lblNewLabel_3);
						frame5.getContentPane().add(pay);
						frame5.getContentPane().add(title);
						frame5.getContentPane().add(lblNewLabel_1);
						frame5.setResizable(false);

						frame5.setVisible(true);

					}
				});

			}
			else if(i==5) {
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "상품 준비중입니다.");
					}
			});
			}
			else if(i==6) {
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "상품 준비중입니다.");
					}
			});
			}
		}

		f.setResizable(false);
		f.setSize(900, 900);
		f.setVisible(true);

	}

}
