package com.examples.core;

import com.examples.oops.Calculator;

public class VariablesDemo {

    public static void main(String[] args) {

        //Variable initialization
        int firstNumber = 25, secondNumber = 0;

        //Arithematic operators + - * / %
        double result = firstNumber + secondNumber;
        System.out.println("ADD RESULT: "+ result);

        //Type casting
        try {
            result = firstNumber / secondNumber;
            System.out.println("DIVIDE RESULT: " + result);

        }catch(Exception ex){
            //TO DO
            System.out.println("EXCEPTION RAISED: "+ex.getLocalizedMessage());
        }

        result = firstNumber - secondNumber;
        System.out.println("SUBTRACT RESULT: "+ result);

        result = firstNumber * secondNumber;
        System.out.println("MULTIPLY RESULT: "+ result);
    }
}
