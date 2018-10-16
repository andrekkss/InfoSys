/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author linux
 */
public class ConnectionFactory {

    private static final String URL = "jdbc:sqlite:/home/andre/InfoSys/db/InfoSysDB.db";
    //private static final String URL = "jdbc:mysql://192.168.0.50:3306/Faculdade";
    //private static final String USER = "InfoSys";
    //private static final String PASSWORD = "infosys";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
            //return DriverManager.getConnection(URL,USER,PASSWORD);        
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão com o banco de dados!");
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }
    
    public static void closeConnection(Connection con,PreparedStatement psl, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            closeConnection(con, psl);
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }
      
     public static void closeConnection(Connection con,PreparedStatement psl) {
        try {
            if (psl != null) {
                psl.close();
            }
            closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }
     
}
