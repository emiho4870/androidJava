<%@page import="bean.productVO"%>
<%@page import="java.util.List"%>
<%@page import="bean.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    String content = request.getParameter("column1");
    String writer = request.getParameter("column2");
    productDAO dao = new productDAO();
    List<productDAO> list = dao.product(column1,column2);
    %>
<!DOCTYPE html>
<html lang="UTF-8">
<head>

<meta charset="UTF-8">
<title>상품검색</title>
<style type="text/css">
  /*  td {
      width: 100px;
      text-align: center;
   }
   .td{
      background: yellow;
   } */
</style></head>
  
<body>
<!-- 검색상품목록 -->
</body>
</html>