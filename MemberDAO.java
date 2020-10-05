package bean;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	Connection con;
	
	public MemberDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
	}
		public void create(MemberVO vo) throws Exception {
			

			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getTel());

			ps.executeUpdate();
			
			ps.close();
			con.close();
			

		}

		public void create(String id, String pw, String name, String tel) throws Exception {
			
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);

			ps.executeUpdate();
			ps.close();
			con.close();
			

		}

		public MemberVO one(String id) throws Exception {
			
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			MemberVO bag = new MemberVO();//가방만들어서,
			if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
				System.out.println("검색결과가 있어요.");
				String id2 = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				System.out.println("검색결과 id: " + id2);
				System.out.println("검색결과 pw: " + pw);
				System.out.println("검색결과 name: " + name);
				System.out.println("검색결과 tel: " + tel);
			} else {
				System.out.println("검색결과가 없어요.");
			}
			rs.close();
			ps.close();
			con.close();
			
			return bag;
		}
		public int read(String id) throws Exception {
			
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			int result = 0;// 없음.
			if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
				System.out.println("검색결과가 있어요.");
				result = 1; // 있음.
				String id2 = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				System.out.println("검색결과 id: " + id2);
				System.out.println("검색결과 pw: " + pw);
				System.out.println("검색결과 name: " + name);
				System.out.println("검색결과 tel: " + tel);
			} else {
				System.out.println("검색결과가 없어요11111.");
			}
			rs.close();
			ps.close();
			con.close();
			
			return result;
		}

		public boolean read(String id, String pw) throws Exception {
			
			String sql = "select * from member where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);

			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공.!!");
			boolean result = false;// 로그인이 not!인 상태!
			if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
				System.out.println("로그인 ok.");
				result = true; // 있음.
			} else {
				System.out.println("로그인 not.");
			}
			rs.close();
			ps.close();
			con.close();
			
			return result;
		}

		public void update(String tel, String id) throws Exception {
			

			String sql = "update member set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);

			ps.executeUpdate();
			
			ps.close();
			con.close();
			
		}

		public void delete(String id) throws Exception {
			

			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ps.executeUpdate();
			
			ps.close();
			con.close();
			
		}
}
