package org.example.class4;

import java.util.Scanner;

public class E11loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please Enter a Number");
            number = scanner.nextInt();
        } while (number > 10);
    }
}
