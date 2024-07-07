package org.example.class2;

public class E16ElseIfStatement {
    public static void main(String[] args) {

        int age=10;

        if(age>60){
            System.out.println("You get 60% discount");
        } else if (age>40) {
            System.out.println("You get 40% discount");
        } else if (age>20) {
            System.out.println("You get 20% discount");
        }else{
            System.out.println("Sorry you ar not eligible");
        }

    }
}
