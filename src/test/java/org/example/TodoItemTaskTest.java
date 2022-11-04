package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

public class TodoItemTaskTest extends TestCase {
    TodoItemTask task = new TodoItemTask();
    public void testIsAssigned() {
        task.setAssigned(true);
        Boolean expectedAssigned = true;
        boolean actaulAssigned = task.IsAssigned();
        Assert.assertEquals(expectedAssigned, actaulAssigned);
        Assert.assertNotEquals(false,actaulAssigned);
    }



    public void testGetTodoItem() {
        task.setTodoItem(new TodoItem("build app","building space content sharing community. everything about astronomy, space travel"));
        System.out.println(task.getTodoItem().getTaskDescription());
        TodoItem expectedTodoItem = new TodoItem("build app","building space content sharing community. everything about astronomy, space travel");
        TodoItem actualTodoItem = task.getTodoItem();
       // Assert.assertEquals(expectedTodoItem,actualTodoItem);
        Assert.assertNotEquals(new TodoItem("build website","share ideas "), actualTodoItem);
    }



    public void testGetAssignee() {
        task.setAssignee( new Person("kerry", "space","kerryspace@gmail.com"));
        Person expectedAssigne =  new Person("kerry", "space","kerryspace@gmail.com");
        Person actaulAssigne = task.getAssignee();
        //Assert.assertEquals(expectedAssigne,actaulAssigne);
        Assert.assertNotEquals( new Person("Love", "one","kerryspace@gmail.com"), actaulAssigne);
    }



    public void testGetSummary() {

    }
}