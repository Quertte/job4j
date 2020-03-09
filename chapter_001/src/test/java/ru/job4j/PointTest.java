package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;


public class PointTest {

    @Test
    public void distance() {
        int in1x = 5;
        int in1y = 2;
        int in2x = 7;
        int in2y = 6;
        double excepted = 4.472;
        double out = Point.distance(in1x, in1y, in2x, in2y);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
