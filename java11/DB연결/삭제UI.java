package DB연결;

import javax.swing.JOptionPane;

public class 삭제UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("id삭제");
		
		
	 DB연결전담클래스 db = new DB연결전담클래스();
	 db.delete(id);

	}

}
