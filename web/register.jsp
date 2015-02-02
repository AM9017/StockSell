<%-- 
    Document   : register
    Created on : Dec 11, 2014, 9:53:16 AM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>


<p id="eisagwgi">
	<b>Εγγραφή Χρήστη</b>
</p>
	
	<div id="eggrafi">
	<p><span class="error">* υποχρεωτικό πεδίο.</span></p>
		<form name="forma" method="post" action="${pageContext.request.contextPath}/Register">
		<br />
		<br />
		Όνομα: <input type="text" name="name" placeholder="Όνομα"/>
                <span class="star">* </span>
		<br />
		<br />
		Επώνυμο: <input type="text" name="surname" placeholder="Επώνυμο"/>
                <span class="star">* </span>
		<br />
		<br />
		Διεύθυνση ηλεκτρονικού ταχυδρομείου: <input type="text" name="email" placeholder="email"/>
                <span class="star">* </span>
		<br />
		<br />
                Όνομα χρήστη: <input type="text" name="username" placeholder="username"/>
                <span class="star">* </span>
		<br />
		<br />
		Κωδικός πρόσβασης: <input type="password" name="password" placeholder="password"/>
                <span class="star">* </span>
		<br />
		<br />
		<br />
	 	<input type="submit" value="Εγγραφή" style="width:130px;height:55px;background-color:#6B5344;color:white;font-size:100%" onsubmit="myFunction()" />
		<input type="Reset" name="Reset" value="Ακύρωση" style="width:150px;height:55px;background-color:#6B5344;color:white;font-size:100%" />
                        
	</div>
       
<c:import url="footer.jsp"></c:import>
