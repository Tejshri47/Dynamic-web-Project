package org.webapp.reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.webapp.Dao.Reg_dao;
import org.webapp.Regmodel.Reg_model;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Regpath")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Reg_dao obj;
public void init() {
	obj=new Reg_dao();}

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
        super();
        //  Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//RequestDispatcher disp1= request.getRequestDispatcher("WebContent/succ.jsp");
		//disp1.forward(request, response);
	
	//}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String eid=request.getParameter("eid");
	String name=request.getParameter("name");
	String age=request.getParameter("age");
	//Reg_dao obj= new Reg_dao();
	Reg_model model =new Reg_model();
		model.setEid(eid);
		model.setName(name);
		model.setAge(age);
		try
		{
			obj.test(model);
			
	}
	
	catch(Exception e) {
		
e.printStackTrace();	}
		
	//RequestDispatcher disp1= request.getRequestDispatcher("WebContent/reg.jsp");
	//disp1.forward(request, response);
	response.sendRedirect("succ.jsp");
}}
