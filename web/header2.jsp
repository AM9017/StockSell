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
            <li><a href="home.jsp">Αρχικη</a></li>
            <li><a href="categories2.jsp">Κατηγοριες</a></li>
            <li><a href="add.jsp">Πουλησε το προϊον σου</a></li>
            <li><a href="info.jsp">Λογαριασμος</a></li>
            <li><a href="logout.jsp">Αποσυνδεση</a></li>
        </ul>  
