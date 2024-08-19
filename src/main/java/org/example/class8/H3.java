package org.example.class8;
/*
Create a method that will print whether given
String is palindrome or not.
 */
public class H3 {
    public static void main(String[] args) {

       String s= "mom"; //mom
        H3 obj=new H3();
        obj.checkPalindrome("Car");

    }

    void checkPalindrome(String originalStr){

        StringBuilder sb=new StringBuilder(originalStr);
        String reversedStr=sb.reverse().toString();
        if(originalStr.equals(reversedStr)){
            System.out.println("This String is a palindrome");
        }else {
            System.out.println("This String is not a palindrome");
        }


    }
}
