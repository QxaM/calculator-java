package com.kodilla.kalkulaotr;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }


    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println("Result of adding numbers 1 and 5 is: " + calculator.add(1, 5));
        System.out.println("Result of subtracting numbers 5 and 2 is: " + calculator.subtract(5, 2);
    }
}
