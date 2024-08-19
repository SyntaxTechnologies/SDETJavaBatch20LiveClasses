package org.example.class7;

public class E3String {
    public static void main(String[] args) {
        // count and print how many times the
        // letter a has appeared in this string
        String s="asbjdahjfbahjf";

        int count=0;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
