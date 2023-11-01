package com.examples.oops;

public class Test {
    public static void main(String[] args) {
        System.out.println("VALUE OF PI: "+Calculator.VALUE_OF_PI);
        //Object Initialization
        // RHS - Object Creation - new keyword
        // LHS - name of the object, reference class
        /*
        Calculator calcObj = new Calculator();

        System.out.println("ADD: "+calcObj.add());
        System.out.println("SUBTRACT: "+calcObj.subtract());
        System.out.println("MULTIPLY: "+calcObj.multiply());
        System.out.println("DIVIDE: "+calcObj.divide());*/

        AdvancedCalculator advancedCalculatorObj = new AdvancedCalculator(98, 7, 60);

        System.out.println("ADD: "+advancedCalculatorObj.add());
        System.out.println("SUBTRACT: "+advancedCalculatorObj.subtract());
        System.out.println("MULTIPLY: "+advancedCalculatorObj.multiply());
        System.out.println("DIVIDE: "+advancedCalculatorObj.divide());

        System.out.println("SINE: "+advancedCalculatorObj.sinValue());
        System.out.println("COSINE: "+advancedCalculatorObj.cosinValue());
        System.out.println("TANGENT: "+advancedCalculatorObj.tanValue());

        BankInterface bankObj = new ICICIBank();

    }
}

/*
1. Inheritance          -   Inheriting the base class properties in a sub class
2. Data Abstraction     -   Hiding the implementation details
3. Data Encapsulation   -   Enclosing all related components into one single entity
4. Polymorphism         -   Existing in many forms
                        -   Overloading
                        -   Overriding
 */
