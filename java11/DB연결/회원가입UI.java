package DB����;

import javax.swing.JOptionPane;


public class ȸ������UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id�Է�");
		String pw = JOptionPane.showInputDialog("pw�Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");
		
	    DB��������Ŭ���� db = new DB��������Ŭ����();
	    db.create(id, pw , name , tel);
	}

}
