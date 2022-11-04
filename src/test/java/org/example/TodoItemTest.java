package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TodoItemTest extends TestCase {
     TodoItem work = new TodoItem("build app", "build my own space content activity");
    @Test
    public void testGetTitle() {
        work.setTitle("build app");
        String expectedTitle = "build app";
        String acutalTitle = work.getTitle();
        Assert.assertEquals(expectedTitle, acutalTitle);
        Assert.assertNotEquals("one way in", acutalTitle);
    }




    public void testGetTaskDescription() {
        work.setTaskDescription("Build space app community");
        String expectedDescription = "Build space app community";
        String actualDescription = work.getTaskDescription();
        Assert.assertEquals(expectedDescription, actualDescription);
        Assert.assertNotEquals("adiwd awdhnawioud iohudawn", actualDescription);
    }


    public void testGetDeadLine() {
        work.setDeadLine(LocalDate.of(2023,06,6));
        LocalDate expectedDeadLine = LocalDate.of(2023,06,6);
        LocalDate actualDeadLine = work.getDeadLine();
        Assert.assertEquals(expectedDeadLine, actualDeadLine);
        Assert.assertNotEquals(LocalDate.of(2024,03,3), actualDeadLine);
    }



    public void testGetDone() {

    }



    public void testGetCreator() {
        work.setCreator(new Person("kerry","space", "kerryspace@gmail.com"));
        Person expectedCreator = new Person("kerry","space", "kerryspace@gmail.com");
        Person actualCreator = work.getCreator();
        Assert.assertEquals(expectedCreator, actualCreator);
        //Assert.assertNotEquals(new  Person("hello","one", "kerryspace@gmail.com"), actualCreator);
    }



    public void testIsOverdue() {
    }

    public void testGetSummary() {
    }
}