package ru.job4j.condition;

public class Max {

    public static void main(String[] args) {
        System.out.println(max(8, 7));
    }

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
