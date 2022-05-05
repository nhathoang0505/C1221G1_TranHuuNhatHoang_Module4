<%--
  Created by IntelliJ IDEA.
  User: Hoang Tran
  Date: 5/5/2022
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculator">
    <div>
        <h1>Calculator</h1>
        <input type="text" name="number1">
        <input type="text" name="number2">
    </div>
    <div>
        <input type="submit" name="operator" value="Addition(+)">
        <input type="submit" name="operator" value="Subtraction(-)">
        <input type="submit" name="operator" value="Multiplication(*)">
        <input type="submit" name="operator" value="Division(-)">
    </div>
</form>
<div>
    Result: ${result}
</div>
</body>
</html>
