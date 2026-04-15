package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.EmployeeDAO;
@WebServlet("/home")
public class EmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            EmployeeDAO dao = new EmployeeDAO();
            req.setAttribute("list", dao.getAll());
            req.getRequestDispatcher("home.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
	
