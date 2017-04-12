<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<%--
  Created by IntelliJ IDEA.
  User: owner
  Date: 17-2-23
  Time: 下午8:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <input name="name" type ="text"/>
    ${aa}
    <input name="sex" type ="text"/>
    <input type="submit" value="Save" />
</form>
</body>
</html>
