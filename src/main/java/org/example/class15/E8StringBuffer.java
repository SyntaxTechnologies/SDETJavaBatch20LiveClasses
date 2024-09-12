package org.example.class15;

import java.util.ArrayList;

public class E8StringBuffer {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(50);
        numbers.add(700);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
/*
      Iterator<Integer> iterator=  numbers.iterator();
      while (iterator.hasNext()){

          if(iterator.next()>40){
              iterator.remove();
          }
      }*/
        numbers.removeIf(x->x>40);

        System.out.println(numbers);

    }
}
