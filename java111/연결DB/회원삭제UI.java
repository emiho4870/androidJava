package ����DB;

import javax.swing.JOptionPane;

public class ȸ������UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id����");
		
		
	 MemberDAO db = new MemberDAO();
	 db.delete(id);

	}

}