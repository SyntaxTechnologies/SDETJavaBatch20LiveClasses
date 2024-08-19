package org.example.class7;

public class E8String {
    public static void main(String[] args) {

     String str="sfFnmaklDFHDF12398XZ4D3894!@#!@EE#";
        System.out.println(str.replaceAll("[A-K]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[0-9a-z]",""));
        System.out.println(str.replaceAll("[0-9a-zA-K]",""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

    }
}
