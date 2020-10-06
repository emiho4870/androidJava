<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
   
 String id1 = request.getParameter("id1");
 String pay = request.getParameter("pay");
 
 String result = null; /* 초기화  */
 
if(pay.equals("1")){ //1숫자입력
	result = id1 + "계좌이체";
}else if(pay.equals("2")){
	result = id1 + "신용카드";
}else if(pay.equals("3")){
	result = id1 + "휴대폰";
}%><%=result %>
 