package com.amigoscode.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {

    public static void main(String[] args) throws Exception {
        // Checked exception - compile time
        try {
            System.out.println("Checked exception");
            FileInputStream inputStream = new FileInputStream("src//com/amigoscode/exceptions/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        // Unchecked exception - run time
        try {
            double result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException | NumberFormatException| NullPointerException e) {
            System.out.println("Cannot divide a number by zero");

        } finally {
            System.out.println("cleaning up ...");
        }


        performDivision(1,0);

    }

    static double performDivision(double a,double b) throws Exception {
        if(b == 0) {
            throw new MyException("Cannot divide by 0");
        }

        return a/b;
    }
    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
