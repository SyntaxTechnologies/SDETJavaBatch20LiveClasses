package org.example.class3;

public class E9LogicalNot {
    public static void main(String[] args) {

        String country="Iran";
        // only specify the few countries and use NOT operator
        if(!country.equals("Iran")&&!country.equals("korea")){
            System.out.println("You can visit USA");
        }

        // same results but here we might have to write all the name of the countries
        if(country.equals("UK")||country.equals("Spain")||country.equals("Canda")||country.equals("Germany")){
            System.out.println("You can visit USA");
        }
    }
}
