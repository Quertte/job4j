package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Triangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist(){
        boolean result = Triangle.exist(2.0,2.0,2.0);
        assertThat(result,is(true));
    }

    @Test
    public void whenNoExist(){
        boolean result = Triangle.exist(4.0,2.0,7.0);
        assertThat(result,is(false));
    }
}
