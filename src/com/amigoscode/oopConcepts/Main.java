package com.amigoscode.oopConcepts;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iPhone 2 mini", 10000, true);
        // Encapsulation
        // Bad since we access data direct and not through methods
        // iphone.price = 20.0;
        // iphone.isWaterResistant
        // iphone.model

        // Correct
        iphone.setPrice(12000.0);
        System.out.println(iphone.getPrice());

        System.out.println();
        System.out.println("Inheritance");

        Animal dog = new Dog("Stwhathwa", "German Shepard");
        System.out.println(dog);

        System.out.println();
        System.out.println("Abstraction");

        System.out.println("new Animal() - this is now incorrect as abstract javaClasses cannot be instantiated");
        Animal cat = new Cat("rosie");
        dog.makeSound();
        cat.makeSound();

        System.out.println();
        System.out.println("Polymorphism");
        System.out.println("A"+"B");
        System.out.println(1 + 2);
        dog.makeSound();
        cat.makeSound();

        System.out.println();
        System.out.println("Interfaces");
        AnimalInterface dog1 = new Dog1("Mpilo","Africanis");
        AnimalInterface cat1 = new Cat1( "Persian cat");

        System.out.println(dog1);
        System.out.println(cat1.getName());
        cat1.makeSound();
        dog1.makeSound();

        System.out.println();
        System.out.println("Method overloading");
        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1,3));
        System.out.println(superMath.add(1,2,3));

    }
}
