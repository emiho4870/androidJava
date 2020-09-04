package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

//특정한 방법을 처리하는 클래스 : 방법( model , db처리 )클래스
public class DB처리전담 {
	//DB처리하는 방법이 4단계로 정해져 있다

	
	  public void create( String id , String pw , String name , String tel ) throws ClassNotFoundException, SQLException {
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("DB에 저장 처리 함");
		//1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		//two quick fixes available
		//자바에서는 에러가 너무 많이 발생할 것 같은 상황에서는 반드시 에러처리를 반드시 해주어야 함
		//네트워크 연결 , db연결 , 파일연결 , cpu연결 : 에러가능상황
		System.out.println("1. connector 설정 성공");
		//2. db연결
		//3  1)ip+port+db명
		//4  1)username : root
		//5  1)password : 1234
		String url = "jdbc:mysql://localhost:3366/shop"; // java : db : 연결
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2. shop연결 성공");
		
		
		//db연동 index는 1부터 시작
		String sql = "insert into member values ( ? , ? , ? , ? )"; //id값 달리해서 추가됨
		//String sql = "insert into member values ('jsp', 'jsp','jsp','jsp')"; //id값 달리해서 추가됨
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql); //ps
		ps.setString( 1 , id );
		ps.setString( 2 , pw );
		ps.setString( 3 , name );
		ps.setString( 4 , tel );
		System.out.println("3. SQL문 생성 성공!!");
		ps.executeUpdate(); //SQL문 전송 : 같은 삽입문시 에러남 : ps.executeUpdate
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
		
	
		
	}
	//build : 빌드 : 만들다
	
	public void create() {
		//JOptionPane.showMessageDialog(null, "DB에 저장 처리 함"); // JOptionPane.showMessageDialog(null, " ");
		System.out.println("DB에 저장 처리 함");
		//1.
	}
	public void read() { //반환있음 : void삭제 : 타입설정
		JOptionPane.showMessageDialog(null, "DB에 검색 처리 함");
	}
	public void update() {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함");
	}
	public void delete() {
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리 함");
	}
}

