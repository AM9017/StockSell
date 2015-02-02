<%-- 
    Document   : login
    Created on : Nov 27, 2014, 7:17:34 PM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>


    <p id="eisagwgi2">
	<b>Σύνδεση Χρήστη</b>
    </p>
	
    <div id="sundesi">
	<form method="post" action="${pageContext.request.contextPath}/Login">
	<br />
	<br />
	Όνομα Χρήστη: <input type="text" name="username" placeholder="username"/>
	<br />
	<br />
	Κωδικός Πρόσβασης: <input type="password" name="password" placeholder="password"/>
	<br />
	<br />
	<br />
	<input type="submit" value="Είσοδος" style="width:130px;height:55px;background-color:#6B5344;color:white;font-size:100%" />
	</form>
    </div>

<c:import url="footer.jsp"></c:import>