<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/7/2021
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Phạm Tuấn Thảo
<form action="" method="post">
    <input type="text" name="id" value="${customer.id}">
    <input type="text" name="name" value="${customer.name}">
    <input type="text" name="address" value="${customer.address}">
    <input type="text" name="email" value="${customer.email}">
    <button>Edit</button>
</form>
</body>
</html>
