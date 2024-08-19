package org.example.class8;

public class PrinterTester {
    public static void main(String[] args) {

        Printer p=new Printer();
        p.greet();
        p.printWord("Java");
        p.printWord("python");

        p.checkDiscount(15,2000,'F');

        String str=new String("java");

        System.out.println(str.charAt(3));
        System.out.println(str.length());


    }
}
