<%@page import="bean.bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!--
    	1. 클라이언트가 입력해서 제출한 데이터를 받아와야 한다.
    	2. DB연동해서 처리해서 결과 받아와야 함.
    	3. 받아온 결과에 따라서 화면을 html로 만들어서 클라이언트에 전송.
      -->

<%
	//자바코드를 넣는 기호
//스크립트릿(Scriptrit)
//HttpServletRequest request = new HttpServletRequest();  <- 이미 자동으로 들어가있는 코드
//내장된 객체
String id = request.getParameter("id");
String pw = request.getParameter("pw");

MemberDAO dao = new MemberDAO();
VO vo = new VO();
boolean result = dao.read(id, pw);

String check = "로그인 fail!";
if(result){
	check = "로그인 ok!";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>당신이 입력한 정보의 결과는 <%=check %> 입니다.</h3>
	<hr color="red">
	아이디 : <%= id %> <!-- exprssion 표현식 -->
	<br> 
	패스워드 : <%= pw %>
	<br>
	<hr color="blue">
	<a href="login.html">로그인 페이지로</a>

</body>
</html>