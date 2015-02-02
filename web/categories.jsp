<%-- 
    Document   : categories
    Created on : Jan 31, 2015, 5:09:51 PM
    Author     : popi
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>


<p id="add">
    <b>Επιλέξτε την κατηγορία στην οποία ανήκει το αντικείμενο που θέλετε να βρείτε.</b>
</p>

<div id="add2">
    <form method="post" action="${pageContext.request.contextPath}/Categories">
        <select name="katigoria">
            <option value="epilogi" selected="selected">Επιλέξτε κατηγορία</option>
            <option value="rouxa">Ένδυση</option>
            <option value="papoutsia">Υπόδηση</option>
            <option value="accessories">Accessories</option>
            <option value="spiti">Είδη Οικιακής Χρήσης</option>
            <option value="suskeues">Ηλεκτρικές Συσκευές</option>
            <option value="texnologia">Τεχνολογία</option>
            <option value="alla">Άλλα</option>
        </select>
        <br />
        <br />
        <br />
        <input type="submit" value="Υποβολή" style="width:80px;height:30px;background-color:#6B5344;color:white;font-size:60%">
    </form>
</div>

        
<c:import url="footer.jsp"></c:import>