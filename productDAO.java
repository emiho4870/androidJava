package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class BbsDAO {
   // 기능을 정의할 때는 메서드(함수)를 사용
   // 컨트롤+쉬프트+f(화면 자동 정리)
   // create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
   // => 매개변수(parameter, 파라메터)
  
   
   public List<BbsVO> all3(String content, String writer) throws Exception {
	   /*
	    * BbsVO : line의 정보를 : 순서를가지는ArrayList에 각각넣음
	    * all : 메소드사용 : container
	    */

//       DB프로그램 절차에 맞추어서 코딩
//       1. connector설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공.!!");

      // 2. db연결
//            String url = "연결하는방법://ip:port/db명";
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공.!!");

      // 3. sql문을 만든다.
      String sql = "select * from bbs where content like '"+ content + "%'";;
      PreparedStatement ps = con.prepareStatement(sql);

      // 4. sql문은 전송
      // select의 결과는 검색결과가 담긴 테이블(항목+내용)
      // 내용에는 없을 수도 있고, 많은 수도 있음.
      ResultSet rs = ps.executeQuery();
      System.out.println("4. SQL문 전송 성공.!!");
      // 가방을 넣는 컨테이너 역할을 하게 됨.!
      // <>안에는 컨테이너에 무엇을 넣을지 지정!
      List<BbsVO> list = new ArrayList<BbsVO>();
      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
         BbsVO bag = new BbsVO();// 가방만들어서,
         
         /*
          * ArrayList<BbsVO> list : list
          * BbsVO bag : bag : 결과를넣을가방
          */
         /*
          * rs.getInt(요소) : 요소가 얻게되는 결과 : 각각타입으로 넘겨줌 : bag.set(요소) : 결과를 가방에 넣음
          */
         int no2 = rs.getInt("no");
         String title = rs.getString("title");
         String content1 = rs.getString("content");
         String writer1 = rs.getString("writer");
         // 가방에 넣기
         bag.setNo(no2); // 커서(위치알려주는 역할)
         bag.setTitle(title);
         bag.setContent(content1);
         bag.setWriter(writer1);
         // 컨테이너에 넣기
         list.add(bag);
         /*
          * 큰 컨테이너에 각각의 가방들의 결과를 넣음 : list.add(bag)
          */
      }
      return list;
      // bag은 참조형 변수, 주소를 전달!
   }

}




번호 autoincrement
제목 String
작성자 String
작성일 날짜 date
