package com.examples.core;

public class CharsAndStrings {
    public static void main(String[] args) {
        //local variables
        char ch = 'A';
        char chSymbol = '*';

        String strVar = "Java Programming";

        int numberOfOccurances = 0;//camel case
        int position = 0;

        while(position < strVar.length()){
            if(ch == strVar.charAt(position)){
                numberOfOccurances++;
            }
            position++;
        }

        System.out.println("Number of a's present: "+numberOfOccurances);
    }
}
