package com.examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studentRollnoMap = new HashMap<>();

        studentRollnoMap.put(1, "Java");
        studentRollnoMap.put(2, "Spring");
        studentRollnoMap.put(3, "Sql");
        studentRollnoMap.put(4, "Maven");
        studentRollnoMap.put(5, "Database");
        studentRollnoMap.put(6, "Git");

        studentRollnoMap.put(2, "Springboot");

        System.out.println("VALUE OF KEY 2: "+studentRollnoMap.get(2));

        Set<Integer> keySet = studentRollnoMap.keySet();

        keySet.forEach(key->{
            System.out.println("Key - "+key+" with Value - "+studentRollnoMap.get(key));
        });


    }
}
