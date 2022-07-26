package com.amigoscode.oopConcepts;

public class Dog1 implements AnimalInterface{

    private String breed;
    private String name;


    public Dog1(String name, String breed) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

}
