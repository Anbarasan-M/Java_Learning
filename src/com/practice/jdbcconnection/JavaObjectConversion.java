package com.practice.jdbcconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JavaObjectConversion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Anbu@mysql123");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from employees");

            List<Employee> employeeList = new ArrayList<>();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setFirstName(rs.getString(2));
                employee.setLastName(rs.getString(3));
                employee.setEmail(rs.getString(4));
                employee.setPhoneNumber(rs.getString(5));
                employee.setHireDate(rs.getString(6));

                employeeList.add(employee);
                // Now you have an Employee object representing the current row in the ResultSet
                System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getEmail() + " " + employee.getPhoneNumber() + " " + employee.getHireDate());
            }

            System.out.println(employeeList);
            con.close();
            st.close();

        } catch (Exception e) {
            System.out.println("Connection failed due to " + e);
        }
    }
}
