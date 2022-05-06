<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 05/05/2022
  Time: 2:18 CH
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Bài Hát </h1>

<a href="/upload"> Add a new song </a>
<table border="1px">
    <tr>
        <th>Song's Name</th>
        <th>Singer</th>
        <th>Genre</th>
        <th>Link</th>
    </tr>

        <c:forEach var="item" items="${list}">
    <tr>
            <th> ${item.nameSong}</th>
            <th> ${item.singer}</th>
            <th> ${item.genre}</th>
            <th> ${item.url}</th>
    </tr>
        </c:forEach>

</table>
</body>
</html>
