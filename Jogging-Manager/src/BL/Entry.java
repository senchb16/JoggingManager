/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.time.LocalDate;

/**
 *
 * @author Christoph
 * Class Entry, 
 * to store the data of the entry
 */

public class Entry {
    private LocalDate date;
    private int distance;
    private String username;
    private double cal;
    
    /**
     * 
     * @param date  LocalDate
     * @param distance  int
     * @param username  String
     * 
     */
    public Entry(LocalDate date, int distance, String username) {
        this.date = date;
        this.distance = distance;
        this.username = username;
    }
    
    /**
     * 
     * @return date - LocalDate
     */
    public LocalDate getDate() {
        return date;
    }
    
    /**
     * 
     * @return distance - int
     */
    public int getDistance() {
        return distance;
    }
    
    /**
     * 
     * @return username - String
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * 
     * @param kg  int
     */
    public void calcCalories(int kg){
        this.cal = distance * kg * 0.9;
    }
    
    /**
     * 
     * @return calories - double
     * calculates the calories, depentend on weight and distance
     */
    public double getCalories(){
        return cal;
    }
    
    /**
     * 
     * @param cal double
     */
    public void setCalories(double cal){
        this.cal = cal;
    }
    
    /**
     * 
     * @param username String 
     */
    public void setUsername(String username){
        this.username = username;
    }
    
    
    
}
