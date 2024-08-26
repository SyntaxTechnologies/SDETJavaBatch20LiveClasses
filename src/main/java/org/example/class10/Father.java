package org.example.class10;

public class Father {
    String name="Adam";
    void printName(){
        System.out.println(name);
    }
}

class Son extends Father{
    String name="Jack";

    void printName(){
        String name="John";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    void printInfo(){
        super.printName();
    }

}

