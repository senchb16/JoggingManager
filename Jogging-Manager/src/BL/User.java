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
public class User {
    private String username;
    private String firstname;
    private String lastname;
    private int weight;
    private LocalDate birthday;
    
    /**
     * 
     * @param username String
     * @param firstname String
     * @param lastname String
     * @param weight int
     * @param birthday LocalDate
     */
    public User(String username, String firstname, String lastname, int weight, LocalDate birthday) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.birthday = birthday;
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
     * @return firstname - String
     */
    public String getFirstname() {
        return firstname;
    }
    
    /**
     * 
     * @return lastname - String
     */
    public String getLastname() {
        return lastname;
    }
    
    /**
     * 
     * @return weight - int
     */
    public int getWeight() {
        return weight;
    }
    
    /**
     * 
     * @return bitrthday - LocalDate
     */
    public LocalDate getBirthday() {
        return birthday;
    }
    
    
}
