<%@page import="bbs.VO"%>
<%@page import="bbs.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. id값 받아와야함. -->
    <!-- 2. dao와 연동하여 결과 받아와야 함 -->
    <!-- 3. html로 만들어서 전송해야함. -->
    
    <jsp:useBean id="vo" class="bbs.VO"></jsp:useBean>
    <!-- new를 가지고 객체생성, import역할  -->
    <jsp:setProperty property ="*" name="vo"/>
    <!-- setProperty액션태그: 클라이언트가 전송한 파라메터 받아오고
		vo의 set()메서드를 호출해줌. -->
		
	<%
		DAO dao = new DAO();
		boolean result = dao.update(vo);
	%>
    <%--  
    <%
		String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	VO vo = new VO();
    	vo.setId(id);
    	vo.setPw(pw);
    	vo.setName(name);
    	vo.setTel(tel);
  	 	DAO dao = new DAO();
   		dao.update(vo);
    
    %>
    
    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=vo.getId() %>님의 회원정보 수정 페이지입니다.</h3>
<hr color="blue">
<h3>업데이트 결과는 <%= result %>입니다.</h3>


<hr color="red">

<a href="index.html">처음페이지로</a>

</body>
</html>