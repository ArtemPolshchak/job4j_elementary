package javarush.fourLvl;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class task04task0426Test {
    @Test
    public void whenNegativeEvenNumber() {
        String res = task04task0426.checkNum(-2);
        String expect = "отрицательное четное число";
        Assert.assertThat(expect, is(res));
    }

  @Test
    public void whenNegativeOddNumber() {
      String res = task04task0426.checkNum(-3);
      String expect = "отрицательное нечетное число";
      Assert.assertThat(expect, is(res));
    }


    @Test
    public void whenPositiveOddNumber() {
    String res = task04task0426.checkNum(5);
      String expect = "положительное нечетное число";
      Assert.assertThat(expect, is(res));
    }

    @Test
    public void whenZero() {
    String res = task04task0426.checkNum(0);
      String expect = "ноль";
      Assert.assertThat(expect, is(res));
    }
    @Test
    public void whenPositiveEvenNumber() {
        String res = task04task0426.checkNum(6);
        String expect = "положительное четное число";
        Assert.assertThat(expect, is(res));
    }
}