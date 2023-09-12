package com.practice.JDBCConnection;
import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args){}     static {

        try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "Anbu@mysql123");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from employees");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
        }

        con.close();
        st.close();

        }catch(Exception e){ System.out.println(e);}

    }
}