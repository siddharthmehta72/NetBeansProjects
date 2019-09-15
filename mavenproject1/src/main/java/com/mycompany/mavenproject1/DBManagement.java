/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Siddharth
 */
public class DBManagement {
    public Connection getConnection() throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://springapp.cyuulvm4rpqm.us-east-2.rds.amazonaws.com:3306/SpringAppTest","admin","password");
            return conn;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        
    }
}