<%-- 
    Document   : add
    Created on : Jan 15, 2015, 8:03:18 PM
    Author     : popi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="header2.jsp">
    <c:param name="title" value="StockSell"></c:param>
</c:import>

<p id="add">
    <b>Επιλέξτε την κατηγορία στην οποία ανήκει το αντικείμενο που θέλετε να πουλήσετε και έπειτα συμπληρώστε τα στοιχεία που θεωρείτε απαραίτητα για την περιγραφή του αντικειμένου. Τα πεδία Διεύθυνση ηλεκτρονικού ταχυδρομείου και Κωδικός αντικειμένου είναι υποχρεωτικά!</b>
</p>

<div id="add2">
    <form method="post" action="${pageContext.request.contextPath}/AddItem">
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
        Είδος: <input type="text" name="eidos" placeholder="Είδος"/>
        <br />
        <br />
        Έτος κατασκευής: <input type="text" name="etos" placeholder="Έτος κατασκευής"/>
        <br />
        <br />
        Παλιά τιμή: <input type="text" name="p_timi" placeholder="Παλιά τιμή"/>
        <br />
        <br />
        Καινούρια τιμή: <input type="text" name="k_timi" placeholder="Καινούρια τιμή"/>
        <br />
        <br />
        Χρώμα: <input type="text" name="xrwma" placeholder="Χρώμα"/>
        <br />
        <br />
        Νούμερο: <input type="text" name="noumero" placeholder="Νούμερο"/>
        <br />
        <br />
        Φύλο: <input type="text" name="fulo" placeholder="Φύλο"/>
        <br />
        <br />
        Μοντέλο: <input type="text" name="montelo" placeholder="Μοντέλο"/>
        <br />
        <br />
        Άλλες πληροφορίες: <input type="text" name="more" placeholder="Άλλες πληροφορίες"/>
        <br />
        <br />
        Διεύθυνση ηλεκτρονικού ταχυδρομείου: <input type="text" name="stoixeia" placeholder="Email"/>
        <br />
        <br />
        Κωδικός αντικειμένου: <input type="text" name="kwdikos" placeholder="Κωδικός Αντικειμένου"/>
        <br />
        <br />
        <input type="submit" value="Υποβολή" style="width:80px;height:30px;background-color:#6B5344;color:white;font-size:60%">
    </form>
</div>


<c:import url="footer.jsp"></c:import>