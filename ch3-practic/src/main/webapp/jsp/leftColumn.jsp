<%@ page import="com.rstyle.maxmoto1702.book.model.Category" %>
<%@ page import="java.util.List" %>
<link rel="stylesheet" href="css/bookstore.css" type="text/css"/>
<script src="js/bookstore.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
</head>
<div class="leftbar"/>
<ul id="menu">
    <li>
        <div>
            <a class="link1" href="/books">
                <span class="label" style="margin-left: 15px;">Home</span>
            </a>
        </div>
    </li>
    <li>
        <div>
            <a href="/books?action=allBooks">
                    <span class="label" style="margin-left: 15px">
                        All books
                    </span>
            </a>
        </div>
    </li>
    <li>
        <div>
                <span class="label" style="margin-left: 15px;">
                    Categories
                </span>
            <ul>
                <%
                    List<Category> categories = (List<Category>) application.getAttribute("categories");
                    for (Category category : categories) {
                %>
                <li>
                    <a class="label"
                       href="/books?action=category&categoryId=<%=category.getId()%>&category=<%=category.getCategoryDescription()%>">
                            <span class="label" style="margin-left: 30px">
                                <%=category.getCategoryDescription()%>
                            </span>
                    </a>
                </li>
                <%
                    }
                %>
            </ul>
        </div>
    </li>
</ul>
<form class="search">
    <input type="hidden" name="action" value="search"/>
    <input id="text" type="text" name="keyword" size="12"/>
    <span class="tooltip_message">?</span>

    <p/>
    <input id="submit" type="submit" value="Search"/>
</form>
</div>