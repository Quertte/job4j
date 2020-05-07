package ITVDN;

import java.util.Scanner;

/**
 * Является ли число степенью двойки
 */

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));

        //Способ в main
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        // 128 - 1000 0000
        // &
        // 127 - 0111 1111
        //     - 0000 0000 OK
        if((num & (num - 1)) == 0) {
            System.out.println(num + " является степенью 2");
        } else {
            System.out.println(num + " не является степенью 2");
        }

    }


    /**
     * Способ через метод
     * @param value
     * @return
     */
    public static boolean isPowerOfTwo(int value){
        return Integer.bitCount(value) == 1;
    }
}
