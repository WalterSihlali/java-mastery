package com.amigoscode.dataStructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 20;
        numbers[2] = 500;

        int[] nums = {1,20,500,4};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));

        nums[3] = 700;
        System.out.println(Arrays.toString(nums));


        System.out.println("Numbers");

        for(int number : numbers) {
            System.out.println(number);
        }

    }
}
