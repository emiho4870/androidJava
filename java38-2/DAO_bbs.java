package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO_bbs {
	Connection con;
	public DAO_bbs() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!");
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		
	}
	public void create(VO_bbs vo) throws Exception {
		
		String sql = "insert into bbs values(?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());

		ps.executeUpdate();
		
		ps.close();
		con.close();
	}
	public VO_bbs read(int no) throws Exception {
		
		String sql = "select * from bbs where no =?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		VO_bbs bag = new VO_bbs();
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
	         System.out.println("검색결과가 있어요.");
	         String no1 = rs.getString("no");
	         String title = rs.getString("title");
	         String content = rs.getString("content");
	         String writer = rs.getString("writer");
	         
	         bag.setNo(Integer.valueOf(no1));
	         bag.setTitle(title);
	         bag.setContent(content);
	         bag.setWriter(writer);
	         
	      } else {
	         System.out.println("검색결과가 없어요.");
	      }
		rs.close();
		ps.close();
		con.close();
		
	      return bag;
	}
	
	 public void update(VO_bbs bag) throws Exception {

	        String sql = "update bbs set content = ? where no = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	       
	        ps.setString(1, bag.getContent());
	        ps.setInt(2, bag.getNo());

	        ps.executeUpdate();
	        
	        ps.close();
			con.close();
	    }

	public Boolean delete(int id) throws Exception {
		
		
		String sql = "delete from bbs where id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
		boolean result = false;
		
		
		
		ps.close();
		con.close();
		return result;
	}
	
	public ArrayList<VO_bbs> all() throws Exception {
		

		String sql = "select * from bbs";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();


		ArrayList<VO_bbs> list = new ArrayList<VO_bbs>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			VO_bbs bag = new VO_bbs();
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");

			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);

			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;

	}
}
