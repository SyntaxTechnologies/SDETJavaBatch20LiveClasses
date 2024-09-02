package org.example.class12;

import java.util.LinkedList;

public class E8ArrayVsLinkedList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();

        LinkedList<String> names=new LinkedList<>();
        for (int i = 0; i <1000000 ; i++) {
            names.add(0,"Nikola");
        }

        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);



    }
}
