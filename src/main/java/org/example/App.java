package org.example;

import org.example.dao.AppUserDAOCollection;
import org.example.dao.PersonDAOCollection;
import org.example.dao.TOdoItemDAOCollection;
import org.example.dao.TodoItemTaskDAOCollection;
import org.example.model.*;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //installing new object of DAO storages
        AppUserDAOCollection storage = new AppUserDAOCollection();
        PersonDAOCollection personStorage = new PersonDAOCollection();
        TOdoItemDAOCollection tOdoItemStorage = new TOdoItemDAOCollection();
        TodoItemTaskDAOCollection todoItemTaskStorage = new TodoItemTaskDAOCollection();

        //installing new object of AppUser
        AppUser userData1 = new AppUser("kerry-space","lovesandra", AppRole.ROLE_APP_USER,true,LocalDate.of(2023, 1,10));
        AppUser userData2 = new AppUser("sandy-hoop","loveOne",AppRole.ROLE_APP_USER, true,LocalDate.of(2023, 1,10));



        //installing new object of Person
        Person personData1 = new Person("kerry","jalal","kerry@gmail.com");
        Person personData2 = new Person("sandra", "love", "sandra@gmail.com");

        //set credentials to person object add to list storage to appUser
        personData1.setCredentials( storage.persist(userData1));
        personData2.setCredentials(storage.persist(userData2));

        //add to the list person-storage
        personStorage.persist(personData1);
        personStorage.persist(personData2);


        System.out.println(personStorage.findAll());
        System.out.println("------------------------------------------------------------");

        //installing new object of TodoItem
        TodoItem todoItemData1 = new TodoItem("App", "Build community app for space lover", LocalDate.of(2023,3,3),personData1);
        TodoItem todoItemData2 = new TodoItem("Dapps", "building decentralise finance app",LocalDate.of(2023,3,3),personData2);
        tOdoItemStorage.persist(todoItemData1);
        tOdoItemStorage.persist(todoItemData2);

        todoItemData1.setCreator(personData1);
        todoItemData2.setCreator(personData2);

        System.out.println("------------------------------------------------------------");

        //initialing new object of  todoItemTask
        TodoItemTask todoItemTaskData1 = new TodoItemTask();
        TodoItemTask todoItemTaskData2 = new TodoItemTask();
        //add to storage the todoItemTask
        todoItemTaskStorage.persist(todoItemTaskData1);
        todoItemTaskStorage.persist(todoItemTaskData2);

        //assigned person to todoItem
        todoItemTaskData1.setAssignee(personData1);
        todoItemTaskData2.setAssignee(personData2);

        //set todoItem
        todoItemTaskData1.setTodoItem(todoItemData1);
        todoItemTaskData2.setTodoItem(todoItemData2);


        System.out.println("-----------------------------------------------------------");
        System.out.println(todoItemTaskStorage.findAll());



    }
}
