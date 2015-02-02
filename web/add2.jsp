<%-- 
    Document   : add2
    Created on : Jan 15, 2015, 9:49:34 PM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>

<p id="loginfirst">
    <b>Λυπούμαστε αλλά για να εισέλθετε στα δεδομένα αυτά θα πρέπει αν είστε εγγεγραμμένος χρήστης να συνδεθείτε στο σύστημα. Από την άλλη, αν δεν είστε εγγεγραμμένος χρήστης θα μπορούσατε να δημιουργήσετε το δικό σας προφίλ στο σύστημά μας κάνοντας απλά μια εγγραφή.</b>
</p>

<div id="eggr_sund">
    <b>Για σύνδεση πατήστε </b>
    <a href="login.jsp">
    εδω
    </a>
    <b>Για εγγραφή πατήστε </b>
    <a href="register.jsp">
    εδω
    </a>
</div>

<div id="epistrofi">
    <a href="index.jsp">
    Επιστροφη στην αρχικη σελιδα &#8592;
    </a>
</div>

<div id="pleaselogin">
    <img src="${pageContext.request.contextPath}/image/pleaselogin.jpg" alt="eisodos" width="700" height="300" />
</div>

<c:import url="footer.jsp"></c:import>
