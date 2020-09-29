package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class boardDAO {

	String url = "jdbc:mysql://localhost:3366/barly?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;

	public boardDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결 성공.!!");
	}

	// 회원가입
	public boolean create(UserVO vo) throws Exception {// main이 없을시 실행이 안되므로 db 연결 확인을
		String sql = "insert into user_barly values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId_user());
		ps.setString(2, vo.getPw_user());
		ps.setString(3, vo.getName_user());
		ps.setString(4, vo.getEmail_user());
		ps.setString(5, vo.getTel_user());
		ps.setString(6, vo.getBirth_user());
		ps.setString(7, vo.getUser_postcode());
		ps.setString(8, vo.getUser_address());
		ps.setString(9, vo.getUser_detailAddress());
		ps.setString(10, vo.getUser_extraAddress());
		System.out.println("3. sql 생성 성공.!!");

		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	// 로그인
	public boolean login(String id_user, String pw_user) throws Exception {
		String sql = "select * from user_barly where id_user = ? and pw_user = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id_user);
		ps.setString(2, pw_user);
		System.out.println("3. sql 생성 성공.!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = false;// 로그인이 아닌 상태.
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok.");
			result = true;// 있음.
		} else {
			System.out.println("로그인 not.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// false면 로그인 not.
		// true면 로그인 ok.
	}

	// id 중복 체크 용
	public boolean idCheck(String id_user) throws Exception {
		String sql = "select * from user_barly where id_user =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id_user);
		System.out.println("3. sql 생성 성공.!!");
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = false;
		if (rs.next()) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			result = true;// 결과가 있음.
			String id_user2 = rs.getString("id_user");
//				String pw = rs.getString("pw");
//				String name = rs.getString("name");
//				String tel = rs.getString("tel");
			System.out.println("검색결과 id:" + id_user2);
//				System.out.println("검색결과 pw:" + pw);
//				System.out.println("검색결과 name:" + name);
//				System.out.println("검색결과 tel:" + tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// 0이 넘어가면, 검색결과가 없음.
		// 1이 넘어가면, 검색결과가 있음.
	}

	// 아이디 수정전 검색하여 데이터 불러오기
	public UserVO one(String id_user) throws Exception {

		String sql = "select * from user_barly where id_user=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id_user);
		System.out.println("3. sql 생성 성공.!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		UserVO bag = new UserVO();// 3.묶음 값을 꺼내주기 위해 객체 생성.
		if (rs.next() == true) {
			System.out.println("검색결과가 있어요.");
			// 4.쿼리를 통해 DB에서 받은 값을
			String id_user2 = rs.getString("id_user");
			String pw_user = rs.getString("pw_user");
			String name_user = rs.getString("name_user");
			String tel_user = rs.getString("tel_user");
			String email_user = rs.getString("email_user");
			String birth_user = rs.getString("birth_user");
			String user_postcode = rs.getString("user_postcode");
			String user_address = rs.getString("user_address");
			String user_detailAddress = rs.getString("user_detailAddress");
			String user_extraAddress = rs.getString("User_extraAddress");
			// 5. UserVO 클래스를 통해 가방에 넣기
			bag.setId_user(id_user2);
			bag.setPw_user(pw_user);
			bag.setName_user(name_user);
			;
			bag.setEmail_user(email_user);
			bag.setTel_user(tel_user);
			bag.setBirth_user(birth_user);
			bag.setUser_postcode(user_postcode);
			bag.setUser_address(user_address);
			bag.setUser_detailAddress(user_detailAddress);
			bag.setUser_extraAddress(user_extraAddress);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		// 6.bag은 참조형 변수에 넣은 값, 주소를 전달!
		return bag;// 7.userUpdate에 전달.
	}

	// 아이디 수정
	public boolean update(UserVO vo) throws Exception {
		String sql = "update user_barly set pw_user=?, name_user=?, email_user=?, tel_user=?, birth_user=?, user_postcode=?, user_address=?, user_detailAddress=?, User_extraAddress=? where id_user=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw_user());
		ps.setString(2, vo.getName_user());
		ps.setString(3, vo.getEmail_user());
		ps.setString(4, vo.getTel_user());
		ps.setString(5, vo.getBirth_user());
		ps.setString(6, vo.getUser_postcode());
		ps.setString(7, vo.getUser_address());
		ps.setString(8, vo.getUser_detailAddress());
		ps.setString(9, vo.getUser_extraAddress());
		ps.setString(10, vo.getId_user());
		System.out.println("3. sql 생성 성공.!!");
		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

}
