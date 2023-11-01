package com.examples.oops;

public class AdvancedCalculator extends Calculator{

    public AdvancedCalculator(){
        System.out.println("ADVANCED CALCULATOR CONSTRUCTOR");
        angle = 45;
    }

    public AdvancedCalculator(double firstNumber, double secondNumber, double angle){
        super(firstNumber, secondNumber);
        System.out.println("ADVANCED CLASS PARAMETERIZED CONSTRUCTOR");
        this.angle = angle;
    }

    double angle;

    public double sinValue(){
        return Math.sin(angle);
    }

    public double cosinValue(){
        return Math.cos(angle);
    }

    public double tanValue(){
        return Math.tan(angle);
    }

    public double divide(){
        if(secondNumber == 0){
            System.out.println("DIVIDE BY ZERO IS NOT APPLICABLE");
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
