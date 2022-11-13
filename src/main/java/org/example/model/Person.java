package org.example.model;

import org.example.model.AppUser;

public class Person {
    private int sequence = 10;

    //Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private AppUser credentials;

    //constructors
    public Person(){

        this.id = sequence++;
    }

    public Person(String firstName, String lastName, String email){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //Getters & Setter


    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null) throw  new IllegalArgumentException("firstname para was null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null) throw  new IllegalArgumentException("lastName para was null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null) throw new IllegalArgumentException("email para was null");
        this.email = email;
    }


    //method
    public String getSummary(){
        return "id:"+id+" "+"name:"+firstName+" "+lastName+" "+"email:"+email;
    }
}
