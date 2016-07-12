package world.controller;
/**
 * @author HGonge
 * Date 11July2016
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import world.dao.RegisterDao;
import world.model.City;
import world.model.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		RegisterDao registerDao = new RegisterDao();
		world.model.Register register=parseRequest(request);
		int result = registerDao.insertRecord(register);
		if(result==1)
		{
			session.setAttribute("NewUser", "Registered Successfully!!");
			response.sendRedirect("Login.jsp");
		}
		else if(result ==2)
		{
			session.setAttribute("ExistUser", "User Already Exists!!");
			response.sendRedirect("Register.jsp");
		}
		else
		{
			session.setAttribute("NewUser", "Enter Proper Values!");
			response.sendRedirect("Register.jsp");
		}	
	}
	private world.model.Register parseRequest(HttpServletRequest request) throws ServletException, IOException {
		world.model.Register register=new Register();
		register.setFirstName(request.getParameter("firstName"));
		register.setLastName(request.getParameter("lastName"));
		register.setEmail(request.getParameter("email"));
		register.setPassword(request.getParameter("password"));
		return register;
	}
	

}
