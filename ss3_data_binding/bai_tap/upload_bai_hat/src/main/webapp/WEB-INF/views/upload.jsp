<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 05/05/2022
  Time: 1:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Music App for dead inside people</h1>

<form:form method="post" modelAttribute="upload" action="/result">
    <div>
        <p>Name Song</p>
        <form:input type="text" path="nameSong"/>
    </div>
    <div>
        <p>Singer</p>
        <form:input type="text" path="singer"/>
    </div>
    <div>
        <p>Genre</p>
        <form:select path="genre">
            <form:option value="pop">Pop</form:option>
            <form:option value="rock">Rock</form:option>
            <form:option value="jazz">Jazz</form:option>
            <form:option value="blues">Blues</form:option>
            <form:option value="hiphop">Hip Hop</form:option>
        </form:select>
    </div>
    <div>
        <p>Link</p>
        <form:input type="text" path="url" value=".mp3"/>
    </div>

    <button type="submit" value="sub"> sub</button>

</form:form>

</body>
</html>
