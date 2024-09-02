package org.example.class12;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class E12Collections {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(50);
        numbers.add(10);
        numbers.add(100);
        numbers.add(10);
        System.out.println(numbers);

        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
        ArrayList<Integer> newNumbers=new ArrayList<>(uniqueNumbers);
        System.out.println(newNumbers);
    }
}
