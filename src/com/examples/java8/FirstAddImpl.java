package com.examples.java8;

public class FirstAddImpl implements AddInterface{
    @Override
    public void add(int a, int b) {
        System.out.println("RESULT"+ (a+b));
    }
}
