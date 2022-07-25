package com.amigoscode.gettingStarted;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
       int x =  incrementNumber(0);
        System.out.println(x);

        print(x);

        LocalDate now = getCurrentDate();
        System.out.println(now);

        LocalDate pastDay = gettDateMinusDays(3);
        System.out.println(pastDay);

        LocalDate futureDay = gettDatePlusDays(3);
        System.out.println(futureDay);
    }

    private static int incrementNumber(int value  ){
        return value + 1;
    }


    private static void print(int value) {
        System.out.println(value);
    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    private static LocalDate gettDateMinusDays(int v){
        return LocalDate.now().minusDays(v);
    }

    private static LocalDate gettDatePlusDays(int v){
        return LocalDate.now().plusDays(v);
    }
}
