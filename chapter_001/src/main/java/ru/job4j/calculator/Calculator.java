package ru.job4j.calculator;

public class Calculator {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);


        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        Calculator.plus(100,500);
        Calculator.plus(4,2);
        Calculator.plus(3,5);

    }

    public static void plus(int first,int second){
        int result = first + second;
        System.out.println(result);
    }
}
