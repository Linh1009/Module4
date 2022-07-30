<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/11/2022
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/result" method="post" modelAttribute="FormYTe">
    <table>
        <tr>
            <th><form:label path="ten">Họ tên (ghi chữ IN HOA)</form:label></th>
            <td><form: path="ten"/></td>
        </tr>
        <tr>
            <th><form:label path="namSinh">Năm sinh</form:label> </th>
            <td>
                <form:select path="namSinh">
                    <form:option value="1999"/>
                    <form:option value="2000"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <th><form:label path="gioiTinh">Giới tính:</form:label> </th>
            <td>
                <form:select path="gioiTinh">
                    <form:option value="Nam"/>
                    <form:option value="Nữ"/>
                </form:select>
            </td>
        </tr>

        <tr>
            <th><form:label path="quocTich">Languages</form:label></th>
            <td>
                <form:select path="quocTich">
                    <form:option value="English"/>
                    <form:option value="Vietnamese"/>
                    <form:option value="Chinese"/>
                    <form:option value="Japanese"/>
                </form:select>
            </td>
        </tr>

        <tr>
            <td><input type="submit" value="Gửi tờ khai"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
