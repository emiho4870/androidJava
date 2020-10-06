package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	Connection con;

	public DAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/project2";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
	}
	
public boolean read(String id) throws Exception {
		
		String sql = "select * from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		

		ResultSet rs = ps.executeQuery();
		boolean result = false;// 로그인이 not!인 상태!
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			result = true; // 있음.
		} else {
		}
		rs.close();
		ps.close();
		con.close();
		
		return result;
	}

	public boolean read(String id, String pw) throws Exception {
		
		String sql = "select * from user where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		ResultSet rs = ps.executeQuery();
		boolean result = false;// 로그인이 not!인 상태!
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			result = true; // 있음.
		} else {
		}
		rs.close();
		ps.close();
		con.close();
		
		return result;
	}
}
