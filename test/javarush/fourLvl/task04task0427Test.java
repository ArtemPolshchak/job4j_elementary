package javarush.fourLvl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class task04task0427Test {

    @Test
    public void checkIfNumEvenOneNumber() {
        String expect = "четное однозначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(2);
        Assert.assertEquals(expect, str);

    }
    @Test
    public void checkIfOddOneNumber() {
        String expect = "нечетное однозначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(3);
        Assert.assertEquals(expect, str);
    }
    @Test
    public void checkIfNumEvenTwoNumber() {
        String expect = "четное двузначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(22);
        Assert.assertEquals(expect, str);
    }
    @Test
    public void checkIfOddTwoNumber() {
        String expect = "нечетное двузначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(31);
        Assert.assertEquals(expect, str);
    }
    @Test
    public void checkIfNumEvenThreeNumber() {
        String expect = "четное трехзначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(222);
        Assert.assertEquals(expect, str);
    }
    @Test
    public void checkIfOddThreeNumber() {
        String expect = "нечетное трехзначное число";
        String str = task04task0427.checkIfNumEvenOrOdd(225);
        Assert.assertEquals(expect, str);
    }
}