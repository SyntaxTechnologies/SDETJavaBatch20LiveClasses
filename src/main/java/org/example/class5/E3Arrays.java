package org.example.class5;

public class E3Arrays {
    public static void main(String[] args) {


        int[] numbers={10,20,30,45,85,55};

        for (int i = 0; i <numbers.length ; i=i+2) {
            System.out.println(numbers[i]);
        }

        System.out.println("********");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);
        }




    }
}
