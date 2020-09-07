package 연결DB;

import javax.swing.JOptionPane;

public class 회원삭제UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id삭제");
		
		
	 MemberDAO db = new MemberDAO();
	 db.delete(id);

	}

}