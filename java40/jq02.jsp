<%@page import="login.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    DAO dao = new DAO();
    
    boolean result = dao.read(id,pw);
    String check = "로그인 실패!";
    if(result){
    	check = "로그인성공!";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=check %></h3>
</body>
</html>