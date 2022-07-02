<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/2/2022
  Time: 6:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/result" method="post" modelAttribute="email">
    <table>
        <tr>
            <th><form:label path="languages">Languages</form:label></th>
            <td>
                <form:select path="languages">
                    <form:option value="English"/>
                    <form:option value="Vietnamese"/>
                    <form:option value="Chinese"/>
                    <form:option value="Japanese"/>
                </form:select>
            </td>
        </tr>

        <tr>
            <th><form:label path="pageSize">PageSize: </form:label> </th>
            <td>Show
                <form:select path="pageSize">
                    <form:option value="5"/>
                    <form:option value="10"/>
                    <form:option value="15"/>
                    <form:option value="25"/>
                </form:select>
                email per page
            </td>
        </tr>

        <tr>
            <th><form:label path="spamsFilter">Spams filter:</form:label> </th>
            <td>
                <form:checkbox path="spamsFilter"/>
                <form:label path="spamsFilter">Enable spams filter</form:label>
            </td>
        </tr>

        <tr>
            <th><form:label path="signature">Signature</form:label></th>
            <td><form:textarea path="signature"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
