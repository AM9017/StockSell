<%-- 
    Document   : index
    Created on : Nov 27, 2014, 4:14:18 PM
    Author     : popi
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>

<sql:setDataSource var="ds" dataSource="jdbc/stocksell" />

<sql:query dataSource="${ds}" sql="select * from category" var="result" /> 
  <div id="emfanisi">
  <table style="width:50%">
<c:set var="tablewidth" value="4" />
<c:forEach var="row" items="${result.rows}" varStatus="seira">
    <c:if test="${seira.index % tablewidth==0}">
        <tr>
    </c:if>
    <td>
    <b>Κατηγορία:</b><c:out value="${row.katigoria}"/><br />
    <b>Είδος:</b><c:out value="${row.eidos}"/><br />
    <b>Έτος κατασκευής:</b><c:out value="${row.etos}"/><br />
    <b>Παλιά τιμή:</b><c:out value="${row.p_timi}"/><br />
    <b>Καινούρια τιμή:</b><c:out value="${row.k_timi}"/><br />
    <b>Κωδικός αντικειμένου:</b><c:out value="${row.kwdikos}"/><br />
    <b>Για περισσότερες πληροφορίες πατήστε<b>
    <a href="<c:url value="/ShowItem?action=show&kwdikos=${row.kwdikos}&user=${row.usernm}" />">
    εδω
    </a>
    <br />
    <br />
    </td>
    <c:if test="${seira.index + 1 % tablewidth == 0}">
	</tr>
    </c:if>
</c:forEach>
   </table>
   </div>
        
</body>
</html>