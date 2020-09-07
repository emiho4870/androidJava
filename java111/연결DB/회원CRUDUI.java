package 연결DB;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame(); 
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel ID = new JLabel("ID");
		ID.setBounds(154, 117, 57, 15);
		f.getContentPane().add(ID);
		
		JLabel PW = new JLabel("PW");
		PW.setBounds(154, 157, 57, 15);
		f.getContentPane().add(PW);
		
		JLabel NAME = new JLabel("NAME");
		NAME.setBounds(154, 205, 57, 15);
		f.getContentPane().add(NAME);
		
		JLabel TEL = new JLabel("TEL");
		TEL.setBounds(154, 260, 57, 15);
		f.getContentPane().add(TEL);
		
		t1 = new JTextField();
		t1.setBounds(242, 114, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(242, 154, 116, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(242, 202, 116, 21);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(242, 257, 116, 21);
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 회원가입할 정보 4개의 입력값을 가지고 와서
				 * DB처리(MemberDAO), create()메서드 호출
				 */
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id,pw,name,tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(142, 359, 97, 23);
		f.getContentPane().add(create);
		
		JButton read = new JButton("회원검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.read(id,pw,name,tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		read.setBounds(261, 359, 97, 23);
		f.getContentPane().add(read);
		
		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(id,tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		update.setBounds(142, 408, 97, 23);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = t1.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete.setBounds(261, 408, 97, 23);
		f.getContentPane().add(delete);
		f.setVisible(true);
	}
}
