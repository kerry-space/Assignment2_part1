package org.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {
    Person objectTest;

    @BeforeEach
    public void setup(){
        objectTest = new Person("kerry", "space","kerry@gmail.com",new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20)));
    }

    @Test
    public void setObjectTest_succcessfully_instantiate(){
        assertEquals("kerry", objectTest.getFirstName());
        assertEquals("space", objectTest.getLastName());
        assertEquals("kerry@gmail.com", objectTest.getEmail());
    }

    @Test
    public void test_throws_IllegalArgumentException_on_null_firstname() {
        assertThrows(IllegalArgumentException.class, () -> new Person(null, "peace", "one@gmail.com",new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20))));

    }

    @Test
    public void test_throws_IllegalArgumentException_on_null_lastname(){
        assertThrows(IllegalArgumentException.class, () -> new Person("kerry", null, "one@gmail.com",new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20))));
    }

    @Test
    public void test_throws_IllegalArugmentExpection_on_null_email(){
        assertThrows(IllegalArgumentException.class, () -> new Person("kerry", "space", null,new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20))));
    }

    @Test
    public void test_object_equalTrue(){
        Person expected = new Person("kerry", "space","kerry@gmail.com",new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20)));
        assertEquals(expected, objectTest);
    }

    @Test
    public void test_object_equalFalse(){
        Person expected = new Person("one","space", "one@gmail",new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20)));
        assertNotEquals(expected, objectTest);
    }


}
