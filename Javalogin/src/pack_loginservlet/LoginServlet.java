package pack_loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack_dto.LoginService;
import pack_dto.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Loginpath")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid,password;
		 userid=request.getParameter("name");
		 password=request.getParameter("password");
		 
		 LoginService lg=new LoginService();
		 boolean result =lg.Authentication(userid, password);
		 
		 if (result) {
			 
			 User user =lg.getuserdetails(userid);
			 request.setAttribute("user", user);
			 RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.jsp");
			 dispatcher.forward (request,response);
			 return;
		 }
		 else {
			 PrintWriter pw=response.getWriter();
			 //pw.println("kindly write the correct password");
			 response.sendRedirect("login.jsp");
			 return;
	}

	}}
