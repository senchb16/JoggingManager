/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Christoph
 */
public class DataBaseConnection {
   
    private final Connection conn;
    
    public DataBaseConnection(String user, String password) throws SQLException{
       conn = DriverManager.getConnection("jdbc:postgresql://localhost/pet-db", user, password);
    }
    
}
