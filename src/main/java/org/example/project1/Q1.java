package org.example.project1;
/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
 */
public class Q1 {
    public static void main(String[] args) {
        int[] temps={90,105,45,88,100,110,98};
        int largest=temps[0]; // we are initially assuming that the first number in the array is largest
        int smallest=temps[0]; //we are initially assuming that the first number in the array is smallest
        for (int i = 0; i < temps.length; i++) {
           if(temps[i]>largest){
               // if we find something even larger as compared to what we initially assumed
               // we update our assumption
             largest=  temps[i];
           }

           if(temps[i]<smallest){
               smallest=temps[i];
           }
        }
        System.out.println(largest);
        System.out.println(smallest);



    }

}
