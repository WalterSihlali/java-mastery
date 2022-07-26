package com.amigoscode.dateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Australia/West"));
        LocalDateTime nowLocalTime = LocalDateTime.now(ZoneId.of("Australia/West"));
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();
//        System.out.println(now);
//        System.out.println(nowLocalTime);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(instant);



//        ZoneId.getAvailableZoneIds().forEach(System.out::println);


        System.out.println();
        System.out.println(nowLocalTime);
        System.out.println(LocalDateTime.now());
        LocalDate someDate = LocalDate.of(1988,
                Month.SEPTEMBER,
                1);


        System.out.println(someDate.minus(2, ChronoUnit.YEARS));
        System.out.println(someDate.isAfter(now.toLocalDate()));
        System.out.println(someDate.isBefore(now.toLocalDate()));
        System.out.println(someDate.getYear());
        System.out.println(someDate.getMonth());
        System.out.println(someDate.getDayOfWeek());







    }
}
