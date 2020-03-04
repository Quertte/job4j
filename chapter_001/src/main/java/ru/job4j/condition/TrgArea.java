package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        double rs1 = TrgArea.area(2,2,2);
        System.out.println("area (2,2,2) = " + rs1);
    }

    public static double area(double a, double b, double c){
        /**
         * Сделал двумя вариантами.
         * 1) Вынес полуперимметр в отдельную переменную
         * 2) Просто переписал формулу.(Закомментировано)
         */
        double p = (a + b + c) / 2;
        //double rs1 = Math.sqrt((a+b+c)/2 * ((a + b + c)/ 2 - a) * ((a+b+c) / 2 - b ) * ((a + b +c) / 2 - c));
        double rs1 = Math.sqrt(p * (p-a) *(p - b) * (p - c));
        return rs1;
    }
}
