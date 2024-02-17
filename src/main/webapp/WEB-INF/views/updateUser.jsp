<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
</head>
<body>

<h2>Edit User</h2>

<form:form method="post" modelAttribute="user">
    <form:hidden path="id"/>

    <label>Username:</label>
    <form:input path="userName"/><br/>

    <label>Email:</label>
    <form:input path="email"/><br/>

    <label>Password:</label>
    <form:password path="password"/><br/>

    <input type="submit" value="Update">
</form:form>

</body>
</html>