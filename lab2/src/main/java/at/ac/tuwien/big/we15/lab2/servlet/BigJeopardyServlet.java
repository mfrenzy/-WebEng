package at.ac.tuwien.big.we15.lab2.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BigJeopardyServlet
 */
@WebServlet(description = "This is the Main-servlet for Jeopardy, handling the control flow of .. well.. everything :D", urlPatterns = { "/BigJeopardyServlet" })
public class BigJeopardyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BigJeopardyServlet() {
        super();
        // TODO Auto-generated constructor stub
		username = "";
		password = "";
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// vielleicht für später einmal?!
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// main-method for communication :D almost everything will be found in here
		if (this.username.length() == 0) { //first time!?
			this.username = request.getParameter("username");
			this.password = request.getParameter("password");
			response.encodeRedirectURL("jeopardy.jsp");
			response.encodeUrl("jeopardy.jsp");
		} else { //alle anderen male
			
		}
	}

}
