package DB연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB입력UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("PW입력");
		String name = JOptionPane.showInputDialog("NAM입력");
		String tel = JOptionPane.showInputDialog("TEL입력");
		DB처리전담 db = new DB처리전담();
		db.create(id , pw , name , tel );
	}

}
