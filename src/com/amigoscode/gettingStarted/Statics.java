package com.amigoscode.gettingStarted;

public class Statics {

    public static final String BRAND = "amigoscode";
    public static final String BEERS;

    static {
        BEERS = "Lite";
    }

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person bob = new Person("Bob");
        System.out.println(Person.createdPeople);
        System.out.println(alex.name);
        System.out.println(bob.name);
    }



    static class Person {
        static int createdPeople = 0;
        String name;
        Person(String name) {
            this.name = name;
            createdPeople++;
        }
    }
}
