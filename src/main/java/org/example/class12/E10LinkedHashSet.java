package org.example.class12;

import java.util.LinkedHashSet;

public class E10LinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(100);
        numbers.add(10);
        System.out.println(numbers);
    }
}
