package com.works;

public class DB {

    private static DB instance;

    //we make the constructor private so noone can create with new key
    private DB() {
    }

    //we make this method private static so that we can access it globally in out whole project
    public static DB getDB(){
        if(instance == null){
            instance = new DB();
        }

        return instance;
    }

    //some method
    public void doSomething(String something){
        System.out.println("is it working"+something);
    }

}
