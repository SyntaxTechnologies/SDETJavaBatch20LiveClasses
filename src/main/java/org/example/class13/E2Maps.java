package org.example.class13;

import java.util.HashMap;

public class E2Maps {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Apple",12.5);
        items.put("Banana",6.8);
        items.put("Orange",8.0);
        items.put("Mango",5.5);
        items.put("Kiwi",8.2);
        items.put("Mango",10.5);

     //   items.forEach(( k, v)-> System.out.println(k+" "+v));
       final double[] sum=new double[1];

        items.forEach(( k, v)-> {
           if(v>8){
               sum[0]=sum[0]+v;
           }

        });
        System.out.println(sum[0]);


    }
}
