package org.example.project1;
/*
Create a 2D array of integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.

 */
public class Q3 {
    public static void main(String[] args) {

        int[][] numbers={
                {10,20,30},
                {2, 5, 10},
                {3, 5, 8},
                {25,45,66,50}
        };

        System.out.println(numbers.length );
        // when we use one pairs of [] we pull entire one d arrays
        int [] arr1=numbers[0];
        // when we use two pairs of [][] we pull individual elements
       int number= numbers[0][0];
        // break till 11:50
        System.out.println(numbers[3].length);

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                
            }
        }
        

    }
}
