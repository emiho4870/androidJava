<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
 String id3 = request.getParameter("id3");
    
 String result = null;/* 초기화 */
 
 Random r = new Random();

 String a = null;/* 초기화 */
 
 if(id3.substring(0,3).equals("010")){
	a = "11"+r.nextInt(899)+100; 
	 
 }else if(id3.substring(0,3).equals("011")){
	 a = "22"+r.nextInt(899)+100; 
 }else if(id3.substring(0,3).equals("012")){
	 a = "33"+r.nextInt(899)+100; 
 }
 


