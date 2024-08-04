package org.example.project1;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Q7 {
    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13 21 34

        int n=10;
        int first=0;
        int second=1;
        int next=0;

        System.out.print("0 1 ");
        for (int i = 0; i < n-2; i++) {
            next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}
