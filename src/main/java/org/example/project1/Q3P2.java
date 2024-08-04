package org.example.project1;
/*
Create a 2D array of integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.

 */
public class Q3P2 {
    public static void main(String[] args) {

        int[][] numbers={
                {10,20,30},
                {2, 5, 10,20,10,10,55},
                {3, 5},
                {25,45,66,50}
        };


        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }

            }

        }
        

    }
}
