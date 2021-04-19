package com.works;

public class MainSingleton {


    public static void main(String[] args) {

        DB db = DB.getDB();
        db.doSomething("deneme");



        //if you try to create wiith new key it dosent allow you, you have to create with getDB static method
        //DB db1 = new DB();

        //lets create more than one DB object and see the reference and where it's pointing
        //we wanna be sure that, we dosent create a new object
        DB db1 = DB.getDB();
        DB db2 = DB.getDB();
        DB db3 = DB.getDB();
        DB db4 = DB.getDB();
        DB db5 = DB.getDB();

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
        System.out.println(db4);
        System.out.println(db5);

        //the output is
        /*
        com.works.DB@13221655
        com.works.DB@13221655
        com.works.DB@13221655
        com.works.DB@13221655
        com.works.DB@13221655
         */


    }



}
