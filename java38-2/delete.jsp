<%@page import="bbs.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    
    DAO dao = new DAO();
    boolean result = dao.delete(id);
    String check = "탈퇴 처리 중 문제가 발생함. 탈퇴처리 되지 않음.";
    
	if(result){
		
	}
    	check = "탈퇴처리 완료!";
    
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>삭제 결과 : <%= check %></h3>
<hr color="red">

<a href="index.html">처음페이지로</a>
</body>
</html>