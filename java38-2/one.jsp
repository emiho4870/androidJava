<%@page import="bbs.VO"%>
<%@page import="bbs.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. id값 받아와야함. -->
    <!-- 2. dao와 연동하여 결과 받아와야 함 -->
    <!-- 3. html로 만들어서 전송해야함. -->
    
    <%
		String id = request.getParameter("id");
    
    DAO dao = new DAO();
    VO vo = dao.one(id);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=vo.getId() %></h3>
<hr color="blue">
<table>
	<tr>
		<td width="100" bgcolor="yellow">아이디</td>
		<td width="200" bgcolor="pink"><%=vo.getId() %></td>
	</tr>
	<tr>
		<td width="100" bgcolor="yellow">패스워드</td>
		<td width="200" bgcolor="pink"><%=vo.getPw() %></td>
	</tr>
	<tr>
		<td width="100" bgcolor="yellow">이름</td>
		<td width="200" bgcolor="pink"><%=vo.getName() %></td>
	</tr>
	<tr>
		<td width="100" bgcolor="yellow">전화번호</td>
		<td width="200" bgcolor="pink"><%=vo.getTel() %></td>
	</tr>
	
</table>

<hr color="red">

<a href="index.html">처음페이지로</a>
<a href="update.jsp?id=<%= vo.getId()%>">수정</a>
<a href="delete.jsp?id=<%= vo.getId()%>">삭제</a>
</body>
</html>