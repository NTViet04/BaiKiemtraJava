<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Lê Việt Hoàng</title>
</head>
<body>
    <h1>Bảng điền thông tin</h1>
    <form action="count" method="post">
        <input type="text" name="inputString" />
        <input type="submit" value="Tính Toán" />
    </form>

    <c:if test="${not empty requestScope.inputString}">
        <p>Input String: <c:out value="${requestScope.inputString}"/></p>
        <p>Character Count: <c:out value="${requestScope.count}"/></p>
        <c:if test="${requestScope.count > 10}">
            <p style="color:red;">The input string is longer than 10 characters!</p>
        </c:if>
    </c:if>
</body>
</html>