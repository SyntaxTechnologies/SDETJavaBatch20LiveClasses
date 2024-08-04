package org.example.project1;
/*
Write a java program to check whether a given number is prime or not?

 */
public class Q6 {
    public static void main(String[] args) {

        int number=2;
        boolean isPrime=true;

        for (int i = 2; i < number; i++) {

            if(number%i==0){
                isPrime=false;
            }
        }

        System.out.println(isPrime);

    }
}
