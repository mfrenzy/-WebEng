package at.ac.tuwien.big.we15.lab2.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.ac.tuwien.big.we15.lab2.api.bean.Userinformation;

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
		//Caller contains the full url of the calling jsp (in case of login, it may be "empty" "localhost:8080/proj/")
		// otherwise it will end in "/login.jsp" or "/jeopardy.jsp",...)
		String caller = request.getHeader("Referer");
		if (caller.endsWith("jeopardy.jsp")) {
			//check current status
			Userinformation ui = (Userinformation)request.getSession().getAttribute("beanid");
			ui.setScore(10007);
			//make decision for next move
			//set sessionAttributes to be used in jsp-files (assign question-ids?!)
		} else if (caller.endsWith("/") || caller.endsWith("login.jsp")) {
			//handle login
			Userinformation ui = new Userinformation();
			ui.setUserName(request.getParameter("username"));
			ui.setPassword(request.getParameter("password"));
			request.getSession().setAttribute("beanid", ui);
			
			response.sendRedirect("jeopardy.jsp");
		} else if (caller.endsWith("question.jsp")) {
			//handle a submitted question
		} else if (caller.endsWith("winner.jsp")) {
			//handle the winner-redirection
		}
		if (this.username.length() == 0) { //first time!?
			this.username = request.getParameter("username");
			this.password = request.getParameter("password");
			
//			request.getSession().setAttribute("username", username);
		} else { //alle anderen male
		}
	}

}
