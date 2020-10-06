<%@page import="member.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="vo2" class="member.MemberVO2"></jsp:useBean>
<jsp:setProperty property="*" name="vo2"/>
<%
   MemberDAO2 dao2 = new MemberDAO2();
   boolean result = dao2.create(vo2);
%><%= result %>]



