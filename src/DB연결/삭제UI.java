package DB����;

import javax.swing.JOptionPane;

public class ����UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id����");
		
		
	 DB��������Ŭ���� db = new DB��������Ŭ����();
	 db.delete(id);

	}

}
