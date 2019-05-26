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
 */
public class Entry {
    private LocalDate date;
    private int distance;
    private String username;
    private double cal;

    public Entry(LocalDate date, int distance, String username) {
        this.date = date;
        this.distance = distance;
        this.username = username;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDistance() {
        return distance;
    }

    public String getUsername() {
        return username;
    }
    
    public void calcCalories(int kg){
        this.cal = distance * kg * 0.9;
    }
    
    public double getCalories(){
        return cal;
    }
    
    public void setCalories(double cal){
        this.cal = cal;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    
    
}
