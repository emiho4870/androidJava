
  
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

public class �α��� {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {//�⺻������
		// TODO Auto-generated method stub
		
//		�⺻����
//		JFrame f = new JFrame(); //(1)
//		f.setSize(1000,500); //(2)
//		//FlowLayout flow = new FlowLayout();
//		//f.getContentPane().setLayout(flow);
//		f.setVisible(true); //(3)
		
		/*
		 * ���̵� ��й�ȣ �� �߸��Է��Ͽ����ϴ� 
		 */
		
		
	
		JFrame f = new JFrame(); // (1)
		f.getContentPane().setBackground(new Color(204, 153, 153));
		f.getContentPane().setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		f.setSize(1000,1000); // (2)
		
		JLabel lblFurnitureshop = new JLabel("Furniture Shop Login");
		lblFurnitureshop.setForeground(new Color(51, 51, 51));
		lblFurnitureshop.setBounds(339, 105, 385, 70);
		lblFurnitureshop.setFont(new Font("Serif", Font.BOLD, 40));
		
		t1 = new JTextField();
		t1.setBounds(319, 298, 249, 46);
		t1.setText("���̵� �Է��ϼ���");
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(319, 350, 249, 47);
		t2.setText("��й�ȣ�� �Է��ϼ���");
		t2.setColumns(10);
		
		JButton logbtn = new JButton("�α���");
		logbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String member_id = t1.getText();
				String member_pw = t2.getText();
				
				MemberDAO dao = new MemberDAO();
				
				try {
					boolean result = dao.read(member_id,member_pw);
					if(result == true) {
						JOptionPane.showMessageDialog(null, "�α��μ���");
						
					}else {
						JOptionPane.showMessageDialog(null, "�α��ν���");
						
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		logbtn.setForeground(new Color(255, 255, 255));
		logbtn.setBackground(new Color(102, 102, 102));
		logbtn.setBounds(620, 296, 104, 101);
		logbtn.setFont(new Font("����", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("�����ȸ������ �����Ͻ� �� ���Ű� �����Ͻʴϴ�");
		lblNewLabel.setBounds(319, 513, 314, 18);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 15));
		
		JButton joinbtn = new JButton("ȸ������");
		joinbtn.setForeground(new Color(255, 255, 255));
		joinbtn.setBackground(new Color(102, 102, 102));
		joinbtn.setBounds(645, 509, 113, 27);
		joinbtn.setFont(new Font("����", Font.PLAIN, 15));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(lblFurnitureshop);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(logbtn);
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(joinbtn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(102, 102, 102), 1, true));
		panel.setBounds(236, 234, 583, 333);
		f.getContentPane().add(panel);
		f.setVisible(true); // (3)
		//FlowLayout flow = new FlowLayout();
		//f.getContentPane().setLayout(flow);
		
		
		
		
		

	}
}
