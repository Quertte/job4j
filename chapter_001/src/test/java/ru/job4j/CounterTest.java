package ru.job4j;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rs1 = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rs1, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTenToThirtyThenTwoHundredTwenty() {
        int rs1 = Counter.sumByEven(10, 30);
        int expected = 220;
        assertThat(rs1, is(expected));
    }

}
