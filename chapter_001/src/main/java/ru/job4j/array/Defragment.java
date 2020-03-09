package ru.job4j.array;

public class Defragment {

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length -1 ; index++) {
            if (array[index] == null) {
                int point = index + 1;
                while (point < array.length) {
                    if (array[point] != null) {
                        swap(array,index,point);
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}


    /*public static String[] compress(String[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        swap(array, i, j);
                        break;
                    }
                }
            }
        }
        return array;
    }*/