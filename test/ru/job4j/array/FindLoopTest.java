package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 10, 3, 4};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] input = {5, 4, 7, 2};
        int value = 2;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind1() {
        int[] input = new int[] {5, 1, 10, 2, 4, };
        int value = 1;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind8() {
        int[] input = new int[] {5, 1, 10, 2, 4, 6, 4, 7, 1, 4, 5, 10 };
        int value = 1;
        int start = 6;
        int finish = 8;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 8;
        assertThat(result, is(expect));
    }
}