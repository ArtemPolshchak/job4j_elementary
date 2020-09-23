package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}