package org.example.class15;

import java.io.IOException;

public class E6Exception {
    public static void main(String[] args) throws IOException {

        System.out.println(1);
        try{
            System.out.println(2);
           // System.out.println(10/0);
            //int [] arr=new int[-5];
            String name="java";
            name.charAt(50);
            System.out.println(3);

        }catch (ArithmeticException ae){
            System.out.println(4);
        }catch (NegativeArraySizeException n){
            System.out.println(5);
        }finally {
            System.out.println("Important line");
            System.out.println("Important line");
            System.out.println("Important line");
        }



    }
}
