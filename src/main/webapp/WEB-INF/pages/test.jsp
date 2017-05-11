<%--
  Created by IntelliJ IDEA.
  User: oleg
  Date: 12.04.17
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="с" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <table>
        <tr>
            <td><c:forEach var="num" items="${list}">
                <p>${num}</p>
            </c:forEach></td>
        </tr>
    </table>

</h1>
</body>
</html>
