package DB연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB입력게시판UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		String title = JOptionPane.showInputDialog("타이틀입력");
		String content = JOptionPane.showInputDialog("콘텐츠입력");
		String writer = JOptionPane.showInputDialog("작가입력");
		DB처리게시판전담 db = new DB처리게시판전담();
		db.create(  title , content , writer);
	}

}
