package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMAx2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
        }

    @Test
    public void whenMAx5() {
        int result = Max.max(2, 1, 3, 5);
        assertThat(result, is(5));
    }
}