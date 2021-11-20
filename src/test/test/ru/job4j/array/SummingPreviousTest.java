package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousTest {
    @Test
    public void test3() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPrevious.calculate(1, 2, 3));

    }
    @Test
    public void test6() {
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPrevious.calculate(1, 2, 4));

    }
    @Test
    public void test12() {

        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPrevious.calculate(1, 2, 5));
    }

}