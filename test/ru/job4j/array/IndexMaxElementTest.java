package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IndexMaxElementTest {

    @Test
    public void getIndexMaxIs4() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 4;
        int rsl = IndexMaxElement.getIndexMax(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getIndexMaxIs0() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 0;
        int rsl = IndexMaxElement.getIndexMax(in);
        assertThat(rsl, is(expected));
    }
}