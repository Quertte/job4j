package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void square() {
        int inP = 6;
        int inK = 2;
        double excepted = 2.0;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
