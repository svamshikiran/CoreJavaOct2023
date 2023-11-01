package com.examples.core;

public class LoopDemo {

    public static void main(String[] args) {

        int startNumber = 1;

        //repeats until the condition is false
        while(startNumber <= 1000){
            System.out.println(startNumber);
            startNumber = startNumber + 1;
        }
    }
}
