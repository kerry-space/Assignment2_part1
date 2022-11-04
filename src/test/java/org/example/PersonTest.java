package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person kerry = new Person("kerry", "space","kerryspace@gmail.com");
    @Test
    public void testGetId() {
        int expectedId = 10;
        int actualId = kerry.getId();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertNotEquals(1001,actualId);
    }

    @Test
    public void testGetFirstName() {
        String expectedFirstName = "kerry";
        String actualFirstName = kerry.getFirstName();
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertNotEquals("hello", actualFirstName);
    }


    @Test
    public void testGetLastName() {
        kerry.setLastName("space");
        String expectedLastName = "space";
        String actualLastName = kerry.getLastName();
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertNotEquals("one",actualLastName);
    }


    @Test
    public void testGetEmail() {
        kerry.setEmail("kerry34@gmail.com");
        String expectedEmail = "kerry34@gmail.com";
        String actualEmail = kerry.getEmail();
        Assert.assertEquals(expectedEmail, actualEmail);
        Assert.assertNotEquals("one33@gmail.com", actualEmail);
    }


    @Test
    public void testGetSummary() {
        //"id:"+id+" "+"name:"+firstName+" "+lastName+" "+"email"+email
        String expectedSummary = "id:10 name:kerry space email:kerryspace@gmail.com";
        String actualSummary = kerry.getSummary();
        Assert.assertEquals(expectedSummary, actualSummary);
        Assert.assertNotEquals("adasdfnawdnawoidaw sad", actualSummary);
    }
}