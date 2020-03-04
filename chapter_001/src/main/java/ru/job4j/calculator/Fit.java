package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        double man = Fit.manWeight(178.0);
        double woman = Fit.womanWeight(170.0);
        System.out.println("Идеальный вес для мужчины " + man + " кг");
        System.out.println("Идеальный вес для женщины " + woman + " кг");
    }

    public static double manWeight(double height){
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(double height){
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }
}
