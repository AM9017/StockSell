package categories;

import java.io.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.servlet.http.HttpSession;
import user.User;
/**
 *
 * @author popi
 */
public class AddItem extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/stocksell")
    private DataSource mydata;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");
        
        String katigoria = request.getParameter("katigoria");
        String eidos = request.getParameter("eidos");
        String etos = request.getParameter("etos");
        String p_timi = request.getParameter("p_timi");
        String k_timi = request.getParameter("k_timi");
        String xrwma = request.getParameter("xrwma");
        String noumero = request.getParameter("noumero");
        String fulo = request.getParameter("fulo");
        String montelo = request.getParameter("montelo");
        String more = request.getParameter("more");
        String stoixeia = request.getParameter("stoixeia");
        String kwdikos = request.getParameter("kwdikos");
        PrintWriter out= response.getWriter(); 
        String errorMsg = null;
        
        if(katigoria.equals("epilogi") ){
            errorMsg="Παρακαλώ συμπληρώστε κατηγορία αναζήτησης!";
        }
        if(errorMsg!=null){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/add.jsp");
            out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        
        else if( stoixeia.equals("") || kwdikos.equals("")){
            errorMsg="Τα πεδία διεύθυνση ηλεκτρονικού ταχυδρομείου και κωδικός αντικειμένου είναι υποχρεωτικά!";
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/add.jsp");
            out.println("<center style=\"top:230px;left:300px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        else{
            try{
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("User");
                String usernm = user.getUsername();
                Connection conn = mydata.getConnection();
                String sql = "INSERT INTO category VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, katigoria);
                pre.setString(2, eidos);
                pre.setString(3, etos);
                pre.setString(4, p_timi);
                pre.setString(5, k_timi);
                pre.setString(6, xrwma);
                pre.setString(7, noumero);
                pre.setString(8, fulo);
                pre.setString(9, montelo);
                pre.setString(10, more);
                pre.setString(11, stoixeia);
                pre.setString(12, kwdikos);
                pre.setString(13, usernm);
                pre.executeUpdate();

                RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
                errorMsg="Το αντικείμενό σας προστέθηκε με επιτυχία!";
                out.println("<center style=\"top:280px;left:330px;position:absolute;font-size:200%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }                                   
        out.close();
    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold

}
