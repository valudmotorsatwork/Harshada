package world.controller;
/**
 * @author HGonge
 * Date 11July2016
 */
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.util.Util.Displayable;

import world.dao.LoginDao;  

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {  
        LoginDao loginDao = new LoginDao();        
        HttpSession session=request.getSession();  
              
        Boolean flag = loginDao.validate(request.getParameter("userName"), request.getParameter("password"));
        if(flag)
        {
        	session.setAttribute("userName","Welcome "+request.getParameter("userName"));
        	response.sendRedirect("Display.jsp");
        }	
        else
        {
        	session.setAttribute("ErrorMsg", "Enter Proper User Name and Password");
        	response.sendRedirect("Login.jsp");
        }
    }  
}  