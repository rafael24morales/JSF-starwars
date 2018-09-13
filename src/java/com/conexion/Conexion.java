/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.*;


/**
 *
 * @author rafaelm
 */
public class Conexion {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/starwars?useSSL=false";
    private static final String JDBC_USER= "root";
    private static final String JDBC_PASS= "mysqlroot";
    private static Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver == null){
            try{Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
            driver = (Driver) jdbcDriverClass.newInstance();
            DriverManager.registerDriver(driver);}
            catch(Exception ex){
                ex.printStackTrace();
                }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
      public static void close(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
     public static void close(Statement stm){
        try{
            if(stm != null){
                stm.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
 
    public static void close(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    
}
