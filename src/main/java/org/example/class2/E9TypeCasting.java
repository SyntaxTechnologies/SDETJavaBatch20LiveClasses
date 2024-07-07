package org.example.class2;

public class E9TypeCasting {
    public static void main(String[] args) {

        short smallBox=1000;
        byte verySmallBox=(byte) smallBox;
        System.out.println(verySmallBox);

        double veryLargeBox=12.5;
        smallBox=(short) veryLargeBox;
        System.out.println(smallBox);


    }
}
