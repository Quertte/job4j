package ru.job4j.calculator;

/**
 * Class Calculator для вычисления арифметических операций
 *
 * @author Andrew Nedogibchenko (a.injen90@gmail.com)
 * @version 1
 * @since 06.03.2020
 */

public class Calculator {

    /**
     * Main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
