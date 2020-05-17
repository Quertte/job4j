package ITVDN;

import java.util.Arrays;

/**
 * Отсортировать массив по возрастанию
 */

public class Sort {

    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        System.out.println(Arrays.toString(sort(numbers)));


    }

    public static int[] sort(int[] numbers){
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
           /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами*/
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }
}
