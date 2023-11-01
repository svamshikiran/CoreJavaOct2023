package com.examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(123);
        linkedList.add(345);
        linkedList.add(431);
        linkedList.add(12);
        linkedList.add(0, 98);
        linkedList.add(3, 5);

        linkedList.remove(2);

        int max = linkedList.get(0);
        /*
        arrayList.forEach(element-> {
            if(max < element){
                max = element;
            }
            System.out.println("ELEMENT: "+element);
        });*/

        for(int element : linkedList){
            if(max < element)
                max = element;
        }

        System.out.println("MAX ELEMENT OF THE ARRAY: "+max);
    }
}
