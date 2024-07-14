package org.example.class3;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        // we are creating the object of the Scanner class
        // it is required to use the code from a class
        Scanner scanner = new Scanner(System.in);
        // Asking the user to enter their age
        System.out.println("Please Enter your age");
        // Calling the nextInt method and storing the age in age variable
        int age = scanner.nextInt();
        //printing the info back on the console
        System.out.println("Your age is " + age);
        scanner.close();
    }
}
