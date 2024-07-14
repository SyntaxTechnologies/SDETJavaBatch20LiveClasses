package org.example.class3;

public class E1NestedIfElse {

    public static void main(String[] args) {

        boolean mainDoor = false;
        boolean room1 = true;

        //Ctrl+Alt+l Cmd+opt+l
        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room1 is closed");

            }
        } else {
            System.out.println("main Door is closed");
        }

    }
}
