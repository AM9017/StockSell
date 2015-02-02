<%-- 
    Document   : show
    Created on : Feb 1, 2015, 1:37:05 AM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>

<sql:setDataSource var="ds" dataSource="jdbc/stocksell" />

<sql:query dataSource="${ds}" sql="select * from category where kwdikos=? and usernm=?" var="result">
    <sql:param>${param.kwdikos}</sql:param>
    <sql:param>${param.user}</sql:param>
</sql:query>   

<div id="emfanisi2">
 <c:set var="row" value="${result.rows[0]}"></c:set>
 
    <b>Κατηγορία:</b><c:out value="${row.katigoria}"/><br />
    <b>Είδος:</b><c:out value="${row.eidos}"/><br />
    <b>Έτος κατασκευής:</b><c:out value="${row.etos}"/><br />
    <b>Παλιά τιμή:</b><c:out value="${row.p_timi}"/><br />
    <b>Καινούρια τιμή:</b><c:out value="${row.k_timi}"/><br />
    <b>Κωδικός αντικειμένου:</b><c:out value="${row.kwdikos}"/><br />
    <b>Χρώμα:</b><c:out value="${row.xrwma}"/><br />
    <b>Νούμερο:</b><c:out value="${row.noumero}"/><br />
    <b>Φύλο:</b><c:out value="${row.fulo}"/><br />
    <b>Μοντέλο:</b><c:out value="${row.montelo}"/><br />
    <b>Άλλες πληροφορίες:</b><c:out value="${row.more}"/><br />
    <b>Επικοινωνία:</b><c:out value="${row.stoixeia}"/><br />
    <br />
    <br />
</div>
    
<div id="steilemnm">
    <b>Για να έρθετε σε επικοινωνία με τον κάτοχο μπορείτε να στείλετε email εδώ:</b><br />
</div>
<div id="steilemnm2">
     <a href="mailto:${row.stoixeia}?Subject=Ερωτήσεις">${row.stoixeia}</a>
</div>

<c:import url="footer.jsp"></c:import>