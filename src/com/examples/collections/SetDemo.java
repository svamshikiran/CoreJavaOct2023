package com.examples.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(45);
        hashSet.add(23);
        hashSet.add(98);
        hashSet.add(65);


        hashSet.add(98);//duplicate entries will be ignored

        hashSet.remove(1);

        hashSet.forEach(element -> {
            System.out.println("ELEMENT: " + element);
        });

        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("JAVA");
        treeSet.add("spring");
        treeSet.add("MAVEN");
        treeSet.add("SQL");
        treeSet.add("65");

        treeSet.forEach(element -> {
            System.out.println("ORDERED ELEMENT: " + element);
        });
    }
}
