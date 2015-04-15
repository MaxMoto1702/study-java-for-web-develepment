<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="elf" uri="elFunction"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<table>
    <tbody>
    <tr id="title" >
        <td>Book Title:</td>
        <td>${param.bookTitle}</td>
    </tr>
    <tr>
        <td>Author 1 Name:</td>
        <td>${paramValues.authorName[0]}</td>
    </tr>
    <tr>
        <td>Author 2 Name:</td>
        <td>${paramValues.authorName[1]}</td>
    </tr>
    </tbody>
</table>
<span>Header: ${header["user-agent"]}</span>
<p>JSESSIONID: ${cookie.JSESSIONID.value}</p>
<h3>Session scope</h3>
Page loading count : ${sessionScope.pageLoadingCount}<br/>
<h3>EL Functions</h3>
Now: ${elf:now()}
<h3>JSTL</h3>
<c:set var="name" value="hello" scope="session" />
<c:catch var = "exception">
    <% int i = 1/0;%>
</c:catch>
<c:if test = "${exception != null}">
    <span> Exception : ${exception}</span>
</c:if>
<ul>
<c:forEach var="category" items="${categories}" varStatus="varStat">
    <li>${category} ${varStat.last}</li>
</c:forEach>
</ul>

<ul>
    <c:forEach var="book" items="${books}">
        <li>${book.value}</li>
    </c:forEach>
</ul>

<c:forTokens items="Clojure,Groovy,Java, Scala" delims="," var="lang">
<c:out value="${lang}"/><p>
    </c:forTokens>
</body>
</html>
