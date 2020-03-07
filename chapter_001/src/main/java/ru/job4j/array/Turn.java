package ru.job4j.array;

import java.util.Arrays;

public class Turn {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(back(new int[]{1,2,3,4})));
    }

    public static int[] back(int[] array){
        for(int i = 0; i < array.length - i; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
