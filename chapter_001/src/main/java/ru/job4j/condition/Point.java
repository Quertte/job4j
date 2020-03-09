package ru.job4j.condition;

public class Point {

    public static void main(String[] args) {
        double first = Point.distance(5, 2, 7, 6);
        System.out.println("result (5, 2) to (7,6) " + first);
        double second = Point.distance(6, 3, 8, 9);
        System.out.println("result (6, 3) to (8,9) " + second);
        double third = Point.distance(3, 12, 6, 16);
        System.out.println("result (3, 12) to (6,16) " + third);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rs1;
    }
}
