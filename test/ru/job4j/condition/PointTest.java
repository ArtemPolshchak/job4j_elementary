package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

   @Test
    public void when04to24then2() {
        int expected = 2;

       Point a = new Point(0, 4);
       Point b = new Point(2, 4);
       double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
     public void when84to88then4() {
        int expected = 4;

        Point a = new Point(8, 4);
        Point b = new Point(8, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenooooo() {
        int expect = 2;
        Point a = new Point(0, 0, 4);
        Point b = new Point(0, 2, 4);
        double out = a.distance3d(b);

        Assert.assertEquals(expect, out, 0.01);

    }
}

