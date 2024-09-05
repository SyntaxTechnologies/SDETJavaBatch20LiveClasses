package org.example.class13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Apple", 12.5);
        items.put("Banana", 6.8);
        items.put("Orange", 8.0);
        items.put("Mango", 5.5);
        items.put("Kiwi", 8.2);
        items.put("Mango", 10.5);

        Collection<Map.Entry<String, Double>> entries = items.entrySet();

        for (Map.Entry<String, Double> e : entries) {
            if(e.getKey().contains("a"))
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }


}
