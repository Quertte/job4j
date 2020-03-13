package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{6, 2, 1, 3, 5})));
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
