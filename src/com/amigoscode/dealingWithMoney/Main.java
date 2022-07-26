package com.amigoscode.dealingWithMoney;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
       /*
        System.out.println("Double problem of precision for double or Double");
        double numberOne = 0.02;
        double numberTwo = 0.03;
        double result = numberTwo - numberOne;
        System.out.println(result);
        */


        BigDecimal numberOne = new  BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);

        /*
        double a = 1;
        double b = 2;
        System.out.println(a <=b);
        */

        System.out.println(numberOne.compareTo(numberTwo));


        if (numberOne.compareTo(numberTwo) == -1) {

        }


    }
}
