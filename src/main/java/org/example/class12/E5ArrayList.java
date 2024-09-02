package org.example.class12;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.set(1,100));
        System.out.println(numbers);



    }
}
