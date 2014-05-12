<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TRKarliS
  Date: 4/8/14
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <link href="/css/TableCSSCode.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="CSSTableGenerator">
    <table>
        <tr>
            <td>sku</td>
            <td>materialName</td>
            <td>price</td>
            <td>availability</td>
        <tr>
        <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.sku}</td>
            <td>${product.materialName}</td>
            <td>${product.price}</td>
            <td>${product.availability}</td>
        <tr>
            </c:forEach>
    </table>
</div>

</body>
</html>