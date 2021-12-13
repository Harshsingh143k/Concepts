package JDBC;

import java.sql.*;

public class jdbc_testing {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jc.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from employe");

    }
}
