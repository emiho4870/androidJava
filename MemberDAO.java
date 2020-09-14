package project;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MemberDAO {
	
	/*
	 * 회원가입 : create
	 */
	public void create(MemberVO vo) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);


		String sql = "insert into shop_member values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getMember_id());
		ps.setString(2, vo.getMember_pw());
		ps.setString(3, vo.getMember_name());
		ps.setString(4, vo.getMember_tel_no());
		ps.setString(5, vo.getMember_address());
		
		System.out.println("회원가입 요청");

		ps.executeUpdate();
		System.out.println("회원가입 완료");

	}

	
	/*
	 * ID중복체크
	 */
	public int read(String member_id) throws Exception {
		
		/*
		 * id를 읽어서 result 0 / 1 에 따라 int형으로 결과반환
		 */
		
		
		Class.forName("com.mysql.jdbc.Driver");

		
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "select * from shop_member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		/*
		 * VO연결아님
		 */

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		int result = 0;// 없음.
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			// if(rs.next())와 동일함.
			// if문은 rs.next()가 true때만 실행되므로!
			System.out.println("검색결과가 있어요.");
			result = 1; // 있음.
//			rs.getInt("no");//정수 가지고 올때
//			rs.getDouble("num");//실수 가지고 올때
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		return result;
		// 0이 넘어가면, 검색결과 없음.
		// 1이 넘어가면, 검색결과 있음.
	}

	/*
	 *  id, pw맞는지 로그인 처리
	 */
	public boolean read(String member_id, String member_pw) throws Exception {
//		 DB프로그램 절차에 맞추어서 코딩
//		 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		// 2. db연결
//				String url = "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		// 3. sql문을 만든다.(create)
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ps.setString(2, member_pw);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		boolean result = false;// 로그인이 not!인 상태!
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok.");
			result = true; // 있음.
		} else {
			System.out.println("로그인 not.");
		}
		return result;
		// false면 로그인not.
		// true면 로그인ok.
	}
	
	/*
	 * 회원정보수정 : update
	 */
	public void update(MemberVO vo) throws Exception {
	
	
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "update shop_member set member_id = ? , member_pw = ? , member_name = ? , member_tel_no = ? , member_address = ? where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getMember_id());
		ps.setString(2, vo.getMember_pw());
		ps.setString(3, vo.getMember_name());
		ps.setString(4, vo.getMember_tel_no());
		ps.setString(5, vo.getMember_address());
		System.out.println("회원정보 수정 요청");

		ps.executeUpdate();
		System.out.println("회원정보 수정 완료");
	}

	/*
	 * 회원탈퇴
	 */
	public void delete(MemberVO vo) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "delete from shop_member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getMember_id());
		System.out.println("회원탈퇴 요청");

		ps.executeUpdate();
		System.out.println("회원탈퇴 성공");
	}
}
