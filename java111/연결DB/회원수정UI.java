
package ����DB;

import javax.swing.JOptionPane;


public class ȸ������UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("������ tel�Է�");
		String id = JOptionPane.showInputDialog("�˻��� id�Է�");
		
	    MemberDAO db = new MemberDAO();
	    db.update(tel ,id);
	    
	    
	}

}