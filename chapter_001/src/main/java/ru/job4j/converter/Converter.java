package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed1);
        int in2 = 5;
        int excepted2 = 350;
        int out2 = euroToRuble(in2);
        boolean passed2 = excepted2 == out2;
        System.out.println("5 euro are 350. Test result : " + passed2);
        int in3 = 5;
        int excepted3 = 300;
        int out3 = dollarToRuble(in3);
        boolean passed3 = excepted3 == out3;
        System.out.println("5 dollars are 300. Test result : " + passed3);
        /**
         * Это задание прошлой задачи.
         */
        /*int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles = " + dollar + " dollars");
        int ruble = Converter.euroToRuble(5);
        System.out.println("5 euro = " + ruble + " rubbles" );
        int ruble1 = Converter.dollarToRuble(5);
        System.out.println("5 dollars = " + ruble1 + " rubbles ");*/
    }

    public static int rubleToEuro(int value) {
        int rs1 = value / 70;
        return rs1;
    }

    public static int rubleToDollar(int value) {
        int rs1 = value / 60;
        return rs1;
    }

    public static int euroToRuble(int value) {
        int rs1 = 70 * value;
        return rs1;
    }

    public static int dollarToRuble(int value) {
        int rs1 = 60 * value;
        return rs1;
    }


}
