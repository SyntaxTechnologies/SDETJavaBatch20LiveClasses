package org.example.class5;

public class E13D2Arrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30},
                {55,20,35},
                {90,58,62}
        };

        // break till 2:04

        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();

        }

    }
}
