package register;
 
import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author popi
 */
public class Register extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/stocksell")
    private DataSource mydata;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Connection conn=null;
        String errorMsg = null;
           
            
        if( name.equals("") || surname.equals("") || email.equals("") || username.equals("") || password.equals("") ){
            errorMsg="Όλα τα πεδία είναι υποχρεωτικά!";
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/register.jsp");
            PrintWriter out= response.getWriter();
            out.println("<center style=\"top:260px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
            rd.include(request, response);
        }
        
           
        else{
            PrintWriter out= response.getWriter();
            PrintWriter out2= response.getWriter();
            ResultSet rs = null;
            ResultSet rs2 = null;
            boolean st=false;
            boolean st2=false;
            try {
                
                conn = mydata.getConnection();
                String sql1 = "SELECT * FROM eggrafi WHERE Username=?";
                String sql2 = "SELECT * FROM eggrafi WHERE Email=?";
                PreparedStatement pre = conn.prepareStatement(sql1);
                PreparedStatement pre2 = conn.prepareStatement(sql2);
                pre.setString(1, username);
                pre2.setString(1, email);
                rs=pre.executeQuery();
                rs2=pre2.executeQuery();
                st = rs.next();
                st2 = rs2.next();
                
                if(st){
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/register.jsp");
                    errorMsg="Το όνομα χρήστη χρησιμοποιείται.Επιλέξτε διαφορετικό όνομα χρήστη!";
                    out.println("<center style=\"top:260px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                else if(st2){
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/register.jsp");
                    errorMsg="Το email χρησιμοποιείται.Επιλέξτε διαφορετικό email!";
                    out.println("<center style=\"top:260px;left:400px;position:absolute;font-size:150%\"><font color=red>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                else{
                    String sql = "INSERT INTO eggrafi VALUES (?,?,?,?,?)";
                    PreparedStatement prep = conn.prepareStatement(sql);

                    prep.setString(1, name);
                    prep.setString(2, surname);
                    prep.setString(3, email);
                    prep.setString(4, username);
                    prep.setString(5, password);
                    prep.executeUpdate();

                    errorMsg="Η εγγραφή σας πραγματοποιήθηκε επιτυχώς!";
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
                    out.println("<center style=\"top:280px;left:400px;position:absolute;font-size:150%\"><font color=green>"+errorMsg+"</font></center>");
                    rd.include(request, response);
                }
                
            }catch(Exception E){
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
    }
}
