
<%--
  Created by IntelliJ IDEA.
  User: owner
  Date: 16-5-8
  Time: 上午7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
<style type="text/css">
    table{background: white; width: 300px;}
    td{border: 1px solid #cccccc; height: 25px;}
</style>
</head>
<body>
<h2>宝贝照片显示</h2>
<ul>

    <table style="background: white;">
        <tr>
            <td>用户编号</td>
            <td>用户姓名</td>
        </tr>
        <c:forEach items="${spittles}"  var="item" >
            <tr>
                <td> <c:out value="${item.name}"/> </td>
                <td><c:out value="${item.id}"/></td>
            </tr>
        </c:forEach>



    </table>
    <img src="/Users/owner/Pictures/IMG_1035.JPG">
    <%File directory = new File("abc");
        String test = directory.getCanonicalPath();%>
    <%=test%>

    <a href="insertBabyInfo">插入宝贝信息</a>


</ul>
欢迎进入spring的世界. 你会成功的.F
</body>
</html>
