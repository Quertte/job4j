package ru.job4j;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {1, 5, 3, 4, 2, 6, 7, 8};
        int[] rs1 = SwitchArray.swap(input, 1, 4);
        assertThat(rs1, is(expect));
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {10, 20, 30, 40};
        int[] expect = {10, 20, 40, 30};
        int[] rs1 = SwitchArray.swap(input, 2, 3);
        assertThat(rs1, is(expect));
    }
}
