package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3to2Then3(){
        int result = Max.max(3,2);
        assertThat(result,is(3));
    }

    @Test
    public void whenTheNumbersAreEqual(){
        int result = Max.max(7,7);
        assertThat(result,is(7));
    }
}
