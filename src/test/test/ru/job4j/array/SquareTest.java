package ru.job4j.array;

import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SquareTest {

    @Test
    public void wnehBound3Then014() {
        int bound = 3;
        int[] rsl = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rsl, is(expect));
    }

    @Test
    public  void whenBound5Then014912() {
        int bound = 5;
        int[] rsl = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(rsl, is(expected));
    }
}