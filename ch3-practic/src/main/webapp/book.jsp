<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
    
    <h3>Inside the Brackets</h3>
    Category: ${categories[1]} <br/>
    Java: ${java} <br/>
    Book <%="${books[java]}"%>: ${books[java]} <br/>
    Book <%="${books[\"Java\"]}"%>: ${books["Java"]} <br/>
    Book <%="${books[categories[1]]}"%>: ${books[categories[1]]} <br/>
    Book <%="${books.Java]}"%>: ${books.Java} <br/>
    <h3></h3>
    Тут всякая ****<br/>
    <h3></h3>
    <br/>
    <h3></h3>
    <br/>
    <h3></h3>
    <br/>
    <h3></h3>
    <br/>
    <%@ include file="form.jsp"%>
    <%@ include file="result.jsp"%>
    </body>
</html>
