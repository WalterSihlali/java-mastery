package com.amigoscode.gettingStarted;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a= 100;
        System.out.println("a = " + a + " b =  "+ b );
        System.out.println("Hello World!");


        Person alex = new Person("Alex");
        Person mirriam =  alex;
        System.out.println("Before changing alex");
        System.out.println(alex.name + " "+ mirriam.name);

        alex.name = "Alexander";

        System.out.println("After changing alex");
        System.out.println(alex.name + " "+ mirriam.name);
    }

    static class Person {
        String name;

        Person(String name){
            this.name = name;
        }

    }
}
