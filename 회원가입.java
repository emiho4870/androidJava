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

public class ȸ������ {
	
	
//	�α���������() {
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

	public static void main(String[] args) {//�⺻������
		// TODO Auto-generated method stub
		
		/*
		 * ��й�ȣ�� �ٽ��Է��Ͽ��ּ���
		 */

		
				JFrame f = new JFrame(); //(1)
				f.getContentPane().setBackground(new Color(204, 153, 153));
				f.getContentPane().setFont(new Font("������", Font.PLAIN, 12));
				f.setSize(1000,1000);
				
				JLabel lblNewLabel = new JLabel("Furniture Shop Join");
				lblNewLabel.setBounds(308, 42, 352, 56);
				lblNewLabel.setBackground(Color.GRAY);
				lblNewLabel.setFont(new Font("Serif", Font.BOLD, 40));
				f.getContentPane().setLayout(null);
				f.getContentPane().add(lblNewLabel);
				
				JPanel panel = new JPanel();
				panel.setBounds(196, 178, 614, 553);
				f.getContentPane().add(panel);
				
				t1 = new JTextField();
				t1.setBounds(247, 55, 150, 36);
				t1.setFont(new Font("����", Font.PLAIN, 15));
				t1.setText("���̵� �Է�");
				t1.setColumns(10);
				
				t2 = new JTextField();
				t2.setBounds(247, 127, 150, 32);
				t2.setFont(new Font("����", Font.PLAIN, 15));
				t2.setText("��й�ȣ �Է�");
				t2.setColumns(10);
				
				t2Chk = new JTextField();
				t2Chk.setBounds(247, 194, 150, 32);
				t2Chk.setFont(new Font("����", Font.PLAIN, 15));
				t2Chk.setText("��й�ȣ Ȯ��");
				t2Chk.setColumns(10);
				
				t3 = new JTextField();
				t3.setBounds(248, 276, 116, 32);
				t3.setFont(new Font("����", Font.PLAIN, 15));
				t3.setText("�̸� �Է�");
				t3.setColumns(10);
				
				t4 = new JTextField();
				t4.setBounds(247, 330, 116, 32);
				t4.setFont(new Font("����", Font.PLAIN, 15));
				t4.setText("����ó �Է�");
				t4.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("10�� �̻�, ���� ��ҹ��� , ���� �� 2���� �̻� ����");
				lblNewLabel_6.setBounds(248, 169, 294, 15);
				
				JLabel lblNewLabel_1 = new JLabel("���̵�");
				lblNewLabel_1.setBounds(107, 59, 68, 32);
				lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 20));
				
				JLabel lblNewLabel_2 = new JLabel("��й�ȣ");
				lblNewLabel_2.setBounds(107, 125, 90, 32);
				lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 20));
				
				JLabel lblNewLabel_3 = new JLabel("��й�ȣ Ȯ��");
				lblNewLabel_3.setBounds(107, 192, 127, 37);
				lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 20));
				
				JLabel lblNewLabel_4 = new JLabel("�̸�");
				lblNewLabel_4.setBounds(106, 274, 68, 37);
				lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 20));
				
				JLabel lblNewLabel_5 = new JLabel("����ó");
				lblNewLabel_5.setBounds(106, 335, 69, 29);
				lblNewLabel_5.setFont(new Font("����", Font.PLAIN, 20));
				
				JLabel label = new JLabel("�ּ�");
				label.setBounds(106, 383, 69, 32);
				label.setFont(new Font("����", Font.PLAIN, 20));
				
				t5 = new JTextField();
				t5.setBounds(248, 383, 234, 32);
				t5.setFont(new Font("����", Font.PLAIN, 15));
				t5.setText("�ּ��Է�");
				t5.setColumns(10);
				
				
				/*
				 * ���̵��ߺ�üũbtn
				 * ��й�ȣ�Էµ��Ͽ���
				 * �׸������������Է¿�û
				 */
				JButton create = new JButton("ȸ������");
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
							JOptionPane.showMessageDialog(null,"ȸ�������� �Ǿ����ϴ�");
						} catch (Exception e1) {
//		
								
							}
							
							/*
							 * catch : ���̵�btn : ��й�ȣbtn : ��üũ�� Ȯ�ο�ûâ
							 */
						}		
					
				});
				f.setTitle("join");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				create.setForeground(new Color(255, 255, 255));
				create.setBackground(new Color(102, 102, 102));
				create.setFont(new Font("����", Font.PLAIN, 15));
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
				
				JButton idchk = new JButton("�ߺ�üũ[�ʼ�]");
				idchk.setBounds(410, 55, 132, 36);
				idchk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
								String member_id = t1.getText();//id�� �˻�
								MemberDAO dao = new MemberDAO();
								try {
									int result = dao.read(member_id);//0�̳� 1�� ���ϵǾ����.
									if (result == 1) { //�˻������ ����.
										t1Chk.setText("�ߺ����̵��ֽ��ϴ�");
										t1Chk.setForeground(Color.red);
										
									}else {//�˻������ ����.
										t1Chk.setText("�ߺ����̵𰡾����ϴ�");
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
				t1Chk.setText("*\uC544\uC774\uB514\uC911\uBCF5 \uC5EC\uBD80");
				t1Chk.setBounds(248, 96, 149, 21);
				panel.add(t1Chk);
				t1Chk.setColumns(10);
				
				JButton pwchk = new JButton("��й�ȣȮ�� [�ʼ�]");
				pwchk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String member_pw = t2.getText();
						String member_pwChk = t2Chk.getText();
						
						MemberDAO dao = new MemberDAO();
						
						try {
							if(member_pw != member_pwChk) {
								pwchkchk.setText("��й�ȣ�Է��� �����ϴ�");
								pwchkchk.setForeground(Color.red);
							}else {
								pwchkchk.setText("��й�ȣ�Է��� �ٸ��ϴ�");
								
							}
							
						} catch (Exception e2) {
							e2.printStackTrace();
						}
						
						/*
						 * return : != : 
						 * ��й�ȣreturn
						 * ��й�ȣ10�ڸ��Է�length
						 */
					}
				});
				pwchk.setForeground(Color.WHITE);
				pwchk.setBackground(new Color(102, 102, 102));
				pwchk.setBounds(409, 195, 149, 29);
				panel.add(pwchk);
				
				pwchkchk = new JTextField();
				pwchkchk.setText("*\uBE44\uBC00\uBC88\uD638\uD655\uC778");
				pwchkchk.setColumns(10);
				pwchkchk.setBounds(248, 236, 149, 21);
				panel.add(pwchkchk);
				//FlowLayout flow = new FlowLayout();
				//f.getContentPane().setLayout(flow);
				f.setVisible(true); //(3)
				
	}
}
