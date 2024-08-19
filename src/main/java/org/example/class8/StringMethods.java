package org.example.class8;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Python");
        StringBuilder reversedStr = sb.reverse();
        System.out.println(reversedStr);

        String s = new String("Syntax");
        String r = s.substring(2, 4);
        System.out.println(r);
        int index = s.indexOf('S');
        System.out.println(index);
        String newName = s.replace('x', 'Z');
        System.out.println(newName);

        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();



    }
}
