package org.example.class12;

import java.util.HashMap;

public class E15Maps {
    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("Apple",12.5);
        items.put("Banana",6.8);
        items.put("Orange",8.0);
        items.put("Mango",5.5);
        items.put("Kiwi",5.5);

        System.out.println(items.size());
        System.out.println(items.get("Mango"));
        System.out.println(items.containsKey("Mango"));
        System.out.println(items.containsValue(80.0));
        System.out.println(items.remove("Kiwi"));
        System.out.println(items);
    }
}
