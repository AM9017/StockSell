package login;

import java.io.*;
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
import javax.servlet.http.Cookie;

/**
 *
 * @author popi
 */
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/stocksell")
    private DataSource mydata;
    
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String errorMsg = null;
        
        if(username==null || username.equals("") || password==null || password.equals("")){
            errorMsg="Παρακαλώ συμπληρώστε όνομα και κωδικό χρήστη!";
        }
        if(errorMsg!=null){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
            PrintWriter out= response.getWriter();
            out.println("<center style=\"top:260px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        else{
            PrintWriter out= response.getWriter();
            PreparedStatement ps = null;
            ResultSet rs = null;
            boolean st=false;
            try {
                
                Connection conn = mydata.getConnection();
                String sql = "SELECT * FROM eggrafi WHERE Username=? and Password=?";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, username);
                pre.setString(2, password);
                rs = pre.executeQuery();
                st = rs.next();
                
                if(st){
                    User user = new User(rs.getString("name"), rs.getString("surname"), rs.getString("email"), rs.getString("username"), rs.getString("password"));
                    Cookie ck = new Cookie("name",username);  
                    response.addCookie(ck); 
                    HttpSession session = request.getSession();
                    session.setAttribute("User",user);
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
                    errorMsg="Καλώς ήρθες στην ιστοσελίδα μας!!!";
                    out.println("<center style=\"top:280px;left:350px;position:absolute;font-size:200%\"><font color=green>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                else{
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
                    errorMsg="Παρακαλώ συμπληρώστε τα σωστά στοιχεία!";
                    out.println("<center style=\"top:260px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                
            }
            catch(Exception E){
                System.out.println("The error is=>");
                System.out.println(E);
            }
            finally{
                out.close();
            }
           
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
