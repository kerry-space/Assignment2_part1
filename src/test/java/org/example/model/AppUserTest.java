package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    AppUser testObj;

    @BeforeEach
    public void setup(){
        testObj = new AppUser("kerry","loveone",AppRole.ROLE_APP_ADMIN);
    }


    @Test
    @DisplayName("test appUser object")
    public  void TestObj_succsfully_instantiated(){
        Assertions.assertEquals("kerry", testObj.getUsername());
    }

}