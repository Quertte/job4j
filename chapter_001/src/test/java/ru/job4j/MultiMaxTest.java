package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.MultiMax;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(4,2,3);
        assertThat(result,is(4));
    }

    @Test
    public void whenThirdMax(){
        MultiMax check = new MultiMax();
        int result = check.max(2,5,7);
        assertThat(result,is(7));
    }

    @Test
    public void whenNoMax(){
        MultiMax check = new MultiMax();
        int result = check.max(4,4,4);
        assertThat(result,is(4));
    }
}
