package org.example.class12;

import java.util.ArrayList;

public class E2ListDemo {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        ArrayList<String> arrayListb=new ArrayList<>();
        arrayListb.add("java");

    }


    static void addNumbers(int a,int b){
        System.out.println(a+b);
    }
    static void addNumbers(double a,double b){
        System.out.println(a+b);
    }
}
