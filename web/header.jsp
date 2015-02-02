<%-- 
    Document   : header
    Created on : Dec 11, 2014, 8:55:35 AM
    Author     : popi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/style/mycss.css" rel="stylesheet" type="text/css" />
        <title>${param.title}</title>
    </head>
    <body>
        <h1>Welcome to my application for selling stock items!</h1>
        
        <ul>
            <li><a href="index.jsp">Αρχικη</a></li>
            <li><a href="categories.jsp">Κατηγοριες</a></li>
            <li><a href="add2.jsp">Πουλησε το προϊον σου</a></li>
            <li><a href="register.jsp">Εγγραφη</a></li>
            <li><a href="login.jsp">Συνδεση</a></li>
        </ul>  