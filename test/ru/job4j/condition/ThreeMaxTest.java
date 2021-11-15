package ru.job4j.condition;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int result = ThreeMax.max(10, 5, 4);
        assertThat(result, is(10));
    }

    @Test
    public void secondMax() {
        int result = ThreeMax.max(5, 10, 3);
        assertThat(result, is(10));
    }

    @Test
    public void thirdMax() {
        int result = ThreeMax.max(5, 6, 10);
        assertThat(result, is(10));
    }

    @Test
    public void allEq() {
        int result = ThreeMax.max(100, 100, 100);
        assertThat(result, is(100));
    }

    @Test
    public void firstEqThird() {
        int result = ThreeMax.max(100, 3, 100);
        assertThat(result, is(100));
    }

    @Test
    public void secondEqThird() {
        int result = ThreeMax.max(5, 100, 100);
        assertThat(result, is(100));
    }

    @Test
    public void firstEqSecond() {
        int result = ThreeMax.max(100, 100, 12);
        assertThat(result, is(100));
    }
}