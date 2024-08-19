package org.example.class8;

public class Calculator {


    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    void printSum(int a,int b){
        System.out.println(a+b);
    }
    void sumArr(int[] numbers){
        int sum=0;
        for (int n:numbers){
            sum+=n;
        }
        System.out.println(sum);
    }

}
