package org.example.class13;

import java.util.*;

public class E7Maps {
    public static void main(String[] args) {

        List<Double> number=new ArrayList<>();
        number.add(10.0);
        number.add(15.5);
        number.add(10.0);
        System.out.println(number);

        HashMap<String,Integer> prices=new HashMap<>();
        prices.put("Apple",15);
        prices.put("Laptop",600);
        prices.put("Phone",1500);

        HashMap<String,Integer> fruit=new HashMap<>();
        fruit.put("Apple",15);
        fruit.put("Banana",5);
        fruit.put("Kiwi",12);

        List<HashMap<String,Integer>> mapList=new ArrayList<>();
        mapList.add(prices);
        mapList.add(fruit);
        System.out.println(mapList);
     //   List<ArrayList<LinkedList<Map<List<String>>>>>
        // Break till 08:51




    }


}
