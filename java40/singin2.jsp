<%@page import="login.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	DAO dao = new DAO();
    	boolean result = dao.read(id);
    	String check = "중복된 아이디가 없습니다.";
		if(result){
			check="중복된 아이디가 있습니다.";
		}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">

function id_input() {
	var user_id1 = document.getElementById('user_id').value;
	if(user_id1.length==0){alert("아이디가 입력되지 않았습니다.")}
	else{alert("아이디가 입력되었습니다.")}
}
function id_len() {
	var user_id1 = document.getElementById('user_id').value;
	
	if(user_id1.length>=5){alert("아이디가 5글자 이상입니다")}
	else{alert("아이디가 5글자 이하입니다")}
}
function pw_check() {
	var user_pw3 = document.getElementById('user_pw').value;
	var user_pw4 = document.getElementById('user_pw2').value;
	
	if(user_pw3 == user_pw4){
		alert("패스워드가 동일합니다")
	}else{
		alert()
	}
}
</script>
</head>
<body>

<form action="signin2.jsp">
<input id="user_id" type="text" name="id"><br>
<input id="user_pw" type="text" name="pw"><br>
<input id="user_pw2" type="text" name="pw2"><br>

<button onclick="id_input()" >아이디 입력확인</button>
<button onclick="id_len()" >아이디 5글자이상 확인</button>
<button type="submit" >아이디 중복확인</button>
<button onclick="pw_check()" >패스워드 동일한지 확인</button>
</form>

</body>
</html>