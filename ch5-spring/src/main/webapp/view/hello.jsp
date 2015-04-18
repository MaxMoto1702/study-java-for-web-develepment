<%@ page import="com.rstyle.maxmoto1702.book.model.Book" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello</title>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type"/>
</head>
<body>
<h1>Hello</h1>

<h2>Change 4</h2>
${header["user-agent"]}<br/>
<jsp:useBean id="bookDAO" class="com.rstyle.maxmoto1702.book.dao.BookDAOImpl"/>
<%
    List<Book> books = bookDAO.findAllBooks();
    for (Book book : books) {
        out.print(book.toString() + "</br>");
    }
%>

<table>
    <thead>
    <th align="center">Autor</th>
    <th align="center">Book Title</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book}</td>
            <td>${book.bookTitle}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
