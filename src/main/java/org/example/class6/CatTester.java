package org.example.class6;

public class CatTester {
    public static void main(String[] args) {
        // Creating the object from a clas
        Cat c1=new Cat();
        c1.name="simba";
        c1.age=8;
        c1.breed="Persian";
        c1.weight=10;

        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.breed);
        // calling a method
        c1.speak();
        c1.sleep();

        Cat c2=new Cat();
        c2.name="Garfield";
        c2.breed="Main coon";
        c2.color="Black";
        c2.weight=45;
        c2.eat();
        c2.sleep();


    }
}
