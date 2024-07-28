package org.example.class5;

public class E6Arrays {
    public static void main(String[] args) {
        // print found if the number 0 is present in the array

        int[] numbers = {10, 20, 30, 45,50,20,4,5,0,8,9,666};


        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]==10){
                System.out.println("Found");
                break;
            }
        }

        // Break till 11:51

    }
}
