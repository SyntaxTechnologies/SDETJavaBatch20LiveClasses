package org.example.project1;
/*
Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.


 */
public class Q4 {
    public static void main(String[] args) {
        int[][] numbers={
                {10,20,30},
                {2, 5, 10,20,10,10,55},
                {3, 5},
                {25,45,66,50}
        };
        int oddSum=0;
        int evenSum=0;

        for(int[] row:numbers){
            for(int n:row){
                if(n%2==0){
                    evenSum+=n;
                }else {
                    oddSum+=n;
                }
            }
            System.out.println(oddSum);
            System.out.println(evenSum);
        }


        

    }
}
