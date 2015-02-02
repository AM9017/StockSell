<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="user.User" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header2.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>


<%User user = (User) session.getAttribute("User"); %>
<div id="aposundesi">
<b>Γεια σου <%=user.getUsername() %>!!!</b><br>
<b>Η διεύθυνση ηλεκτρονικού ταχυδρομείου σου είναι:</b> <%=user.getEmail() %><br>
<b>Ο κωδικός πρόσβασής σου είναι:</b> <%=user.getPassword() %><br>
<b>Θέλεις να αποσυνδεθείς;</b>
<br>
<br>
<form action="${pageContext.request.contextPath}/Logout" method="post" >
    <input type="submit" value="Αποσύνδεση" >
</form>
</div>

<c:import url="footer.jsp"></c:import>