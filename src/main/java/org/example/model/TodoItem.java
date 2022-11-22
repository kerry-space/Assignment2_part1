package org.example.model;


import java.lang.Object;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {



    //Fields
    private Integer id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;


    //Constructor

    public TodoItem(String title, String taskDescription, LocalDate deadLine, Person creator) {
        setTitle(title);
       setTaskDescription(taskDescription);
        setDeadLine(deadLine);
        setCreator(creator);
    }


    //Getter & Setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if(taskDescription == null) throw new IllegalArgumentException("taskDescription is null");
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

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        if(creator == null) throw new IllegalArgumentException("creator is null");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && Objects.equals(deadLine, todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }
}
