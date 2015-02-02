<%-- 
    Document   : info
    Created on : Jan 21, 2015, 10:43:53 PM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="user.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header2.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>


<%User user = (User) session.getAttribute("User"); %>
<div id="info2" >
<b>Αυτός είναι ο λογαριασμός του χρήστη:</b><%=user.getUsername() %><br>
<b>Το όνομά σου είναι:</b><%=user.getName() %><br>
<b>Το επίθετό σου είναι:</b><%=user.getSurname() %><br>
<b>Η διεύθυνση ηλεκτρονικού ταχυδρομείου σου είναι:</b> <%=user.getEmail() %><br>
<b>Ο κωδικός πρόσβασής σου είναι:</b> <%=user.getPassword() %><br><br>
<b>Αν έχεις καταχωρήσει αντικείμενο και θέλεις να το διαγράψεις συμπλήρωσε τον κωδικό αντικειμένου και στη συνέχεια πάτησε υποβολή.</b>
</div>

<div id="diagrafi">
	<form method="post" action="${pageContext.request.contextPath}/DeleteItem">
        <br />
	Κωδικός αντικειμένου: <input type="text" name="kwdikos" placeholder="Κωδικός"/>
	<br />
	<br />
	<input type="submit" value="Υποβολή" style="width:100px;height:40px;background-color:#6B5344;color:white;font-size:80%" />
	</form>
    </div>

<c:import url="footer.jsp"></c:import>