package controller;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Employee;

import java.io.IOException;

import dao.EmployeeDAO;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        double salary = Double.parseDouble(req.getParameter("salary"));

        try {
            EmployeeDAO dao = new EmployeeDAO();
            dao.addEmployee(new Employee(name, salary));

            res.sendRedirect("home"); // back to list

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}