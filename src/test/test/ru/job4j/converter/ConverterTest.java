package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;


import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140rblThen2Euro() {
        int in = 140;
        int exepted = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(exepted, out);
    }

    @Test
    public void whenConvert180rblThen3Dlr() {
        int in = 180;
        int exepted = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(exepted, out);
    }
}