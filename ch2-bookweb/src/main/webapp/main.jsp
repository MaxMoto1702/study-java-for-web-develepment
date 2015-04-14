<%@ page import="com.rstyle.maxmoto1702.book.model.Book" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.List" %>
<%@ include file="header.jsp" %>

<p>Content</p>

<h6>Declaration</h6>
<%!
    public String hello() {
        String hello = "Hello!";
        return hello;
    }
%>
Message from <b>Scriptlets</b>: <% hello(); %><br/>
Message from <b>Expression</b>: <%=hello()%><br/>

<h3>Request Headers</h3>
<%
    Enumeration<String> headers = request.getHeaderNames();
    while (headers.hasMoreElements()) {
        String header = headers.nextElement();
        out.print(header + " : " + request.getHeader(header) + "</br>");
    }
%>


<% out.print("Inside main.jsp"); %><br/>
<jsp:include page="sub.jsp"/>
<br/>

<h3>Bean</h3>
<jsp:useBean id="bookBean" class="com.rstyle.maxmoto1702.book.model.Book"/>
<jsp:setProperty name="bookBean" property="id" value="1"/>
<%=bookBean.toString()%><br/>

<h3>Books from DB</h3>
<jsp:useBean id="bookDAO" class="com.rstyle.maxmoto1702.book.dao.BookDAOImpl"/>
<p>Listing all books:</p>
<%
    List<Book> books = bookDAO.findAllBooks();
    for (Book book : books) {
        out.print(book.toString() + "</br>");
    }
%>


<%@ include file="footer.jsp" %>