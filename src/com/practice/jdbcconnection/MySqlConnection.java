package com.practice.jdbcconnection;
import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args){}     static {

        try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "Anbu@mysql123");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from players");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }

        con.close();
        st.close();

        }catch(Exception e){ System.out.println("Exception " + e );}

    }
}