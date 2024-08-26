package org.example.class10;

public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;

    public Animal(){

    }
    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    void speak(){
        System.out.println("Animals speak");
    }
}

class Cat extends Animal{
    Cat(String name, String color, int age, double weight){
        super(name, color, age, weight);
    }

    @Override
    void speak() {
        System.out.println("Meow Meow");
    }
}