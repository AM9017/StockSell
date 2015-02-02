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

/**
 *
 * @author popi
 */
public class Categories2 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/stocksell")
    private DataSource mydata;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");
        
        PrintWriter out= response.getWriter();
        String errorMsg = null;
        String katigoria = request.getParameter("katigoria");
        
        if(katigoria.equals("epilogi") ){
            errorMsg="Παρακαλώ συμπληρώστε κατηγορία αναζήτησης!";
        }
        if(errorMsg!=null){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/categories2.jsp");
            out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        
        if(katigoria.equals("rouxa")){
            try{
                request.setAttribute("katigoria", "rouxa");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("papoutsia")){
            try{
                request.setAttribute("katigoria", "papoutsia");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("accessories")){
            try{
                request.setAttribute("katigoria", "accessories");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("spiti")){
            try{
                request.setAttribute("katigoria", "spiti");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("suskeues")){
            try{
                request.setAttribute("katigoria", "suskeues");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("texnologia")){
            try{
                request.setAttribute("katigoria", "texnologia");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                rd.include(request, response);
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
        }
        if(katigoria.equals("alla")){
            try{
                request.setAttribute("katigoria", "alla");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/scategory2.jsp");
                errorMsg="Εδώ φαίνονται τα αποτελέσματα της αναζήτησής σας.";
                out.println("<center style=\"top:230px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
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
