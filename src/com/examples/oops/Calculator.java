package com.examples.oops;

public abstract class Calculator {
    //properties - class variables - instance variables
    double firstNumber;
    double secondNumber;

    public final static double VALUE_OF_PI = 3.14;

    //Constructor
    public Calculator(){
        System.out.println("CALCULATOR CONSTRUCTOR");
        firstNumber = 45;
        secondNumber = 56;
    }
    //Constructor Overloading
    public Calculator(double firstNumber, double secondNumber)
    {
        System.out.println("PARAMETERIZED CALCULATOR CONSTRUCTOR");
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    //method - overloading
    // Occurs in the same class
    // method signatures are different
    public double add(){
        return firstNumber + secondNumber;
    }

    protected double add(double thirdNumber){// PUBLIC, PRIVATE and PROTECTED
        return firstNumber + secondNumber + thirdNumber;
    }


    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

    public abstract double divide();
}
