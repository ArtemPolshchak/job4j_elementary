package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author User on 08.10.2021.
 * @project job4j_elementary_1
 */
public class PredicateCheckEvenAndPositiveTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertTrue(PredicateCheckEvenAndPositive.check(4));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
        assertFalse(PredicateCheckEvenAndPositive.check(0));
        assertFalse(PredicateCheckEvenAndPositive.check(-1));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
    }

}