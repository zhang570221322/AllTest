<%--
  Created by IntelliJ IDEA.
  User: zwl
  Date: 2017/7/31
  Time: 18:06
  may god bless me
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/test/test5">
    id:<input name="blogId">
    name:<input name="blogName">
    <button name="123" value="提交"/>
</form>
<br>
  <h2>${blog.blogId}123</h2>
<h2>${blog.blogName}123</h2>
</body>
</html>
