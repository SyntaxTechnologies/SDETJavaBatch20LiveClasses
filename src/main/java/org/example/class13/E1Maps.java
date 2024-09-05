package org.example.class13;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Apple",12.5);
        items.put("Banana",6.8);
        items.put("Orange",8.0);
        items.put("Mango",5.5);
        items.put("Kiwi",8.2);
        items.put("Mango",10.5);

     //   items.forEach(( k, v)-> System.out.println(k+" "+v));
        items.forEach(( k, v)-> {
           if(v>8){
               System.out.println(k+" "+v);
           }

        });


    }
}
