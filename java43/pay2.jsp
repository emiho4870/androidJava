
<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String id2 = request.getParameter("id2");
    String result = "사용가능한 아이디 입니다"; 
    if(id2.equals("a")){
    	result = "사용불가능한 아이디 입니다";
    }
   %><%=result%>