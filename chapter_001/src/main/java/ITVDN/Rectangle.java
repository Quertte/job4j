package ITVDN;

import java.util.Scanner;

/**
 * Используя IntelliJ IDEA, создайте класс Rectangle.
 * Создайте две целочисленные переменные и задайте им некоторые значения. Применяя технику вложенных циклов, нарисуйте
 * прямоугольник из звездочек. Используйте значения ранее созданных переменных для указания высоты и ширины прямоугольника
 */

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int x = 0; x < num2; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
