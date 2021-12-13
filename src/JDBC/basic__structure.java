package JDBC;

import java.sql.*;

public class basic__structure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.JDBC.Driver");
        Connection con= DriverManager.getConnection("","root","");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("this will contzin query ");


    }
}
