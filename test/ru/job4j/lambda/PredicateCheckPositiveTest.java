package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author User on 08.10.2021.
 * @project job4j_elementary_1
 */
public class PredicateCheckPositiveTest {

    @Test
    public void whenPositive() {
        assertTrue(PredicateCheckPositive.check(1));
        assertFalse(PredicateCheckPositive.check(-1));
        assertFalse(PredicateCheckPositive.check(0));
    }

}