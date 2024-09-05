package org.example.class13;

import java.util.HashMap;

public class E9Maps {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Apple", 12.5);
        items.put("Banana", 6.8);
        items.put("Orange", 8.0);
        items.put("Kiwi", 8.2);
        items.put("Mango", 10.5);

      //  items.values().removeIf(v -> v > 8);
       // items.keySet().removeIf(k->k.contains("a"));
        items.entrySet().removeIf(e-> e.getKey().contains("a")||e.getValue()>12);
        System.out.println(items);


    }


}
