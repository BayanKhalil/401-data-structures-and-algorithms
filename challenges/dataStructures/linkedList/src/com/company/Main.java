package com.company;

public class Main {


    public static void main(String[] args) {

        linkedList myList = new linkedList();

        myList.insert(65);
        myList.insert(43);
        myList.insert(88);
        myList.insert(57);
        myList.insert(90);
        myList.insert(100);


        System.out.println(myList.toString());
        System.out.println(myList.includes(22));


    }
}