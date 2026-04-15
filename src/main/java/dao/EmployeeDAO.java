package dao;
import java.sql.*;
import java.util.*;

import model.Employee;
public class EmployeeDAO {
	

    Connection con;

    public EmployeeDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/empdb",
            "root", "Anup@7102");
    }
    public void addEmployee(Employee e) throws Exception {
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO employee(name, salary) VALUES (?, ?)");
        ps.setString(1, e.getName());
        ps.setDouble(2, e.getSalary());
        ps.executeUpdate();
    }
    public List<Employee> getAll() throws Exception {
        List<Employee> list = new ArrayList<>();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        while (rs.next()) {
            list.add(new Employee(
                rs.getString("name"),
                rs.getDouble("salary")
            ));
        }
        return list;
    }

}
