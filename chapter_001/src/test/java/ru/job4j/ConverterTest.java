package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;


public class ConverterTest {

    @Test
    public void rubleToEuro(){
        int in = 140;
        int excepted = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(excepted,out);
    }

    @Test
    public void rubleToDollar(){
        int in = 180;
        int excepted = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(excepted,out);
    }
}
