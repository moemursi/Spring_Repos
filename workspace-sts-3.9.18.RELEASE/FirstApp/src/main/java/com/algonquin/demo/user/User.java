package com.algonquin.demo.user;

import com.algonquin.demo.location.Location;

public class User {
	private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;  
    private Location location;

    public User(String id, String firstName, String lastName, String email, String phone,Location location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

    public String getId() {
        return id;

    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() { 
        return  firstName + " " + lastName;
     }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

}
