<%@page import="login.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	DAO dao = new DAO();
	boolean result = dao.read(id, pw);
	if(result){
		session.setAttribute("id", "root");
		
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function login_check() {
		var user_id1 = document.getElementById('user_id').value;
		var user_pw1 = document.getElementById('user_pw').value;
		if (user_id1.length != 0 && user_pw1.length != 0) {
			location.href = 'login.jsp?id=' + user_id1 + "&pw=" + user_pw
			
			if (session.getAttribute("id") != null) {
				alert('로그인 성공!');
			} else {
				alert('아이디 또는 비밀번호가 틀렸습니다.');
			}
		} else {
			if (user_id1.length == 0) {
				alert("아이디를 입력하세요")
			} else {
				alert("비밀번호를 입력하세요")
			}
		}
	}

</script>
</head>
<body>
<%
String user = (String) session.getAttribute("id");

	if(session.getAttribute("id") != null){%>
	<h1><%= session.getAttribute("id") %> 님 환영합니다.</h1>
	<button onclick="logout()">로그아웃</button>
<% }else{%>
		<input id="user_id" type="text" name="id"><br> <input
			id="user_pw" type="text" name="pw"><br>

		<button onclick="login_check()" type="submit">로그인</button>

	
<%}%>
	
</body>
</html>