<%@page import="bean.bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	MemberDAO dao = new MemberDAO();
	VO vo = new VO();
	
	String id = request.getParameter("id");
	
	vo = dao.one(id);
	
	String pw = vo.getPw();
	String name = vo.getName();
	String tel = vo.getTel();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원정보가 </h3>
	
	ID : <%=id %> <br>
	PW : <%=pw %> <br>
	Name : <%=name %> <br>
	Tel : <%=tel %> <br>
	<a href="login.html">로그인 페이지로</a>

</body>
</html>