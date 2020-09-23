package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;

        int exepted = 40;

        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(exepted, rsl);
    }

    @Test
     public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        int exepted = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(exepted, rsl);

    }
    
    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;

        int exepted = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(exepted, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;

        int exepted = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(exepted, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int exepted = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(exepted, rsl);
    }
}