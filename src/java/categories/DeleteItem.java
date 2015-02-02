package categories;

import java.sql.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.servlet.http.HttpSession;
import user.User;
/**
 *
 * @author popi
 */
public class DeleteItem extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/stocksell")
    private DataSource mydata;
    
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");
        String kwdikos = request.getParameter("kwdikos");
        PrintWriter out= response.getWriter();
        String errorMsg = null;
        
        if(kwdikos==null || kwdikos.equals("") ){
            errorMsg="Παρακαλώ συμπληρώστε κωδικό αντικειμένου!";
        }
        if(errorMsg!=null){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/info.jsp");
            out.println("<center style=\"top:240px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        
        else{
            ResultSet rs = null;
            boolean st=false;
            
            try {
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("User");
                String usernm = user.getUsername();
                Connection conn = mydata.getConnection();
                String sql = "SELECT * FROM category WHERE kwdikos=? and usernm=?";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, kwdikos);
                pre.setString(2, usernm);
                rs = pre.executeQuery();
                st = rs.next();
                if(st){
                    String sql1 = "DELETE FROM category WHERE kwdikos=? and usernm=?";
                    PreparedStatement prep = conn.prepareStatement(sql1);
                    prep.setString(1, kwdikos);
                    prep.setString(2, usernm);
                    prep.executeUpdate();
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
                    errorMsg="Το αντικείμενο έχει διαγραφεί!!!";
                    out.println("<center style=\"top:340px;left:350px;position:absolute;font-size:200%\"><font color=green>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                else{
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/info.jsp");
                    errorMsg="Παρακαλώ συμπληρώστε τον σωστό κωδικό αντικειμένου!";
                    out.println("<center style=\"top:240px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }

                out.close();

            }   
        }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
