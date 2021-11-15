package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class InitialsTest {
    @Test
    public void test() {
        assertEquals("Иванов И.И.", Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
        assertEquals("Григорьев И.Н.", Initials.convert(new String[] {"Григорьев", "Игроь", "Николаевич"}));
    }

}