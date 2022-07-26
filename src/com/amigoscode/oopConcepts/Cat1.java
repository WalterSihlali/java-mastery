package com.amigoscode.oopConcepts;

public class Cat1 implements AnimalInterface {
    private String name;

    public Cat1(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("miaow miaow");
    }

    @Override
    public String getName() {
        return this.name;
    }


}
