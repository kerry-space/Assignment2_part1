package org.example.dao;

import org.example.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO{
   //Field
    List<AppUser> appUserList;

    //Constructor
    public AppUserDAOCollection(){
        //initialing ones call AppUserDaoCollection class
        appUserList = new ArrayList<>();
    }

    //Override methods implements interface
    @Override
    public AppUser persist(AppUser appUser) {
        if(appUser == null) throw new IllegalArgumentException("appUser is null");
        appUserList.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if(username == null) throw new IllegalArgumentException("username is null");
        for (AppUser appUser: appUserList){
            if(appUser.getUsername().equalsIgnoreCase(username)){
                return appUser;
            }
        }
        return null;
    }

    @Override
    public ArrayList<AppUser> findAll() {
        //convert our list to arrayList and return arrayList
        ArrayList<AppUser> arraylist = new ArrayList<>(appUserList);
        return arraylist;
    }

    @Override
    public void remove(String username) {
        if(username == null) throw new IllegalArgumentException("username is null");
        for(AppUser appUser : appUserList){
            if(appUser.getUsername().equalsIgnoreCase(username)){
                appUserList.remove(appUser);
            }
        }
    }
}
