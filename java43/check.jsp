<%@page import="bean.MemberDAO"%> <!-- ctrl shift M -->
<%@page import="bean.MemberVO"%> <!-- ctrl shift M -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    %><%= result%>