package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 178.0;
        double excepted = 89.7;
        double out = Fit.manWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 170.0;
        double excepted = 69.0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
