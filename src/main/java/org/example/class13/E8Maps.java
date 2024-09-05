package org.example.class13;

import org.example.class6.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E8Maps {
    public static void main(String[] args) {


        Cat d = new Cat();
        List<Cat> catList=new ArrayList<>();
        catList.add(d);

        Map<Integer,List<Cat>> map=new HashMap<>();
        map.put(1,catList);




    }


}
