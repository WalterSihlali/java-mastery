package com.amigoscode.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hannah");
        map.put(2,"Sphah");
        map.put(3,"Sam");
        map.put(3,"Simo");


        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.keySet());


        System.out.println();
        for(int key : map.keySet()) {
            System.out.println(map.get(key));
        }



        System.out.println();
        map.forEach( (k, v) ->{
            System.out.println(k +"  - "+v);
        });


        String defaultValue = map.getOrDefault(10, "oops..... this is default value");
        System.out.println(defaultValue);

    }
}
