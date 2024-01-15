package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        IntegerList integerList = new IntegerListImpl();
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);

        Integer[] nums = integerList.toArray();
        System.out.println(Arrays.toString(nums));

    }
}