/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import BL.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Christoph
 */
public class DataBaseConnection {
   
    
    private final Connection conn;
    
    public DataBaseConnection(String user, String password) throws SQLException{
       conn = DriverManager.getConnection("jdbc:postgresql://localhost/jogging-db", user, password);
       
    }
    
    public void addUser(User u){
        
        try {
            String sql = "INSERT INTO Users VALUES('"+u.getUsername()+"',"
                    + "'"+u.getFirstname()+"',"
                    + "'"+u.getLastname()+"',"
                    + ""+u.getWeight()+","
                    + "TO_DATE('"+u.getBirthday().toString()+"', 'yyyy-mm-dd'));";
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"User added successfully!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        
        
    
    
}
