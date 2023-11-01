package com.examples.collections;

import com.examples.oops.AdvancedCalculator;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(123);
        arrayList.add(345);
        arrayList.add(431);
        arrayList.add(12);
        arrayList.add(0, 98);
        arrayList.add(3, 5);

        arrayList.remove(2);

        int max = arrayList.get(0);
        /*
        arrayList.forEach(element-> {
            if(max < element){
                max = element;
            }
            System.out.println("ELEMENT: "+element);
        });*/

        for(int element : arrayList){
            if(max < element)
                max = element;
        }

        System.out.println("MAX ELEMENT OF THE ARRAY: "+max);
    }
}
