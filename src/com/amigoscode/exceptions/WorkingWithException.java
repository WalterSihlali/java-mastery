package com.amigoscode.exceptions;

public class WorkingWithException {

    public static void main(String[] args) {
        String brand = null;

        try {
            System.out.println(brand.length());

        } catch (NullPointerException ex) {
            System.out.println("Brand is null " + ex);
        }
    }
}
