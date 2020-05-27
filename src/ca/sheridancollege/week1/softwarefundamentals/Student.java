/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Dell
 */
public class Student {
    
    private String name;
    
    private String email;
    
    private String numOfHours;

    /**
     * Get the value of numOfHours
     *
     * @return the value of numOfHours
     */
    public String getNumOfHours() {
        return numOfHours;
    }

    /**
     * Set the value of numOfHours
     *
     * @param numOfHours new value of numOfHours
     */
    public void setNumOfHours(String numOfHours) {
        this.numOfHours = numOfHours;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
