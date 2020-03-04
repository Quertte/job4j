package ru.job4j.condition;

public class Triangle {

    public static void main(String[] args) {
        System.out.println(Triangle.exist(4, 4, 7));
    }

    public static boolean exist(double ab, double ac, double bc) {

        return ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
    }
}
