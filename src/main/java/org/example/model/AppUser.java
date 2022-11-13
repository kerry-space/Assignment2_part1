package org.example.model;

import org.example.App;
import  java.lang.Object;

public class AppUser {
    //fields
    private String username;
    private String password;
    private AppRole role;

    //Constructor
    public AppUser(String username, String password, AppRole role){
        this.username = username;
        this.password = password;
        this.role = role;
    }


    //getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null || username.length() == 0) throw  new IllegalArgumentException("your para is empty");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.length() == 0) throw  new IllegalArgumentException("your para is empty");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role == null ) throw  new IllegalArgumentException("para is empty");
        this.role = role;
    }

    //methods
    @Override
    public boolean equals(Object obj){
          return this == obj;
    }


    public int hashCode(Object obj){

        return this.getPassword().hashCode();

    }

    @Override
    public String toString(){
        return "username: "+username+" "+getRole();
    }
}
