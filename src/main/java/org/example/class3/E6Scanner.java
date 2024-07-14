package org.example.class3;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence=scan.nextLine();
        System.out.println("You entered "+sentence);

    }
}
