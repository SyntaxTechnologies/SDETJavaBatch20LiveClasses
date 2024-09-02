package org.example.class12;

import java.util.HashSet;

public class E9HashSet {
    public static void main(String[] args) {

        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(100);
        numbers.add(10);
        System.out.println(numbers);
    }
}
