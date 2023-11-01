package com.examples.java8;

public class SecondImpl implements AddInterface{
    @Override
    public void add(int a, int b) {
        System.out.println("INPUT A: "+a);
        System.out.println("INPUT B: "+b);
        System.out.println("RESULT: "+(a+b));
    }
}
