package org.example.class12;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        System.out.println(numbers.size());
        System.out.println(numbers.contains(30));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        // Break till 11:51
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.remove(1));
        System.out.println(numbers);

    }
}
