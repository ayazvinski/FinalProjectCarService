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

<form:form method="post" modelAttribute="car">
    <label>Vin Number:</label>
    <form:input path="vinNumber" cssClass="form-input" required="required"/><br/>

    <label>Brand:</label>
    <form:input path="brand" cssClass="form-input" required="required"/><br/>

    <label>Model:</label>
    <form:input path="model" cssClass="form-input" required="required"/><br/>

    <label>Color:</label>
    <form:input path="color" cssClass="form-input" required="required"/><br/>

    <label>Production Data:</label>
    <form:input path="productionDate" cssClass="form-input" required="required"/><br/>

    <input type="submit" value="Save">
</form:form>

</body>
</html>

