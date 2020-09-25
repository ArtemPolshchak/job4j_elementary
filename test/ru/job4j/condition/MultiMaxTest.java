package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 2, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenSecondMmax() {
        int result = MultiMax.max(3, 8, 4);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(3, 6, 9);
        assertThat(result, is(9));
    }
}