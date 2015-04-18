<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book List</title>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type"/>
</head>
<body>
<h1>Book List</h1>
<table>
    <thead>
    <th align="center">Autor</th>
    <th align="center">Book Title</th>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <td>${book}</td>
            <td>${book.bookTitle}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
