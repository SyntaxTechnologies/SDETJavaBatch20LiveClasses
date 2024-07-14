package org.example.class3;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your gender (M->Male F->Female O-> Others)");
        char gender=scan.next().charAt(0);
        System.out.println(gender);


    }
}
