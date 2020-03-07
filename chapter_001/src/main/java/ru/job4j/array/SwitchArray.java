package ru.job4j.array;

public class SwitchArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        int[] rs1 = swapBorder(nums);
        for(int index = 0; index < rs1.length; index ++){
            System.out.println(rs1[index]);
        }
    }

    public static int[] swapBorder(int[] array){
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
