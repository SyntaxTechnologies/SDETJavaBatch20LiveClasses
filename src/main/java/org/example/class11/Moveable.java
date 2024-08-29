package org.example.class11;

import org.openqa.selenium.edge.EdgeDriver;

public  interface Moveable {

    String PLANET_NAME="Earth";

    void move();


}

class Car implements Moveable{

    @Override
    public void move() {
        System.out.println("Cars can move");
    }
}

class Horse implements Moveable{

    @Override
    public void move() {
        System.out.println("Horses can move");
    }
}
class MoveableTester{
    public static void main(String[] args) {
        EdgeDriver e=new EdgeDriver();
        e.get("https://facebook.com");
    }
}
