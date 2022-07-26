package com.amigoscode.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("James"));
        queue.add(new Person("Jabu"));
        queue.add(new Person("Spha"));

        System.out.println(queue);
        System.out.println();
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

        queue.forEach(person -> System.out.println(person.name));

        //FIFO

    }


    static class Person {

        String name;


        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
