package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        //name has private access in com.driver RwOnly
        //obj.name = "Phani"
        obj.setName("Veera Phani");
       // System.out.println(obj.getName());
        obj.getName();

    }
}