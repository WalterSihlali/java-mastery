package com.amigoscode.dataStructures;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(500);
        numbers.add(1500);
        numbers.add(5500);
        numbers.add(7500);
//        numbers.add("hello");
//        numbers.add(new Point(10,10));
//        numbers.add('A');

//        numbers.remove(2);
        numbers.add(1,-1);
        System.out.println(numbers.contains(80));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
//        numbers.clear();

        System.out.println(numbers);

        for(Object number : numbers) {
            System.out.println(number);
        }

        System.out.println();
        numbers.forEach(System.out::println);

    }
}
