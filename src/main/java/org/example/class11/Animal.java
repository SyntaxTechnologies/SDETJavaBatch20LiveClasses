package org.example.class11;

public abstract class Animal {

    private String name;

    Animal(){

    }

    Animal(String name){
        this.name=name;
    }
    void printInfo(){
        System.out.println("Animal Info");
    }
    // fahad
    public abstract void speak();
}

class Dog extends Animal{

    // Mod
    @Override
    public void speak() {
        System.out.println("Wuff Wuff");
    }
}
class Cat extends Animal{
    // Maria
    @Override
    public void speak() {
        System.out.println("Meow Meow ...");
    }
}


