package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMAx1To2then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
}