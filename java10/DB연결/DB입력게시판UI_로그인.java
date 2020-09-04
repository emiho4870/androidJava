package DB연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB입력게시판UI_로그인 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		String member_no = JOptionPane.showInputDialog("고객번호");
		int member_no1 = Integer.parseInt(member_no);
		String name = JOptionPane.showInputDialog("성명");
		String address = JOptionPane.showInputDialog("주소");
		String tel_no = JOptionPane.showInputDialog("전화번호");
		int tel_no1 = Integer.parseInt(tel_no);
		String gender = JOptionPane.showInputDialog("성별");
		DB처리게시판전담_로그인 db = new DB처리게시판전담_로그인();
		db.create( member_no1 , name , address , tel_no1 , gender );
		
		
		/*
		 * 
		+-----------+--------+---------+------------+--------+
		| member_no | name   | address | tel_no     | gender |
		+-----------+--------+---------+------------+--------+
		| 002001    | 김제니 | 서울    | 1058553657 | 여     |
		| 002002    | 김아린 | 서울    | 1054979357 | 여     |
		+-----------+--------+---------+------------+--------+
		 * 
		 */
	}

}
