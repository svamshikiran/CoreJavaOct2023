package com.examples.oops;
 // Annotation
public interface BankInterface {

    public static final double RATE_OF_INTEREST = 3.5;

    public void createAccount();

    public double getAccountBalance(String accountNumber);

    static void printStatement(){

    }

    default void loanAccount(){
        System.out.println("DEFAULT IMPLEMENTATION");
    }
}
