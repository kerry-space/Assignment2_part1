package org.example.model;

import org.example.model.AppRole;


import  static org.junit.jupiter.api.Assertions.*;

import org.example.model.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

public class AppUserTest {
    AppUser objectTest;

    @BeforeEach
    public void setup(){
        objectTest = new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20));
    }

    @Test
    public void setObjectTest_succcessfully_instantiate(){
        assertEquals("kerry", objectTest.getUsername());
        assertEquals("love12", objectTest.getPassword());
        assertEquals(AppRole.ROLE_APP_USER, objectTest.getRole());
        assertEquals(true, objectTest.getActive());
        assertEquals(LocalDate.of(2023,10,20), objectTest.getRegister());
    }

    @Test
    public void test_throws_IllegalArgumentException_on_null_username() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                AppUser test = new AppUser(null, "apswsword", AppRole.ROLE_APP_ADMIN, false, LocalDate.of(2024, 1, 1));

            }
        });

        //same with short version of it
        assertThrows(IllegalArgumentException.class, () -> new AppUser(null, "apswsword", AppRole.ROLE_APP_ADMIN, false, LocalDate.of(2024, 1, 1)));
    }

    @Test
    public void setPassword_null_throw_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> objectTest.setPassword(null));
    }


    @Test
    public void ObjectTest_equalTrue(){
        AppUser expected = new AppUser("kerry","love12", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20));
        assertEquals(expected, objectTest);
    }

    @Test
    public void ObjectTest_equalFalse(){
        AppUser expected = new AppUser("one","on1", AppRole.ROLE_APP_USER,true, LocalDate.of(2023, 10, 20));
        assertNotEquals(expected, objectTest);
    }
}
