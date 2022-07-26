package com.amigoscode.nullsAndOptionals;

import java.util.Optional;

public class NullPointers {

    public static void main(String[] args) {
        String brand = null;

        if(brand != null) {
            System.out.println(brand);
        } {
            System.out.println("If statement Brand is null");
        }


       // avoid using try catch to handle null pointer exception
        try{
            System.out.println(brand.toUpperCase());
        } catch (NullPointerException ex) {
            System.out.println("Try catch Brand is null");
        }



//        Optional.of(brand);
        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElse("Brand is null");

        System.out.println(theBrand);


    }


}
