<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/22/2022
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tran Anh Tuan
  Date: 8/17/2018
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List sandwich condiments</h2>
<c:forEach items="${condiment}" var="condiment">
    <h4>${condiment}</h4>
</c:forEach>
</body>
</html>