package org.example.class12;

import java.util.ArrayList;

public class E13LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coke");
        drinks.add("Mimosa");
        drinks.add("Juice");
        drinks.add("water");
        drinks.add("tequila");

       /* for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e")){
                drinks.remove(i);
                i--;
            }
        }*/
        drinks.forEach(y-> System.out.println(y));
        drinks.removeIf( x->x.contains("e"));
        System.out.println(drinks);
        // Break till 1:53
    }
}
