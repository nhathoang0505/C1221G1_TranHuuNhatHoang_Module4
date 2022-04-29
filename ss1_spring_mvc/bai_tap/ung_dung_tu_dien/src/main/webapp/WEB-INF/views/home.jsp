<%--
  Created by IntelliJ IDEA.
  User: Hoang Tran
  Date: 4/29/2022
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate">
    <div>
        Input words you want to translate:
        <input type="text" name="keyword">
        <button type="submit">Translate</button>
    </div>
</form>
<div>${results}</div>
</body>
</html>
