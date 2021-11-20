package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckSquareArrayTest {

    @Test
    public void checkArrayTrue() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3, 0}, {1, 7, 8}};
        boolean result = CheckSquareArray.checkArray(in);
        assertThat(result, is(true));
    }

    @Test
    public void checkArrayFalse() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3}, {1}};
        boolean result = CheckSquareArray.checkArray(in);
        assertThat(result, is(false));
    }
}