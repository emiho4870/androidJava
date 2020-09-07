
package 연결DB;

import javax.swing.JOptionPane;


public class 회원수정UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("수정할 tel입력");
		String id = JOptionPane.showInputDialog("검색할 id입력");
		
	    MemberDAO db = new MemberDAO();
	    db.update(tel ,id);
	    
	    
	}

}