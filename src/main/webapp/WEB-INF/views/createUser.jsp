<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
    <style>
        .form-input {
            width:20%;
            box-sizing: border-box;
        }
    </style>
</head>
<body>

<h2>Add User</h2>

<form:form method="post" modelAttribute="user">
    <label>Username:</label>
    <form:input path="userName" cssClass="form-input" required="required"/><br/>

    <label>Email:</label>
    <form:input path="email" cssClass="form-input" required="required"/><br/>

    <label>Password:</label>
    <form:password path="password" cssClass="form-input" required="required"/><br/>

    <input type="submit" value="Save">
</form:form>

</body>
</html>

