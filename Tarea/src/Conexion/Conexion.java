package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion() throws SQLException{

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
