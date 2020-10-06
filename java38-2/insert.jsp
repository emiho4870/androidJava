
<%@page import="bbs.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    //자동 import : 해당 클래스에 커서를 두고 , ctrl + shift + m
    DAO dao = new DAO();
    dao.create(id, pw, name, tel);
 
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버가입성공!</title>

<h3>등록된 멤버정보</h3>
<hr color="red">

ID : <%= id %> <br>
PW : <%= pw %> <br>
이름 : <%= name %> <br>
나이 : <%= tel %><br>

<hr color="blue">



</head>
<body>

</body>
</html>