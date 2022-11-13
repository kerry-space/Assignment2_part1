package org.example.model;


import java.lang.Object;

import org.example.model.Person;

import java.time.LocalDate;

public class TodoItem {

    private int sequence = 100;

    //Fields
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;


    //Constructor
    public TodoItem(){
        this.id = sequence++;
        this.deadLine = LocalDate.of(2023,3,3);
    }

    public TodoItem(String title, String taskDescription){
        this();
        this.title = title;
        this.taskDescription =taskDescription;

    }


    //Getter & Setter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("title para was null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {

        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {

        if(deadLine == null)  throw new  IllegalArgumentException("deadLine para was null");

            this.deadLine = deadLine;
            this.done =true;

    }

    public boolean getDone(){
        return this.done;
    }
    public void setDone(boolean done) {

        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }


    //methods
    public boolean isOverdue(){
        //should return true if current data has passed deadLine
        LocalDate currentTime = LocalDate.of(2022,9,12);

        if(currentTime.isAfter(deadLine)){
            return true;
        }

        return false;
    }

    @Override
    public  String toString(){

        return "id: "+id+" "+"title: "+title+" "+"taskDescription: "+taskDescription+" "+"deadLine: "+deadLine;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
