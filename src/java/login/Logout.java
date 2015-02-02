package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

/**
 *
 * @author popi
 */
public class Logout extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=utf-8"); 
        request.setCharacterEncoding("UTF-8");
        String errorMsg = null;
        
        Cookie ck=new Cookie("username","");  
        ck.setMaxAge(0);  
        response.addCookie(ck); 
        PrintWriter out= response.getWriter();
        HttpSession session=request.getSession(); 
        session.getAttribute("User");
        session.invalidate();
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.include(request, response);
        errorMsg="Έχετε αποσυνδεθεί επιτυχώς από το σύστημα!!!";
        out.println("<center style=\"top:230px;left:350px;position:absolute;font-size:200%\"><font color=green>"+errorMsg+"</font></center>");  
              
        out.close();  
    }
}
