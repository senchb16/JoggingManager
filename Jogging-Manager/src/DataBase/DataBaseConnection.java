/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import BL.Entry;
import BL.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christoph
 */
public class DataBaseConnection {

    private final Connection conn;
    
    /**
     * 
     * @param user String
     * @param password String
     * @throws SQLException 
     */
     
    public DataBaseConnection(String user, String password) throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost/jogging-db", user, password);

    }
    
    /**
     * 
     * @param u User 
     */
    public void addUser(User u){

        
        try {
            String sql = "INSERT INTO Users VALUES('" + u.getUsername() + "',"
                    + "'" + u.getFirstname() + "',"
                    + "'" + u.getLastname() + "',"
                    + "" + u.getWeight() + ","
                    + "TO_DATE('" + u.getBirthday().toString() + "', 'yyyy-mm-dd'));";
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "User added successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
    /**
     * 
     * @return ArrayList
     * @throws SQLException 
     */
    public ArrayList<String> getUsers() throws SQLException {
        ArrayList<String> usernames = new ArrayList<>();
        String sql = "SELECT * FROM Users";

        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);

        while (rs.next()) {
            String username = rs.getString("username");
            usernames.add(username);
        }
        return usernames;
    }
    
    /**
     * 
     * @param e Entry
     */
    public void addEntry(Entry e){
        
        try {
            String sql = "INSERT INTO Entry VALUES('" + e.getUsername() + "',"
                    + "TO_DATE('" + e.getDate().toString() + "', 'yyyy-mm-dd'),"
                    + "" + e.getDistance() + ","
                    + "" + e.getCalories() + ");";
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Entry added successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * 
     * @param username String
     * @return kg - int
     */
    public int getWeight(String username) {
        int kg = 0;
        try {

            String sql = "SELECT weight FROM Users WHERE username = '" + username + "';";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                kg = rs.getInt("weight");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kg;
    }
    
    /**
     * 
     * @param username
     * @return ArrayList
     */
    public ArrayList<Entry> getEntries(String username) {
        ArrayList<Entry> entries = new ArrayList<>();
        try {

            String sql = "SELECT * from Entry WHERE username = '" + username + "';";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Entry e = new Entry(rs.getObject("date", LocalDate.class), rs.getInt("distance"), rs.getString("username"));
                e.setCalories(rs.getDouble("calories"));
                entries.add(e);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entries;

    }

}
