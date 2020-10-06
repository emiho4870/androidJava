
<%@page import="bbs.DAO_bbs"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="vo" class="bbs.VO_bbs"></jsp:useBean>
    <jsp:setProperty property="*" name="vo"/>
    <%
    DAO_bbs dao = new DAO_bbs();
    dao.create(vo);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>

<h3>작성이 완료되었습니다!</h3>


</body>
</html>