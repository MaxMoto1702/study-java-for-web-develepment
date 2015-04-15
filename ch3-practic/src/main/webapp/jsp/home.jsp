<%--
    Created by IntelliJ IDEA.
    User: m
    Date: 14.04.2015
    Time: 23:10
    To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html >
<%
    String imageURL = application.getInitParameter("imageURL");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Web</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="css/bookstore.css" type="text/css"/>
    <script type="text/javascript" src="js/jquery-1.9.1.js"><script type="text/javascript"
    <script src="js/bookstore.js"></script>
</head>
<body>
<div align="centered">
    <jsp:include page="header.jsp" flush="true"/>
    <br/>
    <jsp:include page="leftColumn.jsp" flush="true"/>
    <span class="label">Featured Books</span>
    <table>
        <tr>
            <td><span class="tooltip_img1"><img
                    src="<%=imageURL%>/A9781430248064-small_3.png"/></span></td>
            <td><img src="<%=imageURL%>/A9781430239963-small_1.png"/></td>
            <td><img src="<%=imageURL%>/A9781430247647-small_3.png"/></td>
            <td><img src="<%=imageURL%>/A9781430231684-small_8.png"/></td>
            <td><img src="<%=imageURL%>/A9781430249474-small_1.png"/></td>
        </tr>
        <tr>
            <td><img src="<%=imageURL%>/A9781430248187-small_1.png"/></td>
            <td><img src="<%=imageURL%>/A9781430243779-small_2.png"/></td>
            <td><img src="<%=imageURL%>/A9781430247401-small_1.png"/></td>
            <td><img src="<%=imageURL%>/A9781430246596-small_1.png"/></td>
            <td><img src="<%=imageURL%>/A9781430257349-small_1.png"/></td>
        </tr>
    </table>
</div>
</body>
</html>
