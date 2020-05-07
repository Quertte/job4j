package ITVDN;

/**
 * 1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив целочисленных элементов и
 * возвращает инвертированный массив (элементы массива в обратном порядке).
 *
 *
 * 2) Создайте метод int []  subArray(int [] array, int index, int count).
 * Метод возвращает часть полученного в качестве аргумента массива, начиная с
 * позиции указанной в аргументе index, размерностью, которая соответствует значению аргумента count.
 * Если аргумент count содержит значение больше чем количество элементов,
 * которые входят в выбираемую часть исходного массива (от указанного индекса index,
 * до индекса последнего элемента), то при формировании нового массива размерностью в count,
 * заполните единицами те элементы, которые не были скопированы из исходного массива.
 *
 * 3)Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
 * на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов. Создайте метод,
 * который принимает два аргумента, первый аргумент – типа int [] array, второй аргумент – типа int value.
 * В теле метода реализуйте возможность добавления второго аргумента метода в массив по индексу 0,
 * при этом длина нового массива, должна увеличиться на 1 элемент, а элементы получаемого массива
 * в качестве первого аргумента должны скопироваться в новый массив начиная с индекса 1.
 */

public class ReversedArray {

    public static void main(String[] args) {
        int[] tmp;
        int[] tmp2;

        // Вызываем метод myReverse. Заполняем массив целочисленными значениями
        tmp = ReversedArray.myReverse(new int[]{1, 5, 3, 6, 8, 9});

        // Метод возвращает часть полученного в качестве аргумента массива
        // начиная с позиции, указанной в index, в данном случае 2
        // и размерностью аргумента count, в данном случае - 10
        tmp2 = ReversedArray.subArray(new int[]{1, 5, 9, 5, 4, 12, 45, 78}, 2, 10);

        // Выводим на экран массив tmp
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i] + " ");
        }

        // Выводим на экран массив tmp2
        System.out.println();
        for (int i = 0; i < tmp2.length; i++) {
            System.out.print(tmp2[i] + " ");
        }
        System.out.println();

        // В массив arr заносим следующие значения:
        int[] arr = insert(new int[]{7, 2, 9, 6}, 22);

        // Выводим на экран массив arr
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Создаем метод myReverse
    public static int[] myReverse(int[] array) {
        // Массив целочисленных элементов
        int[] tmp = new int[array.length];
        // Инвертируем массив
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            tmp[j] = array[i];
        }
        // Возвращаем переменную tmp
        return tmp;
    }

    // Создаем метод, который принимает 3 значения:
    // Массив, и переменные: index, count
    public static int[] subArray(int[] array, int index, int count) {
        int[] tmp = new int[count];
        boolean full = false;
        for (int i = index, j = 0; i < count; i++, j++) {
            if (i <= ((array.length - index) + 1) && !full) {
                tmp[j] = array[i];
            } else {
                // Это условие выполняется для того, что бы оптимизировать позицию индекса в цикле
                if (!full) {
                    full = true;
                    i -= index;
                }
                tmp[j] = 1;
            }
        }
        return tmp;
    }



    // Создаем метод insert, в качестве аргумента принимает:
    // массив array и целочисленную переменную value
    public static int[] insert(int[] array, int value) {
        // Расшряем массив на 1 элемент
        int[] tmp = new int[array.length + 1];

        for (int i = 0; i < tmp.length; i++) {
            // Так как мы расширили на 1 элемент массив, то этот элемент принял значение 0
            // Делаем проверку, является ли это число 0
            if (i == 0) {
                // Присваиваем массиву наше добавленое число, в данном случае - 22
                // и заполняем массив tmp числами 7, 2, 9, 6.
                // На выходе массив выглядит так: 22, 7, 2, 9, 6
                tmp[i] = value;
                continue;
            }
            // i - 1 - нужно для что бы порядок индексации начинался с 0
            tmp[i] = array[i - 1];
        }
        return tmp;
    }
}
