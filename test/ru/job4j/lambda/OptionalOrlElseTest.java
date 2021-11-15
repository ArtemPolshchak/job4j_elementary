package ru.job4j.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author User on 11.10.2021.
 * @project job4j_elementary_1
 */
public class OptionalOrlElseTest {

    @Test
    public void test() {
        assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }

}