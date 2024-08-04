package org.example.project1;
/*
Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.

 */
public class Q2 {
    public static void main(String[] args) {
        int [] numbers={10,25,32,55,80,100};
        int sum=0;
        for(int n:numbers){
            // we take the previous value of sum add the current number from the
            //array and store the updated results back in the sum variable
           sum=sum+n; //sum+=n;
        }
        System.out.println(sum);
    }
}
