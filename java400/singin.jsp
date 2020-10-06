<%@page import="user.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
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
function id_check() {
	var user_id1 = document.getElementById('user_id').value;
	location.href = 'equal.jsp?id=' + id2Value;
	
	
}
function pw_check() {
	var user_pw3 = document.getElementById('user_pw').value;
	var user_pw4 = document.getElementById('user_pw2').value;
	
	if(user_pw3 == user_pw4){
		
		location.href = 'login.jsp?id=' + id2Value + "&pw=" + pwValue
	}else{
		alert("패스워드가 동일하지 않습니다.")
	}
}
</script>
</head>
<body>


<input id="user_id" type="text" name="id" placeholder="아이디"><br>
<input id="user_pw" type="text" name="pw" placeholder="비밀번호"><br>
<input id="user_pw2" type="text" name="pw2" placeholder="비밀번호 확인"><br>

<button onclick="id_input()" >아이디 입력확인</button>
<button onclick="id_len()" >아이디 5글자이상 확인</button>
<button onclick="id_check()" >아이디 중복확인</button>
<button onclick="pw_check()" >패스워드 동일한지 확인</button>


</body>
</html>