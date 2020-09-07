
package 연결DB;

import javax.swing.JOptionPane;


public class 회원검색UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
	    MemberDAO db = new MemberDAO();
	    db.read(id, pw , name , tel);
	    
	    
	}

}