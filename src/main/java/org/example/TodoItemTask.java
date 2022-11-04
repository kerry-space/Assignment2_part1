package org.example;

import java.util.EnumMap;

public class TodoItemTask {
    private int sequence = 1001;
    //fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //Constructor
    public TodoItemTask(){

        this.id = sequence++;


    }


    //Getter & Setter
    public int getId() {
        return id;
    }

    public boolean IsAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {

        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todoItem para was null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if(assignee == null) throw new IllegalArgumentException("assignee para was null");
        this.assignee = assignee;
        this.assigned = true;
    }

    //Methods
    public String getSummary(){

        return assignee.getSummary();
    }
}
