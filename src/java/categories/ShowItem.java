package categories;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author popi
 */
public class ShowItem extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Map<String, String> actionMap = new HashMap<String, String>();

    public ShowItem() { //whatever ?action=something we give map it to a jsp
		// Build a Map of action parameters to pages

		actionMap.put("show", "/show.jsp");
                actionMap.put("show2", "/show2.jsp");
		actionMap.put("home", "/index.jsp");
                
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
    }

    private void doForward(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		// Get the action parameter
	String action = request.getParameter("action");

		// If the action parameter is null or the map doesn't contain
		// a page for this action, set the action to the home page
	if (action == null || !actionMap.containsKey(action))
		action = "home";

		// Forward to the requested page.
            request.getRequestDispatcher(actionMap.get(action)).forward(request,
				response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
    @Override
    protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {

	doForward(request, response);

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
    @Override
    protected void doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {

	doForward(request, response);
    }

}


