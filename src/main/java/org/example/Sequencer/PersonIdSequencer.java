package org.example.Sequencer;

public  class PersonIdSequencer {
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
