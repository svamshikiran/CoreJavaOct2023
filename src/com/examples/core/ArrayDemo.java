package com.examples.core;

public class ArrayDemo {
    public static void main(String[] args) {
        int marks[] = new int[6];

        int marksTwo[] = {12, 34, 54, 98, 1, 84};

        int sum = 0;
        int position = marksTwo.length-1;

        while(position >= 0){
            sum = sum + marksTwo[position];
            position--;//position = position - 1;
        }

        System.out.println("SUM OF ELEMENTS IN THE ARRAY: "+sum);


    }
}
