package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SweetPriceTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SweetPrice.out(10);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "10" + ln +
                        "20" + ln +
                        "30" + ln +
                        "40" + ln +
                        "50" + ln
        ));
    }

}