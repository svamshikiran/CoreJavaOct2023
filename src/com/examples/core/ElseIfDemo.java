package com.examples.core;

public class ElseIfDemo {

    public static void main(String[] args) {
        //Assignment Operator =
        int number = 20;
        //Conditional Operator < <= > >= == !=
        if( number <= 10){
            System.out.println("NUMBER LESS THAN OR EQUAL TO 10");
        }
        else{
            System.out.println("NUMBER GREATER THAN 10");
        }

        int givenNumber = 24;

        int reminder = givenNumber % 2;
        System.out.println("REMINDER VALUE: "+reminder);
        if( reminder == 0 )
            System.out.println("GIVEN NUMBER IS EVEN");
        else{
            System.out.println("GIVEN NUMBER IS ODD");
        }




    }
}
