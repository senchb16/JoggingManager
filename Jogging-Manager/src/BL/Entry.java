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
    
    
    
}
