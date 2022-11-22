package org.example.dao;

import org.example.model.Person;

import java.util.ArrayList;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    ArrayList<Person> findAll();
    void remove(int id);
}
