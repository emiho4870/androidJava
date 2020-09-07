package ����DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import jdk.tools.jlink.internal.plugins.ClassForNamePlugin;

public class MemberDAO {
	public void create(String id, String pw, String name, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���Ἲ��.!!");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		String sql = "insert into member values ('?','?','?','?')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql���� ����.!!");

		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");

	}

	public void read(String id, String pw, String name, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���Ἲ��.!!");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		String sql = "insert into member values ('?','?','?','?')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. sql���� ����.!!");

		ps.executeUpdate();
//		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");

	}

	public void update(String tel, String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���Ἲ��.!!");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql���� ����.!!");

		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");

	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connectior ���Ἲ��.!!");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql���� ����.!!");

		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");

	}
}