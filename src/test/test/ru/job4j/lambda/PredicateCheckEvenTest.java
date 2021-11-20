package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author User on 08.10.2021.
 * @project job4j_elementary_1
 */
public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }

}