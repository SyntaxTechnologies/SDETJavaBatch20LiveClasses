package org.example.class7;

public class E10String {
    public static void main(String[] args) {


        String str = "I find it very interesting. its very helpful. its easy";
        String[] words = str.split("[.]");
        System.out.println(words.length);
        System.out.println(words[0]);


    }
}
