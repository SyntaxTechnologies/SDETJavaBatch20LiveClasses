package org.example.class3;

public class E10LogicalNot {
    public static void main(String[] args) {

        String isCoffeeShopOpen="currentHour";
        if (!isCoffeeShopOpen.equals("currentHour")) {
            System.out.println("The coffee shop is closed. Come back tomorrow!");
        } else {
            System.out.println("The coffee shop is open. Welcome!");
        }

        if (isCoffeeShopOpen.equals("currentHour")) {
            System.out.println("The coffee shop is open. Welcome!");
        } else {
            System.out.println("The coffee shop is closed. Come back tomorrow!");

        }

    }    }

