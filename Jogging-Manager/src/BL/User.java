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

    public User(String username, String firstname, String lastname, int weight, LocalDate birthday) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    
}
