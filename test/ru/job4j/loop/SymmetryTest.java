package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(2134351);
        assertThat(check, is(false));
    }

}