package ru.job4j;

import org.junit.Test;
import ru.job4j.array.Check;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenTrueWithEvenAmountOfElements(){
        boolean[] input = new boolean[]{false,false,false,false};
        boolean result = Check.mono(input);
        assertThat(result,is(true));
    }

    @Test
    public void whenDataNotMonoByFalseThenFalseWithEvenAmountOfElements(){
        boolean[] input = new boolean[]{false,true,false,false};
        boolean result = Check.mono(input);
        assertThat(result,is(false));
    }
}
