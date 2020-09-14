
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class MemberDAO {

	public void create(MemberVO vo) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//		String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/furniture_shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "insert into shop_member values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getMember_id());
		ps.setString(2, vo.getMember_pw());
		ps.setString(3, vo.getMember_pwChk());
		ps.setString(4, vo.getMember_name());
		ps.setString(5, vo.getMember_tel_no());
		ps.setString(6, vo.getMember_address());
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");

	}

	public int read2(String member_id) throws Exception {
//		 DB���α׷� ������ ���߾ �ڵ�
//		 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//				String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/furniture_shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "select * from shop_member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		System.out.println("3. SQL�� ���� ����.!!");

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");

		ResultSet rs = ps.executeQuery();
		int result = 0;// ����.
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			// if(rs.next())�� ������.
			// if���� rs.next()�� true���� ����ǹǷ�!
			System.out.println("�˻������ �־��.");
			result = 1; // ����.
			String member_id2 = rs.getString("member_id");
			String member_pw = rs.getString("member_pw");
			System.out.println("�˻���� id: " + member_id2);
			System.out.println("�˻���� pw: " + member_pw);
		} else {
			System.out.println("�˻������ �����.");
		}
		return result;
		// 0�� �Ѿ��, �˻���� ����.
		// 1�� �Ѿ��, �˻���� ����.
	}

	public void update(String tel, String id) throws Exception {
		// DB���α׷� ������ ���߾ �ڵ�
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//				String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
	}

	public void delete(String id) throws Exception {
//		DB���α׷� ������ ���߾ �ڵ�
//				1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//			   String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
	}

	/*
	 * ���̵��ߺ�üũ �α��μ���
	 */

	/*
	 * id�ߺ�üũ
	 */
	public int read(String member_id) throws Exception {
//			 DB���α׷� ������ ���߾ �ڵ�
//			 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//					String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/furniture_shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "select * from shop_member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		int result = 0;// ����.
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			// if(rs.next())�� ������.
			// if���� rs.next()�� true���� ����ǹǷ�!
			System.out.println("�˻������ �־��.");
			result = 1; // ����.
//				rs.getInt("no");//���� ������ �ö�
//				rs.getDouble("num");//�Ǽ� ������ �ö�
			String member_id2 = rs.getString("member_id");
			String member_pw = rs.getString("member_pw");
			System.out.println("�˻���� id: " + member_id2);
			System.out.println("�˻���� pw: " + member_pw);
		} else {
			System.out.println("�˻������ �����.");
		}
		return result;
		// 0�� �Ѿ��, �˻���� ����.
		// 1�� �Ѿ��, �˻���� ����.
	}

	/*
	 * id, pw �α��� ó�� : boolean : MEMBER : true : false
	 */

	public boolean read(String member_id, String member_pw) throws Exception {
//			 DB���α׷� ������ ���߾ �ڵ�
//			 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
//					String url = "�����ϴ¹��://ip:port/db��";
		String url = "jdbc:mysql://localhost:3366/furniture_shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.(create)
		String sql = "select * from shop_member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ps.setString(2, member_pw);

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		boolean result = false;// �α����� not!�� ����!
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			System.out.println("�α��� ok.");
			result = true; // ����.
		} else {
			System.out.println("�α��� not.");
		}
		return result;
		// false�� �α���not.
		// true�� �α���ok.
	}

	/*
	 * ���̵��ߺ�üũ �α��μ���
	 */

}
