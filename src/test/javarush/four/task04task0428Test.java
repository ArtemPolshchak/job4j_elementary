package javarush.four;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class task04task0428Test {
    @Test
    public void oneEvenNum(){
        int expect = 1;
        int res = Task04task0428.countEvenNum(-1, 0, 1);
        Assert.assertEquals(expect, res);
    }

    @Test
    public void twoEvenNum(){
        int expect = 2;
        int res = Task04task0428.countEvenNum(0, 6, 234);
        Assert.assertEquals(expect, res);
    }

    @Test
    public void threeEvenNum(){
        int expect = 3;
        int res = Task04task0428.countEvenNum(5, 12, 34);
        Assert.assertEquals(expect, res);
    }

    @Test
    public void zeroEvenNum(){
        int expect = 0;
        int res = Task04task0428.countEvenNum(-1, 0, 0);
        Assert.assertEquals(expect, res);
    }



}