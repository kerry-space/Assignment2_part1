package org.example.dao;

import org.example.Sequencer.PersonIdSequencer;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {
    //field
    List<Person> personList;

    //constructor
    public PersonDAOCollection(){
        //initialing ones call PersonDaoCollection class
        personList = new ArrayList<>();
    }

    //Override methods implements interface
    @Override
    public Person persist(Person person) {
        if(person == null) throw new IllegalArgumentException("person is null");
        person.setId(PersonIdSequencer.nextId());
        personList.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
       if (id == 0) throw new IllegalArgumentException("id is empty");
       for (Person person : personList){
           if(person.getId() == id){
               return person;
           }
       }
       return null;
    }

    @Override
    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email is null");
        for (Person person : personList){
            if(person.getEmail().equalsIgnoreCase(email)){
                return person;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Person> findAll() {
        //convert our list to arrayList and return arrayList
        ArrayList<Person> arrayist = new ArrayList<>(personList);
        return arrayist;
    }

    @Override
    public void remove(int id) {
        if (id == 0) throw new IllegalArgumentException("id is empty");
        for (Person person : personList){
            if(person.getId() == id){
                personList.remove(person);
            }
        }
    }


}
