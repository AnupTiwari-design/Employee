package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	 protected void doPost(HttpServletRequest req, HttpServletResponse res)
	            throws IOException, ServletException {

	        String user = req.getParameter("username");
	        String pass = req.getParameter("password");

	        if (user.equals("admin") && pass.equals("123")) {
	            req.getSession().setAttribute("user", user);
	            res.sendRedirect("home");
	        } else {
	            res.sendRedirect("login.jsp");
	        }
	
	 }
}
