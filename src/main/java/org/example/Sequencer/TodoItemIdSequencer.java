package org.example.Sequencer;

public class TodoItemIdSequencer {
    //filed
    private static int currentId;

    //methods
    public static int nextId(){
        ++currentId;
        return currentId;
    }

    public static int getCurrentId(){
        return currentId;
    }
    public static void setCurrentId(int currentId){
        currentId = currentId;

    }
}
