<%--
  Created by IntelliJ IDEA.
  User: Hoang Tran
  Date: 5/5/2022
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/save">
    <h1>Sandwich Condiments</h1>
    <input type="checkbox" name="giaVi" value="Lettuce"> Lettuce
    <input type="checkbox" name="giaVi" value="Tomato"> Tomato
    <input type="checkbox" name="giaVi" value="Mustard"> Mustard
    <input type="checkbox" name="giaVi" value="Sprouts"> Sprouts
    <button type="submit">Save</button>
</form>

<div><c:forEach var="element" items="${giaVi}">
    ${element}
</c:forEach></div>
</body>
</html>
