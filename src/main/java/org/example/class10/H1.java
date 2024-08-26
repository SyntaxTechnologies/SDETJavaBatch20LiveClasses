package org.example.class10;
/*
Create a method to find the minimum of two numbers.
Method will be passed two parameters and will return the minimum number.
Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5

Use separate class to test your code

 */
public class H1 {

    public int getMin(int a,int b){

        if(a<b){
            return a;
        }else {
            return b;
        }
    }

    public double getMin(double a,double b){

        if(a<b){
            return a;
        }else {
            return b;
        }
    }
}
