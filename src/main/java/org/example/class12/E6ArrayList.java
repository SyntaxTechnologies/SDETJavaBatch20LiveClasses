package org.example.class12;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Mango");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("Onion");
        vegetables.add("Tomato");
        vegetables.add("broccoli");

        ArrayList<String> grocery=new ArrayList<>();
        grocery.addAll(fruit);
        grocery.addAll(vegetables);
        System.out.println(grocery);






    }
}
