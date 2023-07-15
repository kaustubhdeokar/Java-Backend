<%@ page import="com.example.kdeokar.springmvc.model.Todo" %><%--
  Created by IntelliJ IDEA.
  User: kaustubh
  Date: 12/07/23
  Time: 11:36 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <title>Todos Page</title>
</head>
<body>

<h2>Add a todo</h2>

<form:form action="/add-todo" method="POST" modelAttribute="todo">
    Descr:<form:input path="desc" type="text" name="desc"/>
    <input type="submit">
</form:form>

</body>
</html>
